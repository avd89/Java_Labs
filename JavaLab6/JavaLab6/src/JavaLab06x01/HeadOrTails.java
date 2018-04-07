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
    

    private static boolean RandomBoolean() {   //get random boolean
       
        return new Random().nextBoolean();
    }

    private static int ThrowCoinReturnHeadQuantity(int ThrowQuantity) {   //get random head quantity result for specified number of throws
        int HeadQuantity = 0;    //head quantity result

        for (int i = 0; i < ThrowQuantity; i++) {
            
            if (RandomBoolean()) {   //if result of throwing is true add 1 to head quantity
                HeadQuantity++;
            } 
        }
        return HeadQuantity;     //return head quantity result
    }
    
    public static void ThrowCoin(int ThrowQuantity){
        
        int HeadQuantity = ThrowCoinReturnHeadQuantity(ThrowQuantity); //get head quantity result
        
        System.out.println("Head quantity is " + HeadQuantity);   //print head quantity result
        System.out.println("Tails quantity is " + (ThrowQuantity - HeadQuantity));  //print tails quantity result  (tails =  ThrowQuantity - HeadQuantity)     
        
    }
}
