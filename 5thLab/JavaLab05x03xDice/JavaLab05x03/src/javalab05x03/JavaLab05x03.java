/*
 * Напишите программу, которая бы эмулировала игру «Dice» (игра в кости). Суть
 * игры заключается в броске двух шестигранных кубиков (костей) и подсчёта
 * общей суммы очков, которые выпали на первой и второй костей.
 */
package javalab05x03;

import java.util.Random;

/**
 * This is a program that emulate dice game
 * 14.03.2018
 * Group POIS1709v1
 * @author Aleksei Dubrovskii
 * 
 */
public class JavaLab05x03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        while (true) {
            
            View.print("The result of dice game is " + Dice.getTwoDiceNumber() + "\n");
            
            if (!Complete.complete("Do you want to continue?")) {  //repeated request
                break;
            }
        }
    }
}
