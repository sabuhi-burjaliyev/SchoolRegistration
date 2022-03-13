/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.util.Scanner;

/**
 *
 * @author Plague
 */
public class Input {

    public static String getText(String title) {
        System.out.println(title);
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        return answer;

    }

    public static int getNumber(String title) {
        System.out.println(title);
        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();
        return answer;
    }
}
