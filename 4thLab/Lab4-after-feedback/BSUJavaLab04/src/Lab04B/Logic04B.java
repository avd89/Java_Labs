/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab04B;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author alex
 */
public class Logic04B {
    
    public static double calculateMeters(double distance){ 
        
        return distance / 100.0;
        
    }
    
    public static double calculateKilometers(double distance){   //method that converts distanse in santimetres to kilometres
        
        return distance /100.0 /1000.0;
        
    }
    
    public static double convertFileSizeFromBytesToKiloBytes(long bytes){  //method that converts bytes to kilobytes
        
        return bytes/1000.0;
        
    }
    
    public static double convertFileSizeFromBytesToMegaBytes(long bytes){  //method that converts bytes to megabytes
        
        return bytes/1000_000.0;
        
    }
    
    public static double convertFileSizeFromBytesToGigaBytes(long bytes){  //method that converts bytes to gigabytes
        
        return bytes/1000_000_000.0;
        
    }
    
    public static int getDayTimeInSeconds(){ //get current data about day time in seconds
        GregorianCalendar currentCalendar = new GregorianCalendar();
        
        int dayHour = currentCalendar.get(Calendar.HOUR_OF_DAY);
        int dayMinute = currentCalendar.get(Calendar.MINUTE);
        int daySecond = currentCalendar.get(Calendar.SECOND);
                
        return daySecond + dayMinute*60 + dayHour*3600;
              
    }
    
    public static int getDayTimeInMinutes(){ //get current data about day time in minutes
        GregorianCalendar currentCalendar = new GregorianCalendar();
        
        int dayHour = currentCalendar.get(Calendar.HOUR_OF_DAY);
        int dayMinute = currentCalendar.get(Calendar.MINUTE);
                
        return dayMinute + dayHour*60;
              
    }
    
    public static int getDayTimeInHours(){ //get current data about day time in hours
        GregorianCalendar currentCalendar = new GregorianCalendar();
                               
        return currentCalendar.get(Calendar.HOUR_OF_DAY);
              
    }
    
    public static double getWeightInKIlos(double gramms){
        
        return gramms/1000.0;
    }
    
    public static double getWeightInCenters(double gramms){   // convert grams to centers
       
        return gramms/100_000.0;
    }
    
    public static double getWeightInTons(double gramms){     // convert grams to tons
        
        return gramms/1000_000.0;
    }
    
     public static int getSumDigitsOfNumber(int number){
        int SumDigitsOfNumber=0;
        
        return getSumDigitsOfNumberReq(number,SumDigitsOfNumber); 
        
    }
     
     private static int getSumDigitsOfNumberReq(int number,int SumDigitsOfNumber){
           
           if(number!=0){
            SumDigitsOfNumber+=number%10;
            
            return getSumDigitsOfNumberReq((int)number/10,SumDigitsOfNumber);
            
       } 
        return SumDigitsOfNumber;
        
    }
    
}
