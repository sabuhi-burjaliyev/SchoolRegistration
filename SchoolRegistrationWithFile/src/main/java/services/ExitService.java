/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import interServices.ExitServiceInter;

/**
 *
 * @author Plague
 */
public class ExitService implements ExitServiceInter{
    @Override
    public void process(){
        System.out.println("Exiting from system ... ");
        System.exit(0);
    }
}
