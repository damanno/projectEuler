
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
public class Problem032 {

    public static void pandigitalProduct() {

        List<Integer> resultList = new ArrayList<>();

        for (int i = 1; i < 999; i++) {
            for (int f = 1; f < 999; f++) {
                int total = i * f;
                if (checkPandigital(i, f, total)) {
                    if (!resultList.contains(total)) {
                        resultList.add(total);
                    }
                }
            }
        }
        int total = 0;
        for (Integer i : resultList) {
            total += i;
        }
        
        System.out.println("total = " + total);

        System.out.println("total size: " + resultList.size());
        System.out.println("its over");

    }

    public static boolean checkPandigital(int i, int f, int result) {
        String checked = i + "" + f + "" + result;
        if (checked.length() != 9) {
            return false;
        }
        if (checked.contains("1") && checked.contains("2") && checked.contains("3") && checked.contains("4")
                && checked.contains("5") && checked.contains("6") && checked.contains("7") && checked.contains("8")
                && checked.contains("9")) {
            return true;
        }
        return false;
    }

}
