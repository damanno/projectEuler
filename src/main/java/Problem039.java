
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
public class Problem039 {

    public static void testNumberRangeUnder1001RightTriangles() {
        System.out.println(testNumberRangeRightTriangles(1000));
    }
    
    public static int testNumberRangeRightTriangles(int maxRange) {
        int result = 0 ;
        int maxSolutions = 0 ;
        for (int i = 3 ; i <= maxRange ; i++  ) {
            int partialResult = integerRightTriangles(i);
            if (maxSolutions < partialResult) {
                System.out.println(i);
                result = i;
                maxSolutions = partialResult;
            }
            
        }
        return result;
    } 
    
    public static void testRightTriangles() {
        integerRightTriangles(120);
    }

    public static int integerRightTriangles(int maxValue) {
        List<Integer[]> listResults = new ArrayList<>();
        int initialValue = (int) Math.sqrt(maxValue);
        for (int i = initialValue; i <= maxValue; i++) {
            for (int f = i + 1; f <= maxValue; f++) {
                for (int h = f + 1; h <= maxValue; h++) {
                    if ((i+f+h)==maxValue && testRightAngle(i, f, h) ) {
                        Integer[] partialResult = {i , f, h};
                        listResults.add(partialResult);
                    }
                }
            }
        }
        return listResults.size();
    }

    public static boolean testRightAngle(int c1, int c2, int h) {

        int squareH = h * h;
        int formula = (c1 * c1) + (c2 * c2);

        return formula == squareH;

    }

}
