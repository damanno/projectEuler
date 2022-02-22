/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author damanno
 */
public class UtilMethods {
    
    
    public static boolean isPalindrome(int number) {

        String numberS = String.valueOf(number);
        int size = numberS.length();
        String numberZ = "";

        for (int i = size - 1; i >= 0; i--) {
            numberZ += numberS.charAt(i);
        }

        return numberZ.equals(numberS);
    }
    
    public static boolean isPrime(int n) {
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
