
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
public class Problem023 {

    public static long sumOfNomAbundantNumbers() {

        List<Integer> abundantNumbers = new ArrayList<>();
        List<Integer> abundantNumbersSum = new ArrayList<>();
        int max = 28123;
        int min = 12;
        int flag = 0;
        
        for (int i = min; i <= max; i++) {
            int result = abundantNumberSum(i);
            if (result > i) {
                abundantNumbers.add(i);
                flag++;
            }
        }

        for (int i = 0; i < abundantNumbers.size(); i++) {
            for (int f = i; f < abundantNumbers.size(); f++) {
                
                int sumTmp = abundantNumbers.get(i) + abundantNumbers.get(f);
                if (!abundantNumbersSum.contains(sumTmp) && sumTmp < max ) {
                    abundantNumbersSum.add(sumTmp);
                }
            }
        }
        long sum = 0l;
        for (int i = 0; i < max; i++) {
            if (!abundantNumbersSum.contains(i)) {
                sum += i;
            }
        }

        return sum;
    }

    public static int abundantNumberSum(int number) {
        int sum = 0;
        for (int i = (number / 2) + 1; i > 0; i--) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

}
