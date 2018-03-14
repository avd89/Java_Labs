/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab04C;

/**
 *
 * This is a program that calculate cube amount and area
 * 14.03.2018
 * Group POIS1709v1
 * @author Aleksei Dubrovskii
 */
public class Lab04C4 {
    public static void main(String[] args){
        
        double a = 1.0;    //cube edge
        
        double A = CubeCalculator.getCubeAmount(a);
        
        double S = CubeCalculator.getCubeArea(a);
        
        System.out.println("Cuble edge is " + a);
        System.out.println("Cube amount is " +A);
        System.out.println("Cube area is " + S);
    }
    
}
