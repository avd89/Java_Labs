/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalab05_01;

/**
 *
 * This is a part of the program that calculate dragon head and eyes quantity
 * 15.03.2018
 * Group POIS1709v1
 * @author Aleksei Dubrovskii
 */
public class DragonHead {
    public static int getDragonHeadQuantity(int dragonAge){
        
        int dragonHeadQuantity;
        
        if(dragonAge>300){
            dragonHeadQuantity = (dragonAge -300)*1 + 200*3 + 100*2;  //get dragon head quantity for more than 300 years old dragon
            return dragonHeadQuantity ;
        }
        
        if(dragonAge>200 && dragonAge<=300){
            
            dragonHeadQuantity = (dragonAge -200)*2  + 200*3;        //get dragon head quantity for (201-300) years old dragon
            return dragonHeadQuantity ;
            
        }
        
        if(dragonAge>0 && dragonAge<=200){                           //get dragon head quantity for less than 200 years old dragon
            
            dragonHeadQuantity = dragonAge * 3;
            return dragonHeadQuantity ;
            
        }
        
        return 0;
    }
    
    public static int getDragonEyesQuantity(int dragonHeadQuantity){   //get dragon eyes quantity
        
        int dragonEyesQuantity = dragonHeadQuantity*2;
        
        return dragonEyesQuantity;
    
    }
}
