/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaLab05x06;
import java.util.Scanner;
/**
 * This is a class that consist method that return entered integer number
 * Created by Aliaksei Dubrouski
 * 13.03.2018
 * POIS1709v1 group (BSU)
 * @author Aliaksei Dubrouski
 */
public class UserInput {
    
    private static Scanner scanner = new Scanner(System.in);
    
    public static int input(String msg){
        
        System.out.print(msg);
        return scanner.nextInt();
        
    }
    
}
