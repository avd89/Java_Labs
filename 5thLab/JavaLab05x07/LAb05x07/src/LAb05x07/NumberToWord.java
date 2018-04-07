/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAb05x07;

/**
 * This is a part of the program that write number manually
 * logical methods
 * 21.03.2018
 * Group POIS1709v1
 * @author Aleksei Dubrovskii
 * 
 */
public class NumberToWord {
    // for example number 456. 4 - third digit, 5 - second digit, 6 - first digit
    static final String[] FIRST_DIGIT_OF_NUMBER = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    static final String[] SECOND_DIGIT_OF_NUMBER = {"" , "ten", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    static final String[] THIRD_DIGIT_OF_NUMBER = {"", "one hundred", "two hundred", "three hundred", "four hundred", "five hundred", "six hundred", "seven hundred", "eight hundred", "nine hundred"};
    static final String[] EXEPTION_FROM_11_TO_19_NUMBERS = {"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    
    
    public static String convertNumberToWord(int number){        
       
        String answer;
        String thirdDigitToString = THIRD_DIGIT_OF_NUMBER[number/100]; //convert third digit to word
        number = number % 100;
        
        if(number >= 11 && number <= 19) answer = EXEPTION_FROM_11_TO_19_NUMBERS[number-11]; //catch exeption and convert it to word
        
        else {
            
            answer = SECOND_DIGIT_OF_NUMBER[number / 10 % 10] + " " +  FIRST_DIGIT_OF_NUMBER[number % 10];    //convert 1,2 digit to word  
            
        }
        
        return thirdDigitToString + " " + answer; 
        
    }
   
}
