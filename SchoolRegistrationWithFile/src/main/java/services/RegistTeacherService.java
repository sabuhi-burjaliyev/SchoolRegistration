/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import bean.Teacher;
import config.Config;
import interServices.RegistTeacherServiceInter;
import util.Input;

/**
 *
 * @author Plague
 */
public class RegistTeacherService implements RegistTeacherServiceInter {

    @Override
    public void process() {
        String name = Input.getText("Enter teacher's name : ");
        String surname = Input.getText("Enter teacher's surname : ");
        Teacher t = new Teacher(name, surname);
        int counter = 0;
        while (true) {
            if (Config.teachers[counter] == null) {
                break;
            }
            ++counter;
        }
        Config.teachers[counter] = t;
    }
}
