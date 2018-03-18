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
 */
public class Lab04C5 {
    public static void main(String[] args){
        
        double a = 2.3;
        double b = 3.1;
        
        double average = Logic04C.getAverage(a, b);
        double geometricMean = Logic04C.getGeometricMean(a, b);
        
        System.out.println("a = " + a + "; b = " + b);
        System.out.println("Average of a and b is " + average);
        System.out.printf("Geometric mean of a and b is %.2f\n", geometricMean);
        
       
       
    }
    
}
