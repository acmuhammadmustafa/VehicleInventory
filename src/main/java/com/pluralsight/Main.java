package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        Vehicle[] inventory = new Vehicle[6];

        inventory[0] = new Vehicle(230942, "Blue", "Lexus IS250", 120000, 11000);
        inventory[1] = new Vehicle(192341, "Red", "Ford Explorer", 100000, 10000);
        inventory[2] = new Vehicle(128342, "Cyan", "Toyota Corolla", 250000, 5000);
        inventory[3] = new Vehicle(958392, "Black", "Toyota Camry", 150000, 7000);
        inventory[4] = new Vehicle(690341, "White", "Honda CR-V", 250000, 7000);
        inventory[5] = new Vehicle(589302, "Grey", "Honda Accord", 250000, 5000);

        System.out.println(inventory[0]);
        }
}
