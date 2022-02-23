
import java.math.BigInteger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author damanno
 */
public class Problem010 {

    public static BigInteger summationPrimes(int lowerThan) {

        BigInteger sumPrimes = BigInteger.ZERO;
        
        for (int i = 2; i < lowerThan; i++) {
            if (isPrime(i)) {
                sumPrimes = sumPrimes.add(BigInteger.valueOf(i));
            }
        }

        return sumPrimes;

    }

    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        } else if (n == 2) {
            return true;
        } else if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
