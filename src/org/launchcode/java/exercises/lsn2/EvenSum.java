package org.launchcode.java.exercises.lsn2;

import java.util.ArrayList;

public class EvenSum {
    public static int evenSum(ArrayList<Integer> arr) {
        int sum = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                sum += integer;
            }
        }
        return sum;
    }
}
