/* 
 */
package Lab04B;

/**
 * class for testing class DistanceCalculator
 * this is a program to convert cantimeters to metres or kilometres
 * author Aliaksei Dubrouski 
 * group POIS1709v1
 * 11.03.2018.
 * @author Aliaksei Dubrouski
 */
public class LAb04B2 {
    public static void main(String[] args){
        double distance = 123456.78;
                
        System.out.printf("%.3f centimeters is %.2f meters or %.2f kilometers\n", distance,Logic04B.calculateMeters(distance),Logic04B.calculateKilometers(distance));
    }
    
}
