/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author damanno
 */
public class Problem019 {

    public static int countingSundays() {

        String[] week = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int initialWeekDay = 1;
        int initialYear = 1901;
        int lastYear = 2001;
        int[] daysMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int result = 0;

        for (int year = initialYear; year < lastYear; year++) {
            for (int m = 0; m < 12; m++) {
                int numberOfDays = m == 1 && isLeapingYears(year) ? 29 : daysMonth[m];
                for (int d = 0; d < numberOfDays; d++) {
                    initialWeekDay++;
                    if (initialWeekDay % 7 == 0) {
                        initialWeekDay = 0;
                    }
                    System.out.println( d+1 + " / " + (m+1) + " / " + year + " - " + week[initialWeekDay]);
                    if (d==0 && initialWeekDay==0) {
                        result++; 
                    }
                }
            }
        }
        return result;
    }

    public static boolean isLeapingYears(int year) {
        boolean result = false;
        if (year % 4 == 0) {
            result = true;
            if (year % 100 == 0 && year % 400 != 0) {
                result = false;
            }
        }
        return result;

    }

}
