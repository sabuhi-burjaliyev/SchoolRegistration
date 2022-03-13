/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import config.Config;
import interServices.ShowAllTeachersServiceInter;

/**
 *
 * @author Plague
 */
public class ShowAllTeachersService implements ShowAllTeachersServiceInter {

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
            System.out.println(Config.teachers[i].turnString());
        }
    }
}
