/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab04C;

/**
 * This is a program that calculate cube amount and area
 * 14.03.2018
 * Group POIS1709v1
 * @author Aleksei Dubrovskii
 * Lab04C4
 * 
 */
public class CubeCalculator {
    public static double getCubeAmount(double a){
        
        double CubeAmount = a*a*a;
        return CubeAmount;
    }
    
    public static double getCubeArea(double a){
        
        double CubeArea = 6*a*a;
        
        return CubeArea;
    }
    
}
