/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaLab06x04;

/**
 * найти НОД и НОК двух натуральных чисел a и b
 * 
 * this is the main method of the program that determine least common multiple and greatest common divisor of the two numbers 
 * 28.03.2018
 * Group POIS1709v1
 * @author Aleksei Dubrovskii
 */
public class JavaLab06x04x07 {

    public static void main(String[] args) {

        while (true) {

            long numberOne = UserInput.input("Enter first number ");   //enter first number
            long numberTwo = UserInput.input("Enter second number ");  //enter second number
            View.print("The least common miltiple of " + numberOne + " and " + numberTwo + " is " + JavaLabLogic06x04.getLeastCommonMultiple(numberOne, numberTwo));  //determine least common multiple of the two numbers
            View.print("The greatest common divisor of " + numberOne + " and " + numberTwo + " is " + JavaLabLogic06x04.getGreatestCommonDivisor(numberOne, numberTwo)); //determine greatest common divisor of the two numbers 

            if (!Complete.complete("Do you want to continue ? ")) {  //repeated request
                break;
            }

        }

          
    }
    
}
