
import util.UtilMethods;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author damanno
 */
public class Problem004 {
    
    
    public static int largestPalidromeFromProduct() {

        int twoDigitsOne = 1;
        int twoDigitsTwo = 1;

        int largestPalindrome = 0;

        for (int i = 100; i < 1000; i++) {
            for (int f = 100; f < 1000; f++) {
                int total = i * f;
                if (UtilMethods.isPalindrome(total) && total > largestPalindrome) {
                    largestPalindrome = total;
                    System.out.println(total);
                }
            }
        }

        int threeDigits = 1;

        return 0;
    }
    
}
