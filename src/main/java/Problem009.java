/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author damanno
 */
public class Problem009 {

    public long pythagoreanTriplet(int sumResult) {

        long product = 0;

        for (int a = 1; a < sumResult; a++) {
            for (int b = a+1; b < sumResult; b++) {
                for (int c = a+2; c < sumResult ; c++) {
                    if ((a+b+c)==sumResult) {
                        if (c*c == a*a + b*b) {
                        product = a * b * c;
                        }
                    }
                }
            }
        }

        return product;

    }

}
