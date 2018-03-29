/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaLab06x05;

import java.util.Scanner;

/**
 *
 * this is the input method of the program that emulate game "Guess the number"
 * 29.03.2018
 * Group POIS1709v1
 * @author Aleksei Dubrovskii
 */
public class UserInput {
    
    private static Scanner scanner = new Scanner(System.in);

    public static int input(String msg) {

        System.out.print(msg);
        return scanner.nextInt();

    }
    
}
