package org.launchcode.java.exercises;
import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven: ");
        Double miles = input.nextDouble();
        System.out.println("How many gallons of gas were consumed: ");
        Double gallons = input.nextDouble();
        input.close();

        Double milesPerGallon = miles / gallons;

        System.out.println("You got: " + milesPerGallon + "mpg.");
    }

}
