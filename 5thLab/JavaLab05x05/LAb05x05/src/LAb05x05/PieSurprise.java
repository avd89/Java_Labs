/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAb05x05;

import java.util.Random;

/**
 * This is a part of the program that give you pie with random filling
 * logic methods
 * 21.03.2018
 * Group POIS1709v1
 * @author Aleksei Dubrovskii
 */
public class PieSurprise {
    
    static final String[] PIE_SURPRISES = {"cherry", "cabbage", "potatoes", "currant", "prunes"};
    
    public static int getRandomIntNumber(){
       
        return new Random().nextInt(PIE_SURPRISES.length);
    }
    
    public static String getPieSurprise(){
        
        return PIE_SURPRISES[getRandomIntNumber()];              
    }
    
}
