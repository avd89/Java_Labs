/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaLab05x06;

/**
 * This is a class that consist method that show us the next day date
 * Created by Aliaksei Dubrouski
 * 13.03.2018
 * POIS1709v1 group (BSU)
 * @author Aliaksei Dubrouski
 */
public class NextDayDate {
    public static String getNextDayDate(int day, int month, int year){
        String nextDayDate = null;
        int v;
       
        //unreal day meaning definition
        
        if (day < 0 || day > 31 || (month == 2 && (day == 30 || day == 31))) 
        {
            System.out.println("Error.impossible day data");
            
        } 
        
        //unreal month meaning definition
        
        if (month < 0 || month > 12)
            {
                System.out.println("Error.impossible mounth data");
              
            }
                      

        //leap year definition
	if ((year % 4 == 0 && year % 100 != 0) || ((year % 4 == 0 && year % 100 == 0) && year % 400 == 0)){
            
            v = 1;
            
        } 
	else v = 0; //not leap year
        
        
        //solution for the 1-30.(1,3,5,7,8,10,12 monthes) dates 
	if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && day > 0 && day < 31) { 
            
            nextDayDate = convertIntDateToString (day+1,month,year);
                        
        }               
         
        //solution for the 31.(1,3,5,7,8,10 monthes) dates 
	if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) && day > 0 && day == 31) { 
            
            nextDayDate = convertIntDateToString (1,month+1,year);                  
           
        }              
               
	//solution for the 1-29.(4,6,9,11 monthes) dates
	if ((month == 4 || month == 6 || month == 9 || month == 11) && day > 0 && day < 30) {
            
            nextDayDate = convertIntDateToString (day+1,month,year);           
            
        } 
        
        //solution for the 30.(4,6,9,11 monthes) dates
	if ((month == 4 || month == 6 || month == 9 || month == 11) && day > 0 && day == 30) { 
            
            nextDayDate = convertIntDateToString (1,month+1,year);            
            
        }
                
        // solution for the 1-27.2 dates        
	if(month == 2 && day > 0 && day < 28){
            
            nextDayDate = convertIntDateToString (day + 1, month,year);            
            
        }
        
        //solution fot the 28.02.not leap year date
	if( month == 2 && v == 0 && day == 28) {
            
            nextDayDate = convertIntDateToString (1,month+1,year);            
            
        } 
        
        //solution fot the 28.02.leap year date
	if (month == 2 && v == 1 && day == 28) {
            
            nextDayDate = convertIntDateToString (day+1,month,year);            
        
        } 
        
        //solution fot the 29.02.leap year date
	if(month == 2 && v == 1 && day == 29 ) {
            
            nextDayDate = convertIntDateToString (1,month+1,year);            
            
        } 
        
        //solution fot the new year 
	if(month == 12 && day == 31 ) { 
            
            nextDayDate = convertIntDateToString (1,1,year+1);             
            
        }
        
        return nextDayDate;
    }
    //convert next day date to string
    private static String convertIntDateToString(int day, int month, int year){
            
    return Integer.toString(day)+"."+Integer.toString(month)+"."+Integer.toString(year); 
            
    }
   
}
