/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalab05_01;
import java.util.Scanner;
/**
 *
 * This is a part of the program that calculate dragonhead quantity
 * 15.03.2018
 * Group POIS1709v1
 * @author Aleksei Dubrovskii
 */
public class JavaLab05_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        int N; //Dragon age
        int result; //Dragon head quantity
                            
        N = UserInput.input("Enter Dragon age "); //Enter dragon age
        
        result = DragonHead.getDragonHeadQuantity(N); //calculate dragon head quantity
        
        View.print("dragon head quantity is " + result + "\n"); //output dragon head quantity
                
    }
    
}
