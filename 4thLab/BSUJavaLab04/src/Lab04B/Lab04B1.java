/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab04B;

/**
 * class for testing class FileSizeCalculator
 * this is a program to convert bytes to kilobytes, megabytes, gigabytes
 * author Aliaksei Dubrouski 
 * group POIS1709v1
 * 11.03.2018.
 * @author Aliaksei Dubrouski
 */
public class Lab04B1 {
    public static void main(String[] args){
        long bytes = 23_365_443_465L;
        
        System.out.printf("%d bytes is \n%.3f kilobytes or \n%.3f megabytes or \n%.3f gigabytes\n", bytes, Logic04B.convertFileSizeFromBytesToKiloBytes(bytes), Logic04B.convertFileSizeFromBytesToMegaBytes(bytes), Logic04B.convertFileSizeFromBytesToGigaBytes(bytes));
    }
    
}
