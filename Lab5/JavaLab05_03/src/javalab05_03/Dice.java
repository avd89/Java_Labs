/*
 * Напишите программу, которая бы эмулировала игру «Dice» (игра в кости). Суть
 * игры заключается в броске двух шестигранных кубиков (костей) и подсчёта
 * общей суммы очков, которые выпали на первой и второй костей.
 */
package javalab05_03;
import java.util.Random;
/**
 *
 * This is a program that emulate dice game
 * 14.03.2018
 * Group POIS1709v1
 * @author Aleksei Dubrovskii
 */
public class Dice {
    public static int getDiceNumber(){
        
        int diceNumber;
        Random random = new Random();
        
        diceNumber = random.nextInt(6)+1;
        
                
        return diceNumber;
                
    }
    
    public static int getTwoDiceNumber(){
        
        int dice1;
        int dice2;
        int dice12;
        
        dice1 = getDiceNumber();
        dice2 = getDiceNumber();
        dice12 = dice1 + dice2;
        
        return dice12;
        
    }
    
}
