/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalab05x03;

import java.util.Scanner;

/**
 *
 * @author alex
 */
public class Complete {
    public static boolean complete(String question) {
        System.out.println(question + "\nYes or No");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next().toLowerCase();
        return answer.endsWith("yes");
    }
    
}
