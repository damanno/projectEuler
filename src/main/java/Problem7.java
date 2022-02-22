/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author damanno
 */
public class Problem7 {
    
    
    public static long primeNumberPosition(int position) {

        int i = 2;
        int quantidadeDivisoes = 0;
        int quantidadeNumeroPrimo = 0;
        int numeroPrimo = 0;

        while (position > quantidadeNumeroPrimo) {
            for (int f = 2; f <= i; f++) {
                if (i % f == 0) {
                    quantidadeDivisoes++;
                    numeroPrimo = f;
                }
            }
            if (quantidadeDivisoes == 1) {
                quantidadeNumeroPrimo++;
            }
            quantidadeDivisoes = 0;
            i++;
        }

        return numeroPrimo;
    }
    
}
