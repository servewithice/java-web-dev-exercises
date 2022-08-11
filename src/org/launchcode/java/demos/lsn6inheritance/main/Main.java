package org.launchcode.java.demos.lsn6inheritance.main;

import org.launchcode.java.demos.lsn6inheritance.main.HouseCat;

public class Main {
    public static void main(String[] args) {
        HouseCat garfield = new HouseCat("Garfield", 12);
        garfield.eat();
        System.out.println(garfield.isTired());

        HouseCat trouble = new HouseCat("Trouble");
        System.out.println(trouble.getWeight());
    }
}
