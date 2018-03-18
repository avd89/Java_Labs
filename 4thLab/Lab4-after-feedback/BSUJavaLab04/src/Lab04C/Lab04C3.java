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
 * 
 */
public class Lab04C3 {
    public static void main(String[] args){
        double r = 1.0;
    
        double perimeter = Logic04C.getCirclePerimeter(r);
    
        double area = Logic04C.getCircleArea(r);
    
        System.out.println("Circle radius is " + r);
        System.out.printf("Circle perimeter is %.2f\n", perimeter);
        System.out.printf("Circle area is %.2f\n", area);        
        
    }  
    
    
}
