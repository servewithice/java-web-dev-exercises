package org.launchcode.java.exercises;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a search term: ");
        String search = input.next();
        input.close();

        if (sentence.toUpperCase().contains(search.toUpperCase())) {
            System.out.println("True");
            int index = sentence.toUpperCase().indexOf(search.toUpperCase());
            int length = search.length();
            System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
            String newSentence = sentence.replace(search, "");
            System.out.println(newSentence);
        }
    }
}
