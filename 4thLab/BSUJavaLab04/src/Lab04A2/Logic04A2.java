/* logical method that allow us to find couple of equal in absolute value numbers in number row (a,b,c)
 * author Aliaksei Dubrouski 
 * group POIS1709v1
 * 11.03.2018.
 */
package Lab04A2;

/**
 *
 * @author Aliaksei Dubrouski 
 */
public class Logic04A2 {
    public static boolean findNumberEquality(double a, double b, double c){
       
        
        return (Math.abs(a) == Math.abs(b)) || (Math.abs(a) == Math.abs(c)) || (Math.abs(b) == Math.abs(c));
        
        
    }
    
}
