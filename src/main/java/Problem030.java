
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author damanno
 */
public class Problem030 {
 
    public static void digitFourthPower() {
        digitNumberPower(4);
    }
    
    public static void digitFifthPower() {
        digitNumberPower(5);
    }
    
    public static int digitNumberPower(int number) {
        List<Integer> listValidResults = new ArrayList<>();
        int i = 2;
        int total = 0;
        int result = 0;
        int max = 0;        
        for (int f = 0; f < number; f++) {
            max+= Math.pow(9 , number);
        }        
        while (i <= max) {
            char[] brokenI = String.valueOf(i).toCharArray();
            total = 0;
            for (int f = 0 ; f < brokenI.length ; f++ ) {
                total += Math.pow(Integer.parseInt(String.valueOf(brokenI[f])) , number);
            }
            if (total==i) {
                listValidResults.add(i);
            }
            i++;
        }
        result = 0;
        for (Integer validResult : listValidResults ) {
            result += validResult;
        }
        return result;
    }
    
}
