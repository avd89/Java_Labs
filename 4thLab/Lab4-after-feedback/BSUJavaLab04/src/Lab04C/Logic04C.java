/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab04C;

/**
 *
 * @author alex
 */
public class Logic04C {
    
    public static double getAverage(double a, double b){
        
        return (a+b)/2;
        
    }
    
    public static double getGeometricMean(double a, double b){
        
       return Math.sqrt(a*b);
       
    }
    
    public static double getCirclePerimeter(double r){
                       
        return 2*Math.PI*r;
    }
    
    public static double getCircleArea(double r){
        
        return Math.PI*Math.pow(r, 2.0);
        
    }
    
    public static double getCubeAmount(double a){
                
        return a*a*a;
        
    }
    
    public static double getCubeArea(double a){
        
        return 6*a*a;
        
    }
    
    public static double getMaxNumber(double a, double b){
                              
        return (a > b) ? a : b;
        
    }
    
    public static double getRectanglePerimeter(double a, double b){
        
        return (a+b)*2;
        
    }
    
    public static double getRectangleArea(double a, double b){
                
        return a*b;
                
    }
    
    public static double calculatePerimeter(double a){
        
        return 4*a; 
        
    }
    
    public static double calculateArea(double a){
        
        return a*a;
        
    }    
       
}
