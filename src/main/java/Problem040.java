/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author damanno
 */
public class Problem040 {

    public static final int maxSize = 1000000;

    public static String generateIrrationalFraction() {

        String result = "0.";
        int i = 1;

        while (result.length() <= maxSize) {
            result += i;
            i++;
        }

        return result;
    }

    public static int getProductFromIrrationalConstant() {
        int result = 1;
        int interval = 1;

        String irrationalFraction = generateIrrationalFraction();

        for (int i = 0; i < 6; i++) {
            result *= Integer.parseInt(irrationalFraction.substring(interval + 1, interval + 2));
            System.out.println(irrationalFraction.substring(interval + 1, interval + 2));
            interval *= 10;
        }
    System.out.println("result = " + result);
        return result;
    }

}
