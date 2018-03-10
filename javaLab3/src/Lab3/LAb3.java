/* this is a part of a program, which allow us to compare two same type(byte, short, char, int, long, float, double, student, string, boolean) objects
 * 
 * Created by Aliaksei Dubrouski
 * 09.03.2018-10.03.2018
 * POIS1709v1 group (BSU)
 */
package Lab3;
/**
 *
 * @author alex dubrouski
 */
public class LAb3 {
    
  public static void main(String[] args){
 
  Student A=new Student("Alex",29);//Creating to objects Student type
  Student B=new Student("Bro",29);
  
  
  DataTypesTester.testByte((byte)5,(byte) 2);   //Testing two objects byte type
  
  DataTypesTester.testShort((short)5,(short)2);  //Testing two objects short type
  
  DataTypesTester.testChar('5', '2');           //Testing two objects char type
  
  DataTypesTester.testInt(5, 2);                //Testing two objects int type
  
  DataTypesTester.testLong(5, 2);              //Testing two objects long type
  
  DataTypesTester.testFloat(5.0f, 2.0f);       //Testing two objects float type
  
  DataTypesTester.testDouble(5.0, 2.0);        //Testing two objects double type
  
  DataTypesTester.testStudent(A,B);            //Testing two objects Student type
  
  DataTypesTester.testString("5", "2");        //Testing two objects String type
  
  DataTypesTester.testBoolean(true, false);    //Testing two objects boolean type

   } 
}
