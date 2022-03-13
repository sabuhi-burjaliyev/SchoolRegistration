/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import config.Config;
import interServices.ShowAllStudentsServiceInter;

/**
 *
 * @author Plague
 */
public class ShowAllStudentsService implements ShowAllStudentsServiceInter{
    @Override
    public void process(){
        int counter=0;
        while(true){
            if(Config.students[counter]==null){
                break;
            }
            ++counter;
        }
        
        for(int i=0;i<counter;i++){
            System.out.println(Config.students[i].turnString());
        }
    }
}
