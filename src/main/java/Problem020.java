
import java.math.BigInteger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xeldao
 */
public class Problem020 {
    
    public static int factorialDigitSum(int max) {
        String number = "";
        BigInteger factorial  = BigInteger.ONE;
        int result = 0;
        for (int i = max; i > 0; i--) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        number = factorial.toString();
        for (int i = 0; i < number.length(); i++) {
            int n = Integer.parseInt(String.valueOf(number.charAt(i)));
            result += n;
        }
        
        return result;
    };
    
}
