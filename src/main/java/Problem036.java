/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author damanno
 */
public class Problem036 {
    
    public static long sumOfAllDoubleBasePalindrome(int max) {
        
        long total = 0l;
        
        for (int i = 0 ; i < max ; i++) {
            total += isDoubleBasePalindrome(i) ? i : 0;
        }
        System.out.println(total);
        return total;
    }
    
    public static String convertToBinary(int number) {
        String binary = "";
        while ( number != 0 ) {
            binary = number%2+binary;
            number = number/2;
        }
        return binary;
    }
    
    public static String mirrorString(String toBeMirrored) {
        String mirrored = "";
        for (int i = toBeMirrored.length() ; i > 0; i-- ) {
            mirrored += toBeMirrored.substring(i-1, i);
        }
        return mirrored;
    }
    
    public static boolean isDoubleBasePalindrome(int number) {
        if (!String.valueOf(number).equals(mirrorString(String.valueOf(number)))) {
            return false;
        }
        String binary = convertToBinary(number);
        if (!binary.equals(mirrorString(binary))) {
            return false;
        }
        System.out.println("full palindromo " + number);
        return true;
    }
    
}
