/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaLab06x04;

/**
 * определить является ли заданное натуральное число простым;
 * 
 * this is the main method of the program that determine prime number
 * 28.03.2018
 * Group POIS1709v1
 * @author Aleksei Dubrovskii
 */
public class JavaLab06x04x05 {

    public static void main(String[] args) {

        while (true) {
            long number = UserInput.input("enter the number ");   //Enter number
            JavaLabLogic06x04.checkPrimeNumberInterface(number);  // determine prime number
           
            if (!Complete.complete("Do you want to continue? ")) { //repeated request
                break;
            }
        }
    }
    
}
