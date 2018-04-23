/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaLab06x04;

import java.util.ArrayList;
import java.util.Objects;

/**
 * 
 * there are logic methods for the 6.4 unit
 * logical method of the program that get quantity and sum digits of a number
 * logical method of the program that get quantity of different digits of a number
 * logical method of the program that get max digit of a number
 * logical method of the program that determine palindrome number
 * logical method of the program that determine prime number
 * logical method of the program that determine prime dividers of a number
 * logical method of the program that determine least common multiple and greatest common divisor of the two numbers * 
 * 28.03.2018
 * Group POIS1709v1
 * @author Aleksei Dubrovskii
 * 
 */
public class JavaLabLogic06x04 {

    // method that count sum digits of a number
    public static int countSumOfNumberDigit(long number) { //get sum of number digits 
        int sum = 0;

        number = number > 0 ? number : -number;

        while (number > 0) {
            sum += number % 10;
            number = number / 10;
        }
        return sum;
    }

    // method that count quantity digits of a number
    public static int countQuantityOfNumberDigit(long number) {  //get count of number digits 
        int quantity = 1;

        number = number > 0 ? number : -number;

        while (number > 9) {
            quantity++;
            number /= 10;
        }

        return quantity;
    }
    
    // method that return digits of a number in array
    public static ArrayList getArrayNumberDigits(long number) { //get number digits in ArrayList

        ArrayList<Long> digits = new ArrayList<>();
        number = number > 0 ? number : -number;
        while (number != 0) {

            digits.add(number % 10);
            number = number / 10;
        }
        return digits;
    }

    //method that get quantity of different digits of a number
    public static int getQuantityDiferrentGigitsOfNumber(long number) {
        int count = 0;
        ArrayList<Long> digits = getArrayNumberDigits(number);

        for (int i = 0; i < digits.size(); i++) {
            for (int j = i + 1; j < digits.size(); j++) {

                if (Objects.equals(digits.get(i), digits.get(j))) {
                    count++;
                    break;
                }
            }
        }
        return digits.size() - count;
    }

    // method that find max digit of a number
    public static long findMaxNumberDigit(long number) {    //find max digit of number

        long digit = number % 10;

        while (number > 0) {

            if (digit < number % 10) {
                digit = number % 10;
            }
            number /= 10;

        }

        return digit;
    }

    //method that reverse number
    private static long getReverseNumber(long number) {   //get reverse number 

        long temp, reversedNumber = 0;

        while (number > 0) {
            temp = number % 10;
            reversedNumber = reversedNumber * 10 + temp;
            number = number / 10;
        }
        return reversedNumber;
    }

    //method that check palindrome number
    public static boolean checkPalindromeNumber(long number) {  //check palindrome number
        
        return (getReverseNumber(number) == number);
        
    }

    // method thar realise interface for the method that getermine palindrome number 
    public static void checkPalindromeNumberInterface(long number) {  //check palindrome number and output answer

        if (JavaLabLogic06x04.checkPalindromeNumber(number)) {
            System.out.println("This number is palindrome");
        } else {
            System.out.println("This number is not palindrome");
        }
    }

    // method that check prime number
    public static boolean checkPrimeNumber(long number) {  //Check simple number
        
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                if (i != 1 && i != number) {
                    return false;                    
                }
            }
        }
        return true;
    }

    // method thar realise interface for the method that getermine prime number 
    public static void checkPrimeNumberInterface(long number) {  //Check simple number with output answer

        if (JavaLabLogic06x04.checkPrimeNumber(number)) {
            System.out.println("This number is prime");
        } else {
            System.out.println("This number is not prime");
        }
    }

    // method that get prime dividers of a number
    public static ArrayList getNumberPrimeDividers(long number) {   //get simple dividers (in arraylist)

        ArrayList<Integer> dividers = new ArrayList<>();

        for (int i = 1; i <= number; i++) {
            if (number % i == 0 && checkPrimeNumber(i)) {
                dividers.add(i);
            }

        }
        return dividers;
    }

    // method that get greatest common divisor
    public static long greatestCommonDivisor(long numberOne, long numberTwo) {   //method that return greatest common divisor (using euclidean algorithm)

        while (numberOne != numberTwo) {
            if (numberOne > numberTwo) {
                numberOne = numberOne - numberTwo;
            } else {
                numberTwo = numberTwo - numberOne;
            }
        }
        return numberOne;
    }

    // method that get least common multiple
    public static long leastCommonMultiple(long numberOne, long numberTwo) {   //method that return least common multiple

        return numberOne * (numberTwo / greatestCommonDivisor(numberOne, numberTwo));

    }
   
    // method thar realise interface for the method that find prime dividers of a number
    public static void showNumberPrimeDividers(ArrayList<Integer> array) {  //method that output counted simple dividers from Integer ArrayList 
        int j = 0;

        for (int i : array) {
            System.out.println("Divider " + ++j + " is " + i);
        }
    }
    
    


//method (get simple dividers) without array    
    //        int j = 0;
//        
//        for (int i = 1; i < number; i++) {
//            if (number % i == 0) {                
//                j++;
//            }
//        }
//        
//        int[] dividers = new int[j];
//        
//        j = 0;
//
//        for (int i = 1; i < number; i++) {
//            if (number % i == 0) {
//
//                dividers[j] = i;
//                j++;
//            }
//        }
//        return dividers;
    
    
    
}
