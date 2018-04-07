/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab04C;

/**
 * This is a program that calculate square perimeter and area
 * 14.03.2018
 * Group POIS1709v1
 * 
 * 
 * 
 */
public class Lab04C1 {
    public static void main(String[] args){
        double a =7.5;
                
        System.out.println("Square with a = " + a + ";");
        System.out.println("Area = " + Logic04C.calculateArea(a));
        System.out.println("Perimeter = " + Logic04C.calculatePerimeter(a));
    }
    
}
