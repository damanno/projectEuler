
import java.math.BigDecimal;
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
public class Problem029 {

    public static List<BigDecimal> listDistinctResult;
    
    public static int testAmountDistinctPowers() {
        return amountDistinctPowers(2d, 5d);
    }

    public static int amountDistinctPowers(double a, double b) {

        listDistinctResult = new ArrayList<>();

        for (double i = a; i <= b; i++) {
            for (double f = a; f <= b; f++) {
                BigDecimal result = new BigDecimal(Math.pow(i, f));
                if (!listDistinctResult.contains(result)) {
                    listDistinctResult.add(result);
                }
            }
        }
        return listDistinctResult.size();

    }

}
