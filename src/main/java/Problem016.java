
import java.math.BigInteger;

/*
 * To change this license header, chIoose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author damanno
 */
public class Problem016 {
    
    public static BigInteger power2DigitSum(int x) {

        BigInteger result = BigInteger.ZERO;
        BigInteger power = BigInteger.valueOf(2L);

        for ( int i = 1 ; i < x ; i++ ) {
            power = power.multiply(BigInteger.valueOf(2L));
        }
        
        String resultStr = power.toString();
        for ( int i = 0 ; i < resultStr.length() ; i++ ) {
            String numberAsCharacter = String.valueOf(resultStr.charAt(i));
            result = result.add(BigInteger.valueOf(Long.parseLong(numberAsCharacter)));
        }
        
        return result;
    }

}
