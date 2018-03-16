/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_05_02;
import java.util.Random;

/**
 *
 * This is a part of the program that print random emodji (NetBeans random reaction for your code)
 * generate random emodji
 * 16.03.2018
 * Group POIS1709v1
 * @author Aleksei Dubrovskii
 */
public class MoodSensor {  // emodji array
    
  private static String[] arrayFace = {"\uD83D\uDE41","\uD83D\uDE42","\u263B","\u26D1","\uD83D\uDE04","\uD83D\uDE1A","\uD83D\uDE3C","\uD83D\uDE3D","\uD83D\uDE3F","\uD83D\uDE37","\uD83D\uDE36","\uD83D\uDE35","\uD83D\uDE34","\uD83D\uDE33","\uD83D\uDE32","\uD83D\uDE31","\uD83D\uDE30","\uD83D\uDE2F","\uD83D\uDE2E","\uD83D\uDE2D","\uD83D\uDE2C","\uD83D\uDE2B","\uD83D\uDE2A","\uD83D\uDE28"};
      
   
    public static int getRandomNumber(){   //get random number
        
        Random random = new Random();
        
        int randNumber;
        
        randNumber = random.nextInt(arrayFace.length);
        
        return randNumber;
        
    }
    
    public static String getMoodFace(){    //get random emodji
        
        String MoodFace;
        
        MoodFace = arrayFace[getRandomNumber()];
        
        return MoodFace;
        
    }
    
}
