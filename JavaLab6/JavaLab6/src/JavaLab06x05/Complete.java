/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaLab06x05;

import java.util.Scanner;

/**
 *
 * this is the logical method that return true if you answeres "yes"
 * 29.03.2018
 * Group POIS1709v1
 * @author Aleksei Dubrovskii
 */
public class Complete {
    public static boolean complete(String question) {
        System.out.println(question + "\nYes or No");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next().toLowerCase();
        return answer.endsWith("yes");
    }
    
}
