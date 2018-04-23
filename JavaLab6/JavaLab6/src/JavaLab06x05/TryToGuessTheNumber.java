/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaLab06x05;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * there are the logical methods of the program that emulate game "Guess the number"
 * 29.03.2018
 * Group POIS1709v1
 * @author Aleksei Dubrovskii
 */
public class TryToGuessTheNumber {

    //method that emulate game "Try to guess the number"
    public static void guessTheNumber(int lowRandomNumber, int hightRandomNumber, int attemptQuantity) {
        
        int count = 0;  //attempts counter
        int enteredNumber;  //enterred number by user
        Random rand = new Random();
        
        int randNumber = rand.nextInt(hightRandomNumber - lowRandomNumber) +1;  // get random number from preset range
        Scanner scanner = new Scanner(System.in);
        
        while (true) {    //cycle that repeat attemps to quess the number untill user will guess the number or attemps will end

            
            System.out.println("Enter your number");
            enteredNumber = scanner.nextInt();  //read entered number by user

            if (randNumber > enteredNumber) {   //entered number lower that random
                System.out.println("Higher");
                count++;
            } else if (randNumber == enteredNumber) {   //user quess the number
                count++;
                View.PrintWinPhrase();
                View.print("You used " + count + " attempts");
                break;
            } else {   //entered number higher that random
                count++;
                System.out.println("Lower");
            }

            if (count == attemptQuantity) { //user use all attempts but not guess the number
                View.PrintEndPhrase();
                System.out.println("Random number was " + randNumber);
                System.out.println("You used " + count + " attempts");
                break;
            }

        }
    }

}
