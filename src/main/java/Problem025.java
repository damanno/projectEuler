
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
public class Problem025 {

    public static int hundredDigitFibonacciNumber() {
        return 0;
    }

    public static long digitFibonacciNumber() {
        return fibonnatiSequenceIndex(1000);
    }

    public static long fibonnatiSequenceIndex( int size ){
        long currentLenght = 0l;
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;
        int index = 0;
        while (size > currentLenght ) {
            BigInteger c = a;
            a = a.add(b);
            b = c;
            currentLenght = String.valueOf(b).length();
            System.out.println("F" + index + "  = " + b + " digits " + String.valueOf(b).length());
            index++;
        }
        return index;
    }

}
