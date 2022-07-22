package org.launchcode.java.exercises.lsn2;

import org.launchcode.java.demos.lsn1datatypes.Message;

import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> someInts = new ArrayList<>();
        someInts.add(1);
        someInts.add(2);
        someInts.add(3);
        someInts.add(4);
        someInts.add(5);
        someInts.add(6);
        someInts.add(7);
        someInts.add(8);
        someInts.add(9);
        someInts.add(10);

        int total = EvenSum.evenSum(someInts);
        System.out.println(total);

        ArrayList<String> someWords = new ArrayList<>();
        someWords.add("think");
        someWords.add("carol");
        someWords.add("tinker");
        someWords.add("shout");
        someWords.add("aroundabouts");
        someWords.add("nouns");

        PrintByLetters.printByLetter(someWords);
    }
}
