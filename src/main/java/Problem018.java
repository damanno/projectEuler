/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author damanno
 */
public class Problem018 {

    public static int[][] pyramidTest = {
        {3},
        {7, 4},
        {2, 4, 6},
        {8, 5, 9, 3}
    };
    public static int[][] pyramid = {
        {75},
        {95, 64},
        {17, 47, 82},
        {18, 35, 87, 10},
        {20, 4, 82, 47, 65},
        {19, 1, 23, 75, 3, 34},
        {88, 2, 77, 73, 7, 63, 67},
        {99, 65, 4, 28, 6, 16, 70, 92},
        {41, 41, 26, 56, 83, 40, 80, 70, 33},
        {41, 48, 72, 33, 47, 32, 37, 16, 94, 29},
        {53, 71, 44, 65, 25, 43, 91, 52, 97, 51, 14},
        {70, 11, 33, 28, 77, 73, 17, 78, 39, 68, 17, 57},
        {91, 71, 52, 38, 17, 14, 91, 43, 58, 50, 27, 29, 48},
        {63, 66, 4, 68, 89, 53, 67, 30, 73, 16, 69, 87, 40, 31},
        {4, 62, 98, 27, 23, 9, 70, 98, 73, 93, 38, 53, 60, 4, 23}
    };

    public static long maximumPathSumTest() {
        return maximumPathSum(pyramidTest);
    }

    public static long maximumPathSumSolution() {
        return maximumPathSum(pyramid);
    }

    public static int maximumPathSumNextLarger(int[][] pyramid) {

        int maxXY = 0;
        int maxXYTmp = 0;
        int maxXYvalue = 0;
        int sum = 0;
        for (int i = 0; i < pyramid.length; i++) {
            maxXYvalue = 0;
            for (int f = (pyramid[i].length < maxXY + 1 ? maxXY - 1 : maxXY); f <= (pyramid[i].length > 1 ? maxXY + 1 : 0); f++) {
                if (maxXYvalue < pyramid[i][f]) {
                    maxXYvalue = pyramid[i][f];
                    maxXYTmp = f;
                }
            }
            if (maxXYTmp != maxXY) {
                maxXY = maxXYTmp;
            }
            sum += pyramid[i][maxXY];
        }

        return sum;
    }

    public static int maximumPathSum(int[][] pyramid) {

        for (int i = pyramid.length - 1; i >= 0; i--) {
            for (int f = 0; f < pyramid[i].length - 1; f++) {
                int sumA = 0;
                int sumB = 0;
                if (i - 1 >= 0) {
                    sumA = pyramid[i][f] + pyramid[i - 1][f];
                }
                if (f + 1 < pyramid[i].length) {
                    sumB = pyramid[i][f+1] + pyramid[i - 1][f];
                }
                pyramid[i - 1][f] = sumA > sumB ? sumA : sumB;
            }
        }

        return pyramid[0][0];
    }

}
