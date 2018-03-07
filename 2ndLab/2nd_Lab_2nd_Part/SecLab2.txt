import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.Scanner;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class SecLab2 {
	
    public static void main(String[] args){
       int dayOfUserBirth=0;    //User day of birth
	   int monthOfUserBirth=0;  //User month of birth
	   int yearOfUserBirth=0;   //User year of birth
	   Scanner scanner = new Scanner(System.in);
           //Request for birth data
	   System.out.print("\n---Date of your birth---");    
	   System.out.print("\nEnter day when you were born : ");
	   dayOfUserBirth = scanner.nextInt(); //Enter user day of birth
           System.out.print("\nEnter month when you were born : ");
	   monthOfUserBirth = scanner.nextInt(); //Enter user month of birth
	   System.out.print("\nEnter year when you were born : ");
	   yearOfUserBirth = scanner.nextInt(); //Enter user year of birth
	   scanner.nextLine();
           
           String UserBirthDateString=getBirthDateToString(dayOfUserBirth,monthOfUserBirth,yearOfUserBirth);  //Converting birth data from int to string
           
           Date userBirthDayDate=getDateFromString(UserBirthDateString);  //Converting birth data from string to date
           
           Date currentDate = new Date(); //Getting current time
           
           long differenceBetweenTwoDatesInMilliseconds=getDifferenceBetweenTwoDatesInMilliseconds(userBirthDayDate, currentDate); //Getting user user age in milliseconds
           
           System.out.println("Date of birth: " + UserBirthDateString); //Print user date of birth
           System.out.println("You are living: " + getDifferenceBetweenTwoDatesInYears(userBirthDayDate,currentDate) + " years");//Print user age in years
           System.out.println("You are living: " + getDifferenceBetweenTwoDatesInMonth(userBirthDayDate,currentDate) + " months"); //Print user age in months
           System.out.println("You are living: " + getDaysFromMilliseconds(differenceBetweenTwoDatesInMilliseconds) + " days");  //Print user age in days
           System.out.println("You are living: " + getHoursFromMilliseconds(differenceBetweenTwoDatesInMilliseconds) + " hours");  //Print user age in hours
           System.out.println("You are living: " + getMinutesFromMilliseconds(differenceBetweenTwoDatesInMilliseconds) + " minutes");  //Print user age in minutes
           System.out.println("You are living: " + getSecondsFromMilliseconds(differenceBetweenTwoDatesInMilliseconds) + " seconds");  //Print user age in seconds
           System.out.println("You are living: " + differenceBetweenTwoDatesInMilliseconds + " milliseconds");  //Print user age in milliseconds
           	   
	  }
    
    public static String getBirthDateToString(int day,int month, int year){   //convert data from int to string (in format "dd.MM.yyyy")
    return Integer.toString(day)+"."+Integer.toString(month)+"."+Integer.toString(year);
    }
     
    public static Date getDateFromString(String UserBirthDateString){    //convert  data from string to date 
     Date UserBirthDate=new Date();
     SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");      
      try {
         UserBirthDate = formatter.parse(UserBirthDateString); 
         return UserBirthDate;
          }
      catch (ParseException e) { 
         System.out.println("Pasing error ");
         return null;
         } 
    }    
   
   public static long getDifferenceBetweenTwoDatesInMilliseconds(Date startDate, Date finishDate){  //return difference between 2 dates in milliseconds
     return finishDate.getTime()- startDate.getTime();
   }
   
   public static int getDifferenceBetweenTwoDatesInYears(Date startDate, Date finishdate){  //get difference between 2 dates in years(using GregorianCalendar)
   Calendar startCalendar = new GregorianCalendar();
   Calendar endCalendar = new GregorianCalendar();
   startCalendar.setTime(startDate);
   endCalendar.setTime(finishdate);
   return endCalendar.get(Calendar.YEAR) - startCalendar.get(Calendar.YEAR);
   }
 
   public static int getDifferenceBetweenTwoDatesInMonth(Date startDate, Date finishdate){  //get difference between 2 dates in month (using GregorianCalendar)
   Calendar startCalendar = new GregorianCalendar();
   Calendar endCalendar = new GregorianCalendar();
   startCalendar.setTime(startDate);
   endCalendar.setTime(finishdate);
   return (endCalendar.get(Calendar.YEAR) - startCalendar.get(Calendar.YEAR))*12+endCalendar.get(Calendar.MONTH) - startCalendar.get(Calendar.MONTH);
   }

   public static long getSecondsFromMilliseconds(long differenceBetweenTwoDatesInMilliseconds){  //calculate how much you have seconds from number of milliseconds
   return (long)differenceBetweenTwoDatesInMilliseconds/1000;
   }

   public static long getMinutesFromMilliseconds(long differenceBetweenTwoDatesInMilliseconds){ //calculate how much you have minutes from number of milliseconds
   return (long)differenceBetweenTwoDatesInMilliseconds/1000/60;
   }
   
   public static long getHoursFromMilliseconds(long differenceBetweenTwoDatesInMilliseconds){ //calculate how much you have hours from number of milliseconds
   return (long)differenceBetweenTwoDatesInMilliseconds/1000/60/60;
   }
   
   public static long getDaysFromMilliseconds(long differenceBetweenTwoDatesInMilliseconds){ //calculate how much you have days from number of milliseconds
   return (long)differenceBetweenTwoDatesInMilliseconds/1000/60/60/24;
   }   
}