/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalab05x01;



/**
 *
 * This is a part of the program that calculate dragon head and eyes quantity
 * 15.03.2018
 * Group POIS1709v1
 * @author Aleksei Dubrovskii
 */


public class DragonHead {
    public static final int FIRST_PERIOD_DRAGON_AGE = 200;
    public static final int SECOND_PERIOD_DRAGON_AGE = 300;
    public static final int FIRST_PERIOD_DRAGON_AGE_HEAD_COEFICIENT = 3;
    public static final int SECOND_PERIOD_DRAGON_AGE_HEAD_COEFICIENT = 2;
    public static final int THIRD_PERIOD_DRAGON_AGE_HEAD_COEFICIENT = 1;
    public static final int DRAGON_HEAD_EYES_QUANTITY = 2; 
    
    public static int getDragonHeadQuantity(int dragonAge){
        
        int dragonHeadQuantity = 0;
        
        if(dragonAge > SECOND_PERIOD_DRAGON_AGE){
            
            dragonHeadQuantity = dragonAge * THIRD_PERIOD_DRAGON_AGE_HEAD_COEFICIENT- SECOND_PERIOD_DRAGON_AGE * THIRD_PERIOD_DRAGON_AGE_HEAD_COEFICIENT  + FIRST_PERIOD_DRAGON_AGE * FIRST_PERIOD_DRAGON_AGE_HEAD_COEFICIENT + SECOND_PERIOD_DRAGON_AGE * SECOND_PERIOD_DRAGON_AGE_HEAD_COEFICIENT - FIRST_PERIOD_DRAGON_AGE * SECOND_PERIOD_DRAGON_AGE_HEAD_COEFICIENT;  //get dragon head quantity for more than 300 years old dragon
            
        }
        
        if(dragonAge > FIRST_PERIOD_DRAGON_AGE && dragonAge <= SECOND_PERIOD_DRAGON_AGE){
            
            dragonHeadQuantity = dragonAge * SECOND_PERIOD_DRAGON_AGE_HEAD_COEFICIENT - FIRST_PERIOD_DRAGON_AGE * SECOND_PERIOD_DRAGON_AGE_HEAD_COEFICIENT  + FIRST_PERIOD_DRAGON_AGE * FIRST_PERIOD_DRAGON_AGE_HEAD_COEFICIENT;        //get dragon head quantity for (201-300) years old dragon
                        
        }
        
        if(dragonAge>0 && dragonAge <= FIRST_PERIOD_DRAGON_AGE){                           //get dragon head quantity for less than 200 years old dragon
            
            dragonHeadQuantity = dragonAge * FIRST_PERIOD_DRAGON_AGE_HEAD_COEFICIENT;
                        
        }
        
        return dragonHeadQuantity;
    }
    
    public static int getDragonEyesQuantity(int dragonHeadQuantity){   //get dragon eyes quantity
        
        return dragonHeadQuantity * DRAGON_HEAD_EYES_QUANTITY;
                    
    }
    
    
    
    
}
