/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaLab05x06;
import java.util.Scanner;
/**
 * This is a program that show us the next day date
 * Created by Aliaksei Dubrouski
 * 13.03.2018
 * POIS1709v1 group (BSU)
 * @author Aliaksei Dubrouski
 */
public class JavaLab05x06 {
    public static void main(String[] args){
    
    View.print("****This programm show you the next day date****");
    
    int day = UserInput.input("\nEnter day : ");
    int month = UserInput.input("\nEnter month : ");
    int year = UserInput.input("\nEnter year : ");
    
    String nextDayDate = NextDayDate.getNextDayDate(day, month, year);
    
    View.print("Next date is : " + nextDayDate);   
        
    }
        
    
}
