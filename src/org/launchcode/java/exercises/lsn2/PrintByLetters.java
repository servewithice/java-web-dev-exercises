package org.launchcode.java.exercises.lsn2;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintByLetters {
    public static void printByLetter(ArrayList<String> arr) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word length: ");
        int numChars = input.nextInt();
        input.close();

        for (String word : arr) {
            if (word.length() == numChars) {
                System.out.println(word);
            }
        }
    }
}
