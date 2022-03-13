/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import config.Config;
import interServices.WriteToFileInter;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Plague
 */
public class WriteToFileService implements WriteToFileInter {

    @Override
    public void process() {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("Students.txt", true));) {
            int counter = 0;
            while (true) {
                if (Config.students[counter] == null) {
                    break;
                }
                ++counter;
            }
            for (int i = 0; i < counter; i++) {
                bw.write((i + 1) + " " + Config.students[i].turnString() + "\n");
            }
        } catch (IOException ex) {
            System.out.println("Xeta bas verdi !");
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("Teachers.txt", true));) {
            int counter = 0;
            while (true) {
                if (Config.teachers[counter] == null) {
                    break;
                }
                ++counter;
            }
            for (int i = 0; i < counter; i++) {
                bw.write((i + 1) + " " + Config.teachers[i].turnString() + "\n");
            }
        } catch (IOException ex) {
            System.out.println("Xeta bas verdi !");
        }
    }
}
