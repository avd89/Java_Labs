/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaLab05x04;

/**
 * This is a part of the program that recognize vowel letter
 * main method
 * 18.03.2018
 * Group POIS1709v1
 * @author Aleksei Dubrovskii
 */
public class JavaLab05x04 {

    public static void main(String[] args) {

        char enteredLetter = UserInput.input("Enter the letter \n");
        
        View.print("Result of using the first method : \n");   //using first method for recognition
        System.out.println(VowelRecognise.recognizeVowelByFirstMethod(enteredLetter));
        
        View.print("Result of using the second method : \n");    //using second method for recognition
        System.out.println(VowelRecognise.recogniseVowelBySecondMethod(enteredLetter));
        
        View.print("Result of using the third method : \n");    //using third method for recognition
        System.out.println(VowelRecognise.recogniseVowelByThirdMethod(enteredLetter));
        
        View.print("Result of using the fourth method : \n");     //using fourth method for recognition
        System.out.println(VowelRecognise.recogniseVowelByFourthMethod(enteredLetter));

    }

}
