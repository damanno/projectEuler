
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author damanno
 */
public class Problem026 {

    public static int longestReciprocalCycles(int max) {

        int flag = 1;
        int longest = 0;
        while (flag < max) {
            flag++;
            BigDecimal cycle = reciprocalCyclesOne(flag);

            if (longest < flag) {
                longest = flag;
            }
        }

        return 0;

    }

    public static BigDecimal reciprocalCyclesOne(int unit) {

        BigDecimal cycle = BigDecimal.ONE;

        List<Integer> remainderList = new ArrayList<>();
        int remainder = (1 % unit);
        boolean processing = true;
        String cycleBuilder = "0.";
        int sizeRemainder = 0;
        remainderList.add(remainder * 10);
        while (processing) {
            cycleBuilder += (remainder * 10) / unit;
            remainder = ((remainder * 10) % unit) * 10;
            if (remainderList.contains(remainder)) {
                processing = false;
                sizeRemainder = remainderList.lastIndexOf(remainder);
            }
            remainderList.add(remainder);
        }
        System.out.println(sizeRemainder);
        System.out.println("1/" + unit + " = " + cycleBuilder);

        return cycle;
    }

}
