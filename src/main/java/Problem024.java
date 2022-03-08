
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
public class Problem024 {

    public static String rangeSmallTest = "012";
    public static String rangeTest = "01234";
    public static String range = "0123456789";

    public static void lexicographicPermutationTest() {
        permutation(range, 1000000);
    }


    public static String permutation(String permutable, int resultNeeded) {
        List<String> listPermutation = new ArrayList<>();
        listPermutation = lexiconPermutationBuilder(permutable, "", listPermutation);

        return listPermutation.get(resultNeeded-1);
    }
    
    public static List<String> lexiconPermutationBuilder(String permutable, String partial, List<String> permutableList) {
        for (int i = 0; i < permutable.length(); i++) {
            int tamanhoParcial = partial.length();
            boolean contains = partial.contains(i + "");
            if (!contains) {
                partial += "" + i;
                if (permutable.length() - 1 == tamanhoParcial) {
                    permutableList.add(partial);
                } else {
                    permutableList = lexiconPermutationBuilder(permutable, partial, permutableList);
                }
                partial = partial.substring(0, tamanhoParcial);
            }
        }
        return permutableList;
    }


}
