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

        letter = Character.toUpperCase(letter);

        return (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U' || letter == 'Y');

    }

    public static boolean recogniseVowelBySecondMethod(char letter) {

        letter = Character.toUpperCase(letter);

        switch (letter) {
            case 'A':

            case 'E':

            case 'I':

            case 'O':

            case 'U':

            case 'Y':

                return true;

        }
        return false;
    }

    public static boolean recogniseVowelByThirdMethod(char letter) {

        return "AEIOUYaeiouy".contains(Character.toString(letter));     //string contains() method searches the sequence of characters in this string. It returns true if sequence of char values are found in this string otherwise returns false.

    }

    public static boolean recogniseVowelByFourthMethod(char letter) {

        return "AEIOUYaeiouy".indexOf(letter) != -1;   // .indexOf returns the index within this string of the first occurrence of the specified character or -1, if the character does not occur.

    }

}
