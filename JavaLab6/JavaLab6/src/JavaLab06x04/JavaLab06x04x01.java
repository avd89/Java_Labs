/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaLab06x04;

/**
 * найти сумму и количество цифр у заданного натурального числа
 * 
 * this is the main method of the program that get quantity and sum digits of the number
 * 28.03.2018
 * Group POIS1709v1
 * @author Aleksei Dubrovskii
 */
public class JavaLab06x04x01 {
    public static void main(String[] args){
        
        while (true) {
            
            long number = UserInput.input("Enter your number ");  //enter the number
            
            View.print("Sum of number digits is " + JavaLabLogic06x04.countSumOfNumberDigit(number));  //get sum digits of the number
            
            View.print("Quantity of number digits is " + JavaLabLogic06x04.countQuantityOfNumberDigit(number)); //get number digits quantity
            
            if (!Complete.complete("Do you want to continue?")){  //repeated request
                break;
            }                   
                   
        }
        
    }
    
}
