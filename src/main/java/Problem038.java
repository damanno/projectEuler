/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author damanno
 */
public class Problem038 {

    public static boolean checkPandigital(String number) {
        if (number.length() != 9) {
            return false;
        }
        for (int i = 1; i <= number.length(); i++) {
            if (!number.contains(i + "") ) {
                return false;
            }
        }
        return true;
    }

    public static String pandigitalMultiples(long number) {
        String nineDigitPandigital = "";
        boolean run = true;
        long n = 1;
        while (run) {
            nineDigitPandigital += (n * number);
            if (nineDigitPandigital.length() >= 9 || n > 1) {
                run = false;
            }
            n++;
        }
        return nineDigitPandigital;
    }

    public static long getLargestPandigitalMultiplesRange() {
        String testPandigital = "";
        long n = 2;
        long maxResult = 0;
        while (n <= 1000000) {
            testPandigital = pandigitalMultiples(n);
            if (checkPandigital(testPandigital) && Long.parseLong(testPandigital) > maxResult) {
                    maxResult = Long.parseLong(testPandigital);
                }
            
            n++;
        }
        System.out.println(maxResult);
        return maxResult;
    }

}
