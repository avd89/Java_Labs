/* logical method for finding at least one negative number in number row (a,b,c)
 * author Aliaksei Dubrouski 
 * group POIS1709v1
 * 11.03.2018.
 */
package Lab04A4;

/**
 *
 * @author Aliaksei Dubrouski 
 */
public class Logic04A4 {
    public static boolean determineAtLeastOnePositiveNumber(double a, double b, double c){
        boolean answer;
        
        answer = a > 0 || b > 0 || c > 0;
        
        return answer;
    }
    
}
