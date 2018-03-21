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
    static String[] firstDigitOfNumber = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    static String[] secondDigitOfNumber = {"" , "ten", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    static String[] thirdDigitOfNumber = {"", "one hundred", "two hundred", "three hundred", "four hundred", "five hundred", "six hundred", "seven hundred", "eight hundred", "nine hundred"};
    static String[] exseptionDigitOfNumber = {"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    
    
    public static String convertNumberToWord(int number){
        
        String thirdDigitToString = thirdDigitOfNumber[number/100];  //convert third digit to word
        String answer;
        number = number % 100;
        
        if(number >= 11 && number <= 19) answer = exseptionDigitOfNumber[number-11]; //catch exeption and convert it to word
        
        else {
            
            answer = secondDigitOfNumber[number / 10 % 10] + " " +  firstDigitOfNumber[number % 10];    //convert 1,2 digit to word  
            
        }
        
        return thirdDigitToString + " " + answer;
        
    }
   
}
