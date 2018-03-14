/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab04B;
import java.util.Scanner;
/**
 *class for testing methods from SumDigitsOfNumber class
 * this is a program to get sum digits of number 
 * author Aliaksei Dubrouski 
 * group POIS1709v1
 * 12.03.2018.
 * @author Aliaksei Dubrouski
 */
public class Lab04B5 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int number = 0;
        
        System.out.println("Enter a number");//Enter a number
        
        number = scanner.nextInt();
        int answer;
        
        answer = SumDigitsOfNumber.getSumDigitsOfNumber(number);
        
        System.out.printf("Sum Digits of number %d is %d\n", number, answer); //return sum of number digits 
        
    }
   
}
