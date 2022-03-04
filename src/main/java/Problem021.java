/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author damanno
 */
public class Problem021 {

    public static int amicableNumbers(int number) {

        int sum = 0;
        for (int i = 1 + (number / 2); i > 0; i--) {
            if (number % i == 0) {
                sum += i;
            }
        }
        int sumAmicable = 0;
        for (int i = 1 + (sum / 2); i > 0; i--) {
            if (sum % i == 0) {
                sumAmicable += i;
            }
        }
        boolean amicable = ( number==sumAmicable && number!=sum );
        if (amicable) {
            System.out.print(sum + "> " + number + " > " + sum);
        }
        return amicable ? number : 0;
    }
    
    public static int sumAmicableNumbersUnder(int max) {
        int sum = 0;
        for (int i = 0 ; i < max ; i++ ) {
            int number=  amicableNumbers(i);
            if(number>0) {
                System.out.println(i);
                sum += i;
            } 
        }
        return sum;
    }

}
