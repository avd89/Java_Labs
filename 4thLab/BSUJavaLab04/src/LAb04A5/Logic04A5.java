/*
 * method for a program which is allow us to determine one positive number in 3 numbers row(A,B,C)
 * Logic04A5.determineOnlyOnePositiveNumber(a, b, c) method
 * author Aliaksei Dubrouski 
 * group POIS1709v1
 * 11.03.2018.
 */
package LAb04A5;

/**
 *
 * @author Aliaksei Dubrouski 
 */
public class Logic04A5 {
    public static boolean determineOnlyOnePositiveNumber(double a, double b, double c){
        boolean answer;
        
        answer = (a > 0 && b < 0 && c < 0) || (b > 0 && a < 0 && c < 0) || (c > 0 && a < 0 && b < 0);
        
        return answer;
    }
    
}
