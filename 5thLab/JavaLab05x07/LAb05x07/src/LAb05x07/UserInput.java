/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAb05x07;

import java.util.Scanner;

/**
 * This is a part of the program that write number manually
 * input method
 * 21.03.2018
 * Group POIS1709v1
 * @author Aleksei Dubrovskii
 * 
 */
public class UserInput {
    
    static Scanner scanner = new Scanner(System.in);

    public static int input(String msg) {

        System.out.print(msg);
        return scanner.nextInt();

    }
    
}
