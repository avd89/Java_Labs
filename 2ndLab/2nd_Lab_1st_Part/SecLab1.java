import java.util.Scanner;

public class SecLab1 {
	
    public static void main(String[] args){
		
		int dayOfUserBirth=0;
	    int monthOfUserBirth=0;
	    int yearOfUserBirth=0;
	    int userWorkingTime=0;
	    int userDurationOfVacation =0;
		String userName="";
	    String userPatronymic="";
	    String userLastname="";
	    String userPlaceOfWork=""; 
	    String userPostAtWork="";
	    String userHobbies="";
	    String userFavoriteAphorism="";
	    String userMaritalStatus ="";
		String UserDate="";
			
	Scanner scanner = new Scanner(System.in);
	
       //Request for name,last name,patronymic data
       System.out.println("----------------------"); 
	   System.out.print("Enter your name : ");	  
	   userName = scanner.nextLine();
	   System.out.print("\nEnter your patronymic : ");
       userPatronymic = scanner.nextLine();
	   System.out.print("\nEnter your lastname : ");
       userLastname = scanner.nextLine();
	   
	   //Request for birth data
	   System.out.print("\n---Date of your birth---");
	   System.out.print("\nEnter day when you were born : ");
	   dayOfUserBirth = scanner.nextInt();
       System.out.print("\nEnter month when you were born : ");
	   monthOfUserBirth = scanner.nextInt();
	   System.out.print("\nEnter year when you were born : ");
	   yearOfUserBirth = scanner.nextInt();
	   scanner.nextLine();
	   //Converting birth data from int to string
	   
	   UserDate=Integer.toString(dayOfUserBirth)+"."+Integer.toString(monthOfUserBirth)+"."+Integer.toString(yearOfUserBirth);
	   
	   System.out.print("\n--Some data about your work--");//Request for some data about work
	   System.out.print("\nEnter your place of work : ");	
	   userPlaceOfWork = scanner.nextLine();
	   System.out.print("\nEnter your post at work : ");
	   userPostAtWork = scanner.nextLine();
	   System.out.print("\nEnter average duration of your working day : ");
	   userWorkingTime = scanner.nextInt();
	   System.out.print("\nEnter average duration of your vakation : ");
	   userDurationOfVacation = scanner.nextInt();
	   scanner.nextLine();

	   System.out.print("\n--Some data about your private life--");//Request for some private data
	   System.out.print("\nEnter your hobbies list(separated by commas) : ");
	   userHobbies = scanner.nextLine();
	   System.out.print("\nEnter your favorite aphorism : ");
	   userFavoriteAphorism = scanner.nextLine();
	   System.out.print("\nEnter your marital status : ");
	   userMaritalStatus = scanner.nextLine();
	   
	   scanner.close();
	   
	   //Out information about user
	   System.out.printf("%-40s%-40s\n","Name: ",userName);
	   System.out.printf("%-40s%-40s\n","Patronymic: ",userPatronymic);
	   System.out.printf("%-40s%-40s\n","Last Name: ",userLastname);
	   System.out.printf("%-40s%-40s\n","Date of birth: ",UserDate);
	   System.out.printf("%-40s%-40s\n","Place of work: ",userPlaceOfWork);
	   System.out.printf("%-40s%-40s\n","Post at work: ",userPostAtWork);
	   System.out.printf("%-40s%-40d\n","Duration of working day: ",userWorkingTime);
	   System.out.printf("%-40s%-40d\n","Duration of vakation: ",userDurationOfVacation);
	   System.out.printf("%-40s%-40s\n","List of hobbies: ",userHobbies);
	   System.out.printf("%-40s%-40s\n","Favoirite aphorism: ",userFavoriteAphorism);
	   System.out.printf("%-40s%-40s\n","marital status: ",userMaritalStatus);
	   
	  }
}
