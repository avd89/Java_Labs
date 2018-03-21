/* program for finding at least one negative number in number row (a,b,c)
 * class for testing Logic04A4.determineAtLeastOnePositiveNumber(a, b, c) method
 * author Aliaksei Dubrouski 
 * group POIS1709v1
 * 11.03.2018.
 */
package Lab04A4;

/**
 *
 * @author Aliaksei Dubrouski 
 */
public class Lab04A4 {
    public static void main(String[] args){
        
        double a = Math.random()*10-5;
        double b = Math.random()*10-5;
        double c = Math.random()*10-5;
        
        boolean result = Logic04A4.determineAtLeastOnePositiveNumber(a, b, c);
        
        System.out.println("a = " + a + "; b = " + b + "; c = " + c);
        System.out.println("result: " + result);
    }
    
}
