/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaLab06x05;

import JavaLab06x01.UserInput;

/**
 *
 * this is the main method of the program that emulate game "Guess the number"
 * 29.03.2018
 * Group POIS1709v1
 * @author Aleksei Dubrovskii
 */
public class JavaLab06x05 {

    public static void main(String[] args) {

        while (true) {  //repeat game untill user won't answer "yes" for the question "Do you want to continue ?" from the Complete.complete method

            int lowerRangeNumber = UserInput.input("Enter lower range number ");  //Enter random number range (lower range limit)
            int upperRangeNumber = UserInput.input("Enter upper range number ");  //Enter random number range (upper range limit)
            int attemptQuantity = UserInput.input("Enter attempt quantity ");     //Enter quantity of attempts to guess number

            TryToGuessTheNumber.guessTheNumber(lowerRangeNumber, upperRangeNumber, attemptQuantity);  // Play the game

            if (!Complete.complete("Do you want to continue ?")) {  //repeated request. If not "yes" the game is ends
                break;
            }
        }

    }

}
