/*
 * Напишите программу, которая бы эмулировала игру «Dice» (игра в кости). Суть
 * игры заключается в броске двух шестигранных кубиков (костей) и подсчёта
 * общей суммы очков, которые выпали на первой и второй костей.
 */
package javalab05x03;
import java.util.Random;
/**
 *
 * This is a program that emulate dice game
 * 14.03.2018
 * Group POIS1709v1
 * @author Aleksei Dubrovskii
 */
public class Dice {

    public static final int MAX_DICE_VALUE = 6;

    public static int getDiceNumber() {

        return new Random().nextInt(MAX_DICE_VALUE) + 1;

    }

    public static int getTwoDiceNumber() {

        return getDiceNumber() + getDiceNumber();

    }

}
