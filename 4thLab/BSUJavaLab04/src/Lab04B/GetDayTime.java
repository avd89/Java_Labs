/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab04B;
import java.util.GregorianCalendar;
import java.util.Calendar;
/**
 * his is a method that allow us to get current data about day time in seconds, hours, minutes
 * class Lab04B4 test this class methods
 * author Aliaksei Dubrouski 
 * group POIS1709v1
 * 11.03.2018.
 * @author Aliaksei Dubrouski 
 * 
 */
public class GetDayTime {
    public static int getDayTimeInSeconds(){ //get current data about day time in seconds
        GregorianCalendar currentCalendar = new GregorianCalendar();
        
        int dayHour = currentCalendar.get(Calendar.HOUR_OF_DAY);
        int dayMinute = currentCalendar.get(Calendar.MINUTE);
        int daySecond = currentCalendar.get(Calendar.SECOND);
        int dayTimeInSeconds = daySecond + dayMinute*60 + dayHour*3600;
        
        return dayTimeInSeconds;
              
    }
        
    public static int getDayTimeInMinutes(){ //get current data about day time in minutes
        GregorianCalendar currentCalendar = new GregorianCalendar();
        
        int dayHour = currentCalendar.get(Calendar.HOUR_OF_DAY);
        int dayMinute = currentCalendar.get(Calendar.MINUTE);
        int dayTimeInMinutes = dayMinute + dayHour*60;
        
        return dayTimeInMinutes;
              
    }
    
    public static int getDayTimeInHours(){ //get current data about day time in hours
        GregorianCalendar currentCalendar = new GregorianCalendar();
        
        int dayTimeInHours = currentCalendar.get(Calendar.HOUR_OF_DAY);
                
        return dayTimeInHours;
              
    }
    
}
