/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaLab06x04;

import java.util.Scanner;

/**
 * this is the main method of the program that catch answer 'yes'
 * 28.03.2018
 * Group POIS1709v1
 * @author Aleksei Dubrovskii
 * 
 */
public class Complete {

    public static boolean complete(String question) {
        System.out.println(question + "\nYes or No");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next().toLowerCase();
        return answer.endsWith("yes");
    }

}
