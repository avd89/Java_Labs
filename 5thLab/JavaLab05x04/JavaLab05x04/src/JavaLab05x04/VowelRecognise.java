/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaLab05x04;

/**
 * This is a part of the program that recognize vowel letter
 * recognize methods
 * 18.03.2018
 * Group POIS1709v1
 * @author Aleksei Dubrovskii
 */
public class VowelRecognise {

    public static boolean recognizeVowelByFirstMethod(char letter) {

        boolean answer = false;

        if (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U' || letter == 'Y' || letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'y') {
            answer = true;
        }

        return answer;
    }

    public static boolean recogniseVowelBySecondMethod(char letter) {
        boolean answer = false;
        letter = Character.toUpperCase(letter);

        switch (letter) {
            case 'A':
                answer = true;
                break;
            case 'E':
                answer = true;
                break;
            case 'I':
                answer = true;
                break;
            case 'O':
                answer = true;
                break;
            case 'U':
                answer = true;
                break;
            case 'Y':
                answer = true;
                break;
        }
        return answer;
    }

    public static boolean recogniseVowelByThirdMethod(char letter) {

        String vowel = "AEIOUYaeiouy";
        String letterString = Character.toString(letter);

        return vowel.contains(letterString);     //string contains() method searches the sequence of characters in this string. It returns true if sequence of char values are found in this string otherwise returns false.

//         boolean answer = false;
//         String vowel = "AEIOUYaeiouy";
//         String letterString = Character.toString(letter);
//         
//         if(vowel.contains(letterString)){
//            answer = true;
//         }
//         
//         return answer;
    }

    public static boolean recogniseVowelByFourthMethod(char letter) {

        String vowel = "AEIOUYaeiouy";

        return vowel.indexOf(letter) != -1;   // .indexOf returns the index within this string of the first occurrence of the specified character or -1, if the character does not occur.

    }

}
