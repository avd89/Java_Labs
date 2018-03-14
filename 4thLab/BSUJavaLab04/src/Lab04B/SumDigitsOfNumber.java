/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab04B;

/**
 * This is a method that allow us to get sum digits of number 
 * class Lab04B5 test this class methods
 * author Aliaksei Dubrouski 
 * group POIS1709v1
 * 12.03.2018.
 * @author Aliaksei Dubrouski 
 * 
 */
public class SumDigitsOfNumber {
    public static int getSumDigitsOfNumber(int number){
        int SumDigitsOfNumber=0;
        SumDigitsOfNumber = getSumDigitsOfNumberReq(number,SumDigitsOfNumber); 
        return SumDigitsOfNumber;
        }
    
       private static int getSumDigitsOfNumberReq(int number,int SumDigitsOfNumber){
           
           if(number!=0){
            SumDigitsOfNumber+=number%10;
            
            return getSumDigitsOfNumberReq((int)number/10,SumDigitsOfNumber);
            
       } 
        return SumDigitsOfNumber;
        
    }
    
}
