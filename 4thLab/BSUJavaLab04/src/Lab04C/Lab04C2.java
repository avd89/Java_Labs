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
 */
public class Lab04C2 {
    public static void main(String[] args){
        
        double a = 4;
        double b = 3;
    
        double P = RectangleCalculator.getRectanglePerimeter(a, b);
        double S = RectangleCalculator.getRectangleArea(a, b);
    
        System.out.println("Rectangle sides size are " + a + " and " + b);
        System.out.println("Rectangle perimeter is " + P);
        System.out.println("Rectangle area is " + S);       
        
    }   
    
    
}
