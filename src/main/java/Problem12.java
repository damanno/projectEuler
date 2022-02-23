
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author damanno
 */
public class Problem12 {

    public static long highlyDivisibleTriangularNumber(int maxDivisor) {

        List<Integer> sequence = new ArrayList<>();
        boolean continua = true;
        int valor = 0;
        int iterator = 1;

        while (continua) {

            valor += iterator;

            int divisor = 2;
            while (divisor <= valor) {
                if ( valor % divisor == 0) {
                    sequence.add(divisor);
                } 
                    divisor++;
                
            }
            sequence.add(1);

            if (maxDivisor <= sequence.size()) {
                continua = false;
            }
            iterator++;
            sequence.clear();

        }

        return valor;

    }

}