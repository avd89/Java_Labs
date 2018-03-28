/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaLab06x04;

/**
 * найти наибольшую цифру натурального числа
 * 
 * this is the main method of the program that get max digit of a number
 * 28.03.2018
 * Group POIS1709v1
 * @author Aleksei Dubrovskii
 */
public class JavaLab06x04x03 {

    public static void main(String[] args) {

        while (true) {
            
            long number = UserInput.input("Enter the number ");
            
            View.print("The maximun digit of a number is " + JavaLabLogic06x04.findMaxNumberDigit(number));  //get max digit of a number
            
            if (!Complete.complete("Do you want to continue?")) {  //repeated request
                break;
            }
        }

    }
    
}
