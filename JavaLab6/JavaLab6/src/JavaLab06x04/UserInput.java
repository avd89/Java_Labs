/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaLab06x04;


import java.util.Scanner;

/**
 * this is input method for the 6.4 unit
 * 28.03.2018
 * Group POIS1709v1
 * @author Aleksei Dubrovskii
 * 
 */
public class UserInput {

    private static Scanner scanner = new Scanner(System.in);

    public static long input(String msg) {

        System.out.print(msg);
        return scanner.nextLong();

    }   

}
