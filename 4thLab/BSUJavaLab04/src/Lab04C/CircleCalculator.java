/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab04C;

/**
 * This is a program that calculate circle perimeter and area
 * 14.03.2018
 * Group POIS1709v1
 * @author Aleksei Dubrovskii
 * Lab04C3
 * 
 
 */
public class CircleCalculator {
    public static double getCirclePerimeter(double r){
        
        double CirclePerimeter = 2*Math.PI*r;
        
        return CirclePerimeter;
    }
    
    public static double getCircleArea(double r){
        
        double CircleArea = Math.PI*Math.pow(r, 2.0);
        
        return CircleArea;
    }
}
