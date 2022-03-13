/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import config.Config;
import interServices.UpdateTeacherServiceInter;
import util.Input;

/**
 *
 * @author Plague
 */
public class UpdateTeacherService implements UpdateTeacherServiceInter {

    @Override
    public void process() {
        int counter = 0;
        while (true) {
            if (Config.teachers[counter] == null) {
                break;
            }
            ++counter;
        }

        for (int i = 0; i < counter; i++) {
            System.out.println((i + 1) + "." + Config.teachers[i].turnString());
        }

        int selectedTeacher = Input.getNumber("Enter teacher number you want to update : ");

        String updatedParameters = Input.getText("Enter parameters you want to update : (name,surname)");
        if (updatedParameters.contains(",")) {
            String[] parameterArray = updatedParameters.split(",");
            for (int i = 0; i < parameterArray.length; i++) {
                if (parameterArray[i].equalsIgnoreCase("name")) {
                    String newName = Input.getText("Enter new name : ");
                    Config.teachers[selectedTeacher - 1].setName(newName);
                } else if (parameterArray[i].equalsIgnoreCase("surname")) {
                    String newSurname = Input.getText("Enter new surname : ");
                    Config.teachers[selectedTeacher].setSurname(newSurname);
                }

            }
        } else if (updatedParameters.equalsIgnoreCase("name")) {
            String newName = Input.getText("Enter new name : ");
            Config.teachers[selectedTeacher - 1].setName(newName);
        } else if (updatedParameters.equalsIgnoreCase("surname")) {
            String newSurname = Input.getText("Enter new surname : ");
            Config.teachers[selectedTeacher - 1].setSurname(newSurname);
        } else {
            System.out.println("Enter valid input !!!");
        }
    }
}
