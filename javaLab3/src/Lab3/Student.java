/* this is a part of a program, which allow us to compare two same type(byte, short, char, int, long, float, double, student, string, boolean) objects
 * this is a user class Student with 2 methods for compare age and lastnmaes student type objects
 * Created by Aliaksei Dubrouski
 * 09.03.2018-10.03.2018
 * POIS1709v1 group (BSU)
 */
package Lab3;
import java.util.Scanner;
/**
 *
 * @author alex
 */
public class Student { 
String LastName;
int age;

public Student(){ //Constructor
LastName="no name";
age=0;
}

public Student(String LastName,int age){ //Constructor
this.LastName=LastName;
this.age=age;
}

public void setLastName(String LastName){
 this.LastName=LastName;
}

public void setAge(int age){
 this.age=age;
}
public String getLastName(){ return LastName;}
public int getAge(){ return age;}

public void inputDataAboutStudent(){ //input data about student
System.out.print("\nEnter student last name : ");
Scanner scanner=new Scanner(System.in);
LastName=scanner.nextLine();
System.out.print("\nEnter student age : ");
age=scanner.nextInt();
}
public void outputDataAboutStudent(){ //output data about student
System.out.printf("\nStudent last name : %s", LastName);
System.out.printf("\nStudent age : %d", age);
}
 public static boolean compareAges(Student a,Student b){ //compare ages of 2 objects
    return a.age==b.age;
 }
 
public static boolean compareLastNames(Student a,Student b){ //compare LastNames of 2 objects
    return a.LastName.equals(b.LastName);
 }

}
