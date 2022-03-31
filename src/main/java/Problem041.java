/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author damanno
 */
public class Problem041 {

    public static int findLargestPandigitalPrime() {
        int result = 0;
        boolean run = true;
        int i = 987654321;
        while (run) {

            if (checkPandigitalCustom(i + "") && isPrime(i)) {
                run = false;
                result = i;
            }
            i = i - 2;

        }
        System.out.println(result);
        return result;
    }

    public static boolean checkPandigitalCustom(String number) {

        int numberLength = number.length();

        for (int i = 1; i <= numberLength; i++) {
            if (!number.contains(i + "") ) {
                return false;
            }
        }
        return true;
    }

    private static boolean isPrime(long n) {
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
