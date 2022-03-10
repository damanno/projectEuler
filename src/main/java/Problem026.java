
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
            int cycle = reciprocalCyclesOne(flag);

            if (longest < cycle) {
                longest = flag;
            }
        }
        
        System.out.println("x - > " + longest);

        return longest;

    }

    public static int reciprocalCyclesOne(int unit) {

        int cycle = 0;

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
            } else {
                remainderList.add(remainder);
            }
        }
        System.out.println("1/" + unit + " = " + cycleBuilder.substring(0,cycleBuilder.length()-1));

        
        return cycleBuilder.substring(0,cycleBuilder.length()-1).length();
    }

}
