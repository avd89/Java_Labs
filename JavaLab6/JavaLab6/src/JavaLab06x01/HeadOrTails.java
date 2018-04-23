/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaLab06x01;

import java.util.Random;

/**
 * Lab 6 Базовый синтаксис языка Java. Циклические конструкции.Итерационные алгоритмы
 * 
 * Написать программу «Heads or Tails?» («Орёл или решка?»), которая бы «под-
 * брасывала» условно монету, к примеру, 1000 раз и сообщала, сколько раз вы-
 * пал орёл, а сколько – решка.
* 
 * This is a part of the program that calculate results of coin throws
 * logical methods
 * 23.03.2018
 * Group POIS1709v1
 * @author Aleksei Dubrovskii
 * v 1.0
 */
public class HeadOrTails {

    public static int throwCoinReturnHeadQuantity(int throwQuantity) {   //get random head quantity result for specified number of throws
        int headQuantity = 0;    //head quantity result
        Random random = new Random();

        for (int i = 0; i < throwQuantity; i++) {

            if (random.nextBoolean()) {   //if result of throwing is true add 1 to head quantity
                headQuantity++;
            }
        }
        return headQuantity;     //return head quantity result
    }
}
