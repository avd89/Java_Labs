/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab05x02;


//import java.io.PrintStream;
//import java.io.UnsupportedEncodingException;
/**
 *
 * This is a part of the program that print random emodji (NetBeans random reaction for your code)
 * main class
 * 16.03.2018
 * Group POIS1709v1
 * @author Aleksei Dubrovskii
 */
public class Lab05x02 {
    public static void main(String[] args){
        
      String moodFace = MoodSensor.getMoodFace();  //get smile in unicode format
      
      View.print("NetBeans reaction for your code is " + moodFace + "\n");
    
    }
    
}
