

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author damanno
 */
public class Problem035 {

    public static void circularPrimes() {
        int total= 0;
        for (int i = 0; i < 1000000; i++) {
            if (isCircularPrime(i)) {
                System.out.println(i);
                total++;
            }
        }
        System.out.println("total " + total);
    }

    public static boolean isCircularPrime(int number) {
        String circularPrime = String.valueOf(number);
        boolean isPrime = true;
        for (int i = 0; i < circularPrime.length(); i++) {
            if (isPrime) {
                isPrime = isPrime(Integer.valueOf(circularPrime));
                circularPrime = circularPrime.substring(1) + circularPrime.substring(0, 1);
            }
        }
        return isPrime;
    }

    public static boolean isPrime(int n) {
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
