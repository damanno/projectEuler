/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author damanno
 */
public class Problem034 {

    public static void findAllDigitFactorials() {
        long sum = 0l;
        for (int i = 3; i < 99999; i++) {
            if (digitFactorials(i)) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    public static boolean digitFactorials(int number) {
        long sum = 0l;
        String curiousNumber = String.valueOf(number);
        for (int f = 0; f < curiousNumber.length(); f++) {
            long sumTmp = 1l;
            int maxPow = Integer.parseInt(String.valueOf(curiousNumber.charAt(f)));
            for (int pow = 1; pow <= maxPow; pow++) {
                sumTmp *= pow;
            }
            sum += sumTmp;
        }
        return sum == number;
    }

}
