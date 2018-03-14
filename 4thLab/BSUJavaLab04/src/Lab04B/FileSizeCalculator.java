/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab04B;

/**
 * This is a method that allow us to convert bytes to kilobytes, megabytes, gigabytes
 * class Lab04B1 test this class methods
 * author Aliaksei Dubrouski 
 * group POIS1709v1
 * 11.03.2018.
 * @author Aliaksei Dubrouski 
  */
public class FileSizeCalculator {
    public static double convertFileSizeFromBytesToKiloBytes(long bytes){  //method that converts bytes to kilobytes
        double kilobytes = bytes/1000.0;
        return kilobytes;
    }
    
    public static double convertFileSizeFromBytesToMegaBytes(long bytes){  //method that converts bytes to megabytes
        double megabytes = bytes/1000_000.0;
        return megabytes;
    }
    
    public static double convertFileSizeFromBytesToGigaBytes(long bytes){  //method that converts bytes to gigabytes
        double gigabytes = bytes/1000_000_000.0;
        return gigabytes;
    }
    
}
