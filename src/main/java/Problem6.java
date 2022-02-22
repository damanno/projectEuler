/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author damanno
 */
public class Problem6 {
    
    
    public static long differenceSumSquareSquareSum(int number) {

        long sumSquare = 0l;
        long squareSum = 0l;

        for (int i = 1; i <= number; i++) {
            sumSquare += i * i;
            squareSum += i;
        }

        return (squareSum * squareSum) - sumSquare;
    }
    
}
