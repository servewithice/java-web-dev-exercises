package org.launchcode.java.studios.countingchars;
import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
    public static void main(String[] args) {
        String quote = "If the product of two terms is zero then common sense says that at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you've done that, it's pretty straightforward from there.";

        CountingCharacters.countChars(quote);
    }
}
