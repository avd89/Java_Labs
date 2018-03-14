/* program that checks numbers for positivity
 * class for testing Logic04A3.determinatePositiveNumbers(a, b, c) method 
 * author Aliaksei Dubrouski 
 * group POIS1709v1
 * 11.03.2018.
 */
package LAb04A3;

/**
 *
 * @author Aliaksei Dubrouski 
 */
public class Lab04A3 {
    public static void main(String[] args){
        
        double a = Math.random()*20 - 10;
        double b = Math.random()*20 - 10;
        double c = Math.random()*20 - 10;
        
        boolean result = Logic04A3.determinatePositiveNumbers(a, b, c);
        
        System.out.println("a = " + a + "; b = " + b + "; c = " + c);
        System.out.println("result: " + result);
    }
    
}
