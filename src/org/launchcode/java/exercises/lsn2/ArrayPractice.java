package org.launchcode.java.exercises.lsn2;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] someInts = {1, 1, 2, 3, 5, 8};
        for (int i=0; i < someInts.length; i++) {
            int num = someInts[i];
            if (num%2==1) {
                System.out.println(someInts[i]);
            }
        }

        String sentence = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] phrases = sentence.split("\\.");
        System.out.println(Arrays.toString(phrases));
    }
}
