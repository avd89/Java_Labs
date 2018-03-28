/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaLab06x04;

/**
 * задано натуральное число, проверить, является ли оно палиндромом;
 * 
 * this is the main method of the program that determine palindrome number
 * 28.03.2018
 * Group POIS1709v1
 * @author Aleksei Dubrovskii
 */
public class JavaLab06x04x04 {

    public static void main(String[] args) {

        while (true) {
            long number = UserInput.input("Enter your number ");  //Enter the number

            JavaLabLogic06x04.checkPalindromeNumberInterface(number);  //find palindrome number

            if (!Complete.complete("Do you want to continue? ")) {   //repeated request
                break;
            }
        }

    }
    
}
