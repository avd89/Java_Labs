/* program that allow us to find couple of equal in absolute value numbers in number row (a,b,c)
 * class for testing Logic04A2.findNumberEquality(a, b, c) method
 * author Aliaksei Dubrouski 
 * group POIS1709v1
 * 11.03.2018.
 */
package Lab04A2;

/**
 *
 * @author Aliaksei Dubrouski 
 */
public class LAb04A2 {
    public static void main(String[] args){
        double a = 10.4;
        double b = -10.4;
        double c = 8.2;
        
        boolean result = Logic04A2.findNumberEquality(a, b, c);
        
        System.out.println("a = " + a + "; b = " + b + "; c = " + c);
        System.out.println("result: " + result);
    }
    
}
