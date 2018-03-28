/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaLab06x04;

/**
 * найти количество различных цифр у заданного натурального числа
 * 
 * this is the main method of the program that get quantity of different digits of a number 
 * 28.03.2018
 * Group POIS1709v1
 * @author Aleksei Dubrovskii
 */
public class JavaLab06x04x02 {

    public static void main(String[] args) {

        while (true) {

            long number = UserInput.input("Enter your number ");
            View.print("Quantity of different digits of the number " + number + " is " + JavaLabLogic06x04.getQuantityDiferrentGigitsOfNumber(number));

            if (!Complete.complete("do you want to continue?")) {
                break;
            }

        }

    }

}
