/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab05x02;
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
    
  private static final String[] ARRAY_FACE = {"\uD83D\uDE41","\uD83D\uDE42","\u263B","\u26D1","\uD83D\uDE04","\uD83D\uDE1A","\uD83D\uDE3C","\uD83D\uDE3D","\uD83D\uDE3F","\uD83D\uDE37","\uD83D\uDE36","\uD83D\uDE35","\uD83D\uDE34","\uD83D\uDE33","\uD83D\uDE32","\uD83D\uDE31","\uD83D\uDE30","\uD83D\uDE2F","\uD83D\uDE2E","\uD83D\uDE2D","\uD83D\uDE2C","\uD83D\uDE2B","\uD83D\uDE2A","\uD83D\uDE28"};
      
   
    public static int getRandomNumber(){   //get random number                          
        
        return new Random().nextInt(ARRAY_FACE.length);              
        
    }
    
    public static String getMoodFace(){    //get random emodji               
        
        return ARRAY_FACE[getRandomNumber()];
        
    }
    
}
