/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab04C;

/**
 *
 * This is a program that calculate average and geometric mean of two numbers
 * 14.03.2018
 * Group POIS1709v1
 * @author Aleksei Dubrovskii
 * Lab04C5
 */
public class AverageCalculator {
    
    public static double getAverage(double a, double b){
        
        double average = (a+b)/2;
        return average;
    }
    
    public static double getGeometricMean(double a, double b){
        
        double geometricMean = Math.sqrt(a*b);
        
        return geometricMean;
    }
    
}
