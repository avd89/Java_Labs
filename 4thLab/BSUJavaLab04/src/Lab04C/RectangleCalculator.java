/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab04C;

/**
 * This is a program that calculate rectangle perimeter and area
 * 14.03.2018
 * Group POIS1709v1
 * @author Aleksei Dubrovskii
 * 
 */
public class RectangleCalculator {
    public static double getRectanglePerimeter(double a, double b){
        
        double RectanglePerimeter = (a+b)*2;
        
        return RectanglePerimeter;
    }
    
    public static double getRectangleArea(double a, double b){
        
        double RectangleArea = a*b;
        
        return RectangleArea;
        
        
    }
    
}
