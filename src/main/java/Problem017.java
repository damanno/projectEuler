
import java.math.BigInteger;

/*
 * To change this license header, chIoose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author damanno
 */
public class Problem017 {

    private static String[] DIGIT_WORDS = {
        "zero", "one", "two", "three", "four",
        "five", "six", "seven", "eight", "nine"};
    private static String[] TENS_WORDS = {
        "ten", "twenty", "thirty", "forty", "fifty",
        "sixty", "seventy", "eighty", "ninety"};
    private static String[] TEENS_WORDS = {
        "ten", "eleven", "twelve", "thirteen", "fourteen",
        "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    
    private static String getHundredWords(int num) {
        if (num > 9999 || num < 0) {
            throw new IllegalArgumentException(
                    "Cannot get word of a number not in the range 0-9999");
        }
        if (num == 0) {
            return "zero";
        }
        String ret = "";
        if (num > 999) {
            ret += DIGIT_WORDS[num / 1000] + " thousand ";
            num %= 1000;
        } 
        if (num > 99) {
            if (ret!="") {
                ret += "and ";
            }
            ret += DIGIT_WORDS[num / 100] + " hundred ";
            num %= 100;
        }
        if (num < 20 && num > 9) {
            if (ret!="") {
                ret += "and ";
            }
            ret += TEENS_WORDS[num % 10];
        } else if (num < 10 && num > 0) {
            if (ret!="") {
                ret += "and ";
            }
            ret += DIGIT_WORDS[num];
        } else if (num != 0) {
            if (ret!="") {
                ret += "and ";
            }
            ret += TENS_WORDS[num / 10 - 1];
            if (num % 10 != 0) {
                ret += " " + DIGIT_WORDS[num % 10];
            }
        }

        return ret.trim();
    }

    public static long numberLetterCounts(int x) {
        
        long total = 0l;
        
        for (int i = 1; i <= x; i++) {
            String letters = getHundredWords(i);
            
            letters = letters.trim();
            letters = letters.replaceAll(" ", "");
            System.out.println(letters);
            long size = letters.length();
            total+=size;
        }
        
        return total;
    }

}
