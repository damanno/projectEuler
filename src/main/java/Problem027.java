
/**
 *
 * @author damanno
 */
public class Problem027 {

    public static void quadraticPrimesUnder1000() {

    }

    public static int consecutivePrimeCounter(long maxA, long maxB) {
        int numberOfPrimes = 0;
        int maxNumberOfPrimes = 0;
        int topA = 0;
        int topB = 0;
        int negativeA = (int) (maxA * -1);
        for (int a = negativeA ; a < maxA; a++) {
            for (int b = 1; b <= maxB; b++) {
                numberOfPrimes = 0;
                boolean sequencePrime = true;
                int n = 0;
                while (sequencePrime) {
                    n++;
                    long result = quadratic(a, b, n);
                    if (isPrime(result)) {
                        //System.out.println(result);
                        numberOfPrimes++;
                    } else {
                        sequencePrime = false;
                    }
                }

                if (0 < numberOfPrimes) {
                    //System.out.println("a " + a + ", b " + b + " number of primes = " + numberOfPrimes);
                }
                if (maxNumberOfPrimes < numberOfPrimes) {
                    maxNumberOfPrimes = numberOfPrimes;
                    topA = a;
                    topB = b;
                }
            }
        }
        System.out.println("a " + topA + ", b " + topB + " number of primes = " + maxNumberOfPrimes);
        System.out.print("product of coeficients " + (topA*topB));
        return topA*topB;
    }

    public static long quadratic(long a, long b, long n) {
        return (n * n) + (a * n) + b;
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
