/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import services.ExitService;
import services.LoginService;
import services.MenuService;
import services.RegistStudentService;
import services.RegistTeacherService;
import services.ShowAllStudentsService;
import services.ShowAllTeachersService;
import services.UpdateStudentService;
import services.UpdateTeacherService;
import services.WriteToFileService;
import util.Input;

/**
 *
 * @author Plague
 */
public enum Menu {
    Login(1, "Login", new LoginService()),
    RegistStudent(2, "Regist Student", new RegistStudentService()),
    RegistTeacher(3, "Regist Teacher", new RegistTeacherService()),
    ShowAllStudents(4, "Show all students", new ShowAllStudentsService()),
    ShowAllTeachers(5, "Show all teachers", new ShowAllTeachersService()),
    UpdateStudent(6, "Update Student", new UpdateStudentService()),
    UpdateTeacher(7, "Update Teacher", new UpdateTeacherService()),
    WriteToFile(8,"Write to file",new WriteToFileService()),
    ExitService(9, "Exit system", new ExitService());

    public int number;
    public String label;
    public MenuService service;
    public static boolean loggedIn = false;
    static Menu[] menus = Menu.values();

    private Menu(int number, String label, MenuService service) {
        this.number = number;
        this.label = label;
        this.service = service;
    }

    public static void menuShow() {
        if (loggedIn) {
            for (int i = 1; i < menus.length; i++) {
                System.out.println(menus[i].number + "." + menus[i].label);
            }
        } else {
            System.out.println(menus[0].number + "." + menus[0].label);
            
        }
    }

    public static void menuSelect() {
        int selectedMenu = Input.getNumber("Enter your operation : ");
        menus[selectedMenu - 1].service.process();
    }

}
