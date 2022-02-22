/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author damanno
 */
public class Problem5 {
    
    
    public static long smallestDivisibleNumberByAllNumbers(int rangeInit, int rangeEnd) {

        int smallestNumber = 0;
        boolean _continue = true;
        while (_continue) {
            smallestNumber++;
            _continue = false;
            for (int i = rangeInit; i <= rangeEnd; i++) {
                if (smallestNumber % i != 0) {
                    _continue = true;
                }
            }
        }
        return smallestNumber;

    }
    
}
