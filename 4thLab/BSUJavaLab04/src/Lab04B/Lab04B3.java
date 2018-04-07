/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab04B;

/**
 * class for testing class ObjectWeight
 * this is a program to convert grams to kilograms, centers, tons
 * author Aliaksei Dubrouski 
 * group POIS1709v1
 * 11.03.2018.
 * @author Aliaksei Dubrouski
 * 
 */
public class Lab04B3 {
    public static void main(String[] args){
        double weight = 32456789.5;       
               
        System.out.printf("Dinosaur weight is:\n %.3f in grams or\n %.3f in kilograms or\n %.3f in centners or\n %.3f in tons\n", weight, Logic04B.getWeightInKIlos(weight), Logic04B.getWeightInCenters(weight),  Logic04B.getWeightInTons(weight));
        
    }
    
}
