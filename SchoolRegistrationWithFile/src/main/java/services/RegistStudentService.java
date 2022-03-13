/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import bean.Student;
import config.Config;
import interServices.RegistStudentServiceInter;
import util.Input;

/**
 *
 * @author Plague
 */
public class RegistStudentService implements RegistStudentServiceInter {

    @Override
    public void process() {
        String name = Input.getText("Enter student's name : ");
        String surname = Input.getText("Enter student's surname : ");
        Student s = new Student(name, surname);
        int counter = 0;
        while (true) {
            if (Config.students[counter] == null) {
                break;
            }
            ++counter;
        }
        Config.students[counter] = s;

    }
}
