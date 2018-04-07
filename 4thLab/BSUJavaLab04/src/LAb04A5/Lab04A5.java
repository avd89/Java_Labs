/* part of a program which is allow us to determine one positive number in 3 numbers row(A,B,C)
 * class for testing Logic04A5.determineOnlyOnePositiveNumber(a, b, c) method
 * author Aliaksei Dubrouski 
 * group POIS1709v1
 * 11.03.2018
 */
package LAb04A5;

/**
 *
 * @author Aliaksei Dubrouski
 */
public class Lab04A5 {
    public static void main(String[] args){
        
        double a = Math.random()*20-10;
        double b = Math.random()*20-10;
        double c = Math.random()*20-10;
                
        System.out.println("a = " + a + "; b = " + b + "; c = " + c);
        System.out.println("result: " + Logic04A5.determineOnlyOnePositiveNumber(a, b, c));
        
    }
    
    
    
}
