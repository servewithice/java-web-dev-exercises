package org.launchcode.java.studios.areaofcircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double radius = input.nextDouble();
        input.close();

        double area = Circle.getArea(radius);
        System.out.println(String.format("The area of a circle of radius %s is: %s", radius, area));
    }
}
