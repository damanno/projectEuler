/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author damanno
 */
public class Problem033 {

    public static float productDigitCancelligFractions() {

        float product = 1f;

        for (float i = 11; i <= 99; i++) {
            for (float f = 11; f <= 99; f++) {

                float oneDigit1 = Integer.parseInt(String.valueOf(i).substring(0, 1));
                float oneDigit1_1 = Integer.parseInt(String.valueOf(i).substring(1, 2));
                float oneDigit2 = Integer.parseInt(String.valueOf(f).substring(1, 2));
                float oneDigit2_2 = Integer.parseInt(String.valueOf(f).substring(0, 1));

                if (oneDigit1_1 != 0 && oneDigit2_2 != 0 && oneDigit1 == oneDigit2 && oneDigit1 != oneDigit1_1 && oneDigit2 != oneDigit2_2) {
                    float fraction1 = i / f;
                    float fraction2 = oneDigit1_1 / oneDigit2_2;

                    if (fraction1 == fraction2) {
                        System.out.println(i + "/" + f + " = " + oneDigit1_1 + "/" + oneDigit2_2);
                        product *= fraction1;
                    }
                    
                }
            }
        }
        System.out.println(product);
        return product;

    }

}
