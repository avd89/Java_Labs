/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab04B;
import java.util.Date;
/**
 * class for testing methods from GetDayTime class
 * this is a program to get current data about day time in seconds, hours, minutes
 * author Aliaksei Dubrouski 
 * group POIS1709v1
 * 11.03.2018.
 * @author Aliaksei Dubrouski
 */
public class Lab04B4 {
    public static void main(String[] args){
        Date currentDate = new Date(); //Getting current data
       //print current data about day time in hours, minutes,seconds
                
        System.out.println("Current datee is : " + currentDate); //print current data
        System.out.println(Logic04B.getDayTimeInHours() + " in hours or");      //print current data about day time in hours
        System.out.println(Logic04B.getDayTimeInMinutes() + " in minutes or");  //print current data about day time in minutes
        System.out.println(Logic04B.getDayTimeInSeconds() + " in seconds");   //print current data about day time in seconds
    }
    
}
