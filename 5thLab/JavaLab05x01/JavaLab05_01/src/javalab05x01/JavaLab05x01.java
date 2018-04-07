/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalab05x01;
import java.util.Scanner;
/**
 *
 * This is a part of the program that calculate dragon head and eyes quantity
 * 15.03.2018
 * Group POIS1709v1
 * @author Aleksei Dubrovskii
 */
public class JavaLab05x01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        int N; //Dragon age
        int resultHead; //Dragon head quantity
                                    
        N = UserInput.input("Enter Dragon age "); //Enter dragon age
        
        resultHead = DragonHead.getDragonHeadQuantity(N); //calculate dragon head quantity
                        
        View.print("dragon head quantity is " + DragonHead.getDragonHeadQuantity(N) + "\n"); //calculate and output dragon heads quantity
        
        View.print("dragon eyes quantity is " + DragonHead.getDragonEyesQuantity(resultHead) + "\n"); //output dragon eyes quantity
        
    }
    
}
