/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author damanno
 */
public class Problem2 {
    
    
    public static double evenFibonacci(int number, int maximo) {

        int fibonacciNumber = 1;
        int fibonacciNumberAfter = 0;
        int fibonacciNumberBefore = 1;
        int total = 0;

        while (fibonacciNumber < maximo) {

            fibonacciNumberAfter = fibonacciNumber + fibonacciNumberBefore;
            fibonacciNumberBefore = fibonacciNumber;
            fibonacciNumber = fibonacciNumberAfter;
            if (fibonacciNumber < maximo) {
                if (fibonacciNumber % 2 == 0) {
                    total += fibonacciNumber;
                }
            }
        }

        return total;
    }
    
}
