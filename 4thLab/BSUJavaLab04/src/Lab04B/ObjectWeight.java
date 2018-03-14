/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab04B;

/**
 * This is a method that allow us to convert gramms to kilograms, centers, tons
 * class Lab04B3 test this class methods
 * author Aliaksei Dubrouski 
 * group POIS1709v1
 * 11.03.2018.
 * @author Aliaksei Dubrouski 
 * 
 */
public class ObjectWeight {       // convert grams to kilograms
    public static double getWeightInKIlos(double gramms){
        double kilograms = gramms/1000.0;
        return kilograms;
    }
    
    public static double getWeightInCenters(double gramms){   // convert grams to centers
        double centers = gramms/100_000.0;
        return centers;
    }
    
    public static double getWeightInTons(double gramms){     // convert grams to tons
        double tons = gramms/1000_000.0;
        return tons;
    }
    
}
