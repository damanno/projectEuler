
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
public class Main {

    public static double total = 0d;
    public static long totalL = 0l;

    public static void main(String[] args) {
        /*
        total = calculaRendimento(0, 4, 0.5, 100);
        total = multiples3or5(1000);
        total = evenFibonacci(10, 4000000);
        totalL = largestPrimeFactor(600851475143l);
        largestPalidromeFromProduct();
        totalL = smallestDivisibleNumberByAllNumbers(1, 20);
        totalL = differenceSumSquareSquareSum(100);
        totalL = primeNumberPosition(10001);
        totalL = Problem9.pythagoreanTriplet(1000);
        totalL = Problem10.summationPrimes(2_000_000);
         */
        
        totalL = Problem12.highlyDivisibleTriangularNumber(5);

        System.out.println("total " + total);
        System.out.println("totalL " + totalL);

    }

}