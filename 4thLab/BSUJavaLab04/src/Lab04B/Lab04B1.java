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
        double kilobytes = Logic04B.convertFileSizeFromBytesToKiloBytes(bytes);
        double megabytes = Logic04B.convertFileSizeFromBytesToMegaBytes(bytes);
        double gigabytes = Logic04B.convertFileSizeFromBytesToGigaBytes(bytes);
        
        System.out.printf("%d bytes is %.3f kilobytes or %.3f megabytes or %.3f gigabytes", bytes, kilobytes, megabytes, gigabytes);
    }
    
}
