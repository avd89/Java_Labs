/* a part of the program that determines the non-equality of numbers
 * class for testing Logic04A1.compareThreeNumbersByInequality(a, b, c) method
 * author Aliaksei Dubrouski 
 * group POIS1709v1
 * 11.03.2018.
 */
package Lab04A1;

/**
 *
 * @author Aliaksei Dubrouski 
 */
public class Lab04A1 {
    public static void main(String[] args){
        
        double a = Math.random() * 10;
        double b = Math.random() * 10;
        double c = Math.random() * 10;
        
        boolean result = Logic04A1.compareThreeNumbersByInequality(a, b, c);
        
        System.out.println("a = " + a + "; b = " + b + "; c = " + c);
        System.out.println("result: " + result);
    
    }
    
}
