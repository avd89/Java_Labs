/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaLab06x04;

/**
 * найти все простые делители заданного натурального числа
 * 
 * this is the main method of the program that determine prime dividers of a number 
 * 28.03.2018
 * Group POIS1709v1
 * @author Aleksei Dubrovskii
 */
public class JavaLab06x04x06 {

    public static void main(String[] args) {

        while (true) {

            long number = UserInput.input("Enter the number ");
            View.print("The simple dividers list of number " + number + " is given below");
            JavaLabLogic06x04.showNumberPrimeDividers(JavaLabLogic06x04.getNumberPrimeDividers(number)); //find prime dividers and output them in row 

            if (!Complete.complete("Do you want to continue?")) {
                break;
            }

        }

    }
    
}


