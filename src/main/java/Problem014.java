
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
public class Problem014 {

    public static BigInteger returnNumberProducesLargestCollatzChain(int largestNumber) {

        BigInteger chainSize = BigInteger.ZERO;
        BigInteger numberThatProducesLongestChain = BigInteger.ZERO;

        for (int i = largestNumber; i > 0; i--) {
            BigInteger currentChainSize = BigInteger.valueOf(2l);
            BigInteger number = BigInteger.valueOf(i);
            BigInteger numberTmp = number;
            while ( numberTmp.compareTo(BigInteger.valueOf(2l)) == 1 ) {
                currentChainSize = currentChainSize.add(BigInteger.ONE);
                if ( numberTmp.mod(BigInteger.valueOf(2l)) == BigInteger.ZERO ) {
                    //n/2
                    numberTmp = numberTmp.divide(BigInteger.valueOf(2l));
                } else {
                    //(n*3)+1
                    numberTmp = numberTmp.multiply(BigInteger.valueOf(3l)).add(BigInteger.ONE);
                }
            }
            
            if (chainSize.compareTo(currentChainSize) == -1) {
                chainSize = currentChainSize;
                numberThatProducesLongestChain = number;
            }
        }

        return numberThatProducesLongestChain;

    }

}
