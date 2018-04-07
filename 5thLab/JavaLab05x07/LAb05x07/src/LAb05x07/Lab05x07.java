/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAb05x07;

/**
 * This is a part of the program that write number manually
 * main method
 * 21.03.2018
 * Group POIS1709v1
 * @author Aleksei Dubrovskii
 * 
 */
public class Lab05x07 {
    public static void main(String[] args){
        
        int number = UserInput.input("Enter a number :\n");
        
        View.print("The number " + number + " written manually : " + NumberToWord.convertNumberToWord(number) +"\n");
        
    }
    
}
