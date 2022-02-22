/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author damanno
 */
public class Problem3 {
    
    
    public static long largestPrimeFactor(long number) {
        boolean exit = false;
        int divisor = 2;
        int maiorNumero = 2;

        while (number > divisor) {
            if (number % divisor == 0) {
                number = number / divisor;
                if (maiorNumero < divisor) {
                    maiorNumero = divisor;
                    System.out.println(maiorNumero);
                }
                divisor = 2;
            } else {
                divisor++;
            }
        }
        return number;
    }

    
}
