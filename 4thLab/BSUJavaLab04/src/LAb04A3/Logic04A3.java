/* logical method for a program that checks numbers for positivity
 * author Aliaksei Dubrouski 
 * group POIS1709v1
 * 11.03.2018.
 */
package LAb04A3;

/**
 *
 * @author Aliaksei Dubrouski 
 */
public class Logic04A3 {
    public static boolean determinatePositiveNumbers(double a, double b, double c){
        boolean answer;
        
        answer = a > 0 && b > 0 && c > 0;
        
        return answer;        
    }
    
}
