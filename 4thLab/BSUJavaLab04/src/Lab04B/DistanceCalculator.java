/* 
 */
package Lab04B;

/**
 * This is a method that allow us to convert cantimeters to metres or kilometres
 * class Lab04B2 test this class methods
 * author Aliaksei Dubrouski 
 * group POIS1709v1
 * 11.03.2018.
 * @author Aliaksei Dubrouski 
 */
public class DistanceCalculator {
    public static double calculateMeters(double distance){   
        double meters = distance / 100.0;
        return meters;
    }
    
    public static double calculateKilometers(double distance){   //method that converts distanse in santimetres to kilometres
        double kilometers = distance /100.0 /1000.0;
        return kilometers;
    }
    
}
