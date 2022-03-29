/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author damanno
 */
public class Problem037 {

    public static boolean testTruncatable(int number) {

        String attempt = String.valueOf(number);

        if (!isPrime(number)) {
            return false;
        }

        for (int i = attempt.length() - 1; i > 0; i--) {
            int a = Integer.parseInt(attempt.substring(0, i));
            if (!isPrime(a)) {
                return false;
            }
            int b = Integer.parseInt(attempt.substring(attempt.length() - i, attempt.length()));
            if (!isPrime(b)) {
                return false;
            }
        }
        return true;
    }

    public static int truncatablePrimes(int qtd) {
        int i = 0;
        int number = 10;
        int sum = 0;

        while (i < qtd) {
            if (testTruncatable(number)) {
                System.out.println(" truncatable > " + number);
                i++;
                sum += number;
            }
            number++;
        }
        System.out.println(" sum > " + sum);
        return sum;
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
