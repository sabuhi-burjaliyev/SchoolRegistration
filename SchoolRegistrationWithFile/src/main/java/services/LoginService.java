/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import interServices.LoginServiceInter;
import main.Menu;
import util.Input;

/**
 *
 * @author Plague
 */
public class LoginService implements LoginServiceInter {

    @Override    
    public void process() {
        String username = Input.getText("Enter your username : ");
        String password = Input.getText("Enter your password : ");
        if (username.equals("Sabuhi") && password.equals("mrx123")) {
            Menu.loggedIn = true;
            System.out.println("Logged in successfully");
        }else{
            System.out.println("Username or password is wrong !");
        }
    }
}
