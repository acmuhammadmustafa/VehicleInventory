package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vehicle[] inventory = new Vehicle[20];
        int quantityOfVehicles;


        inventory[0] = new Vehicle(230942, "Lexus IS250", "Blue", 120000, 11000);
        inventory[1] = new Vehicle(230943, "BMW X5", "Black", 80000, 22000);
        inventory[2] = new Vehicle(230944, "Audi A4", "White", 95000, 15000);
        inventory[3] = new Vehicle(230945, "Ford F-150", "Red", 60000, 27000);
        inventory[4] = new Vehicle(192341, "Ford Explorer", "Red", 100000, 10000);
        inventory[5] = new Vehicle(128342, "Toyota Corolla", "Cyan", 250000, 5000);
        inventory[6] = new Vehicle(958392, "Toyota Camry", "Black", 150000, 7000);
        inventory[7] = new Vehicle(690341, "Honda CR-V", "White", 250000, 7000);

        int quantityOfVehicles = inventory.length;


        int command;
        do {
            System.out.println("What do you want to do?");
            System.out.println(" 1 - List all vehicles");
            System.out.println(" 2 - Search by make/model");
            System.out.println(" 3 - Search by price range");
            System.out.println(" 4 - Search by color");
            System.out.println(" 5 - Add a vehicle");
            System.out.println(" 6 - Quit");
            System.out.println("Enter your command: ");
            command = scanner.nextInt();

            switch (command) {
                case 1:
                    listAllVehicles();
                    break;
                case 2:
                    findVehiclesByPrice();
                    break;
                case 5:
                    addAVehicle();
                    break;
                case 6:
                    return;
            }


        } while(command != 6);
    }

    private static void listAllVehicles() {
        System.out.println("Listing out vehicles...");
        for(Vehicle v : invento ){
            System.out.println(_.getVehicleID);
        }
    }

    private static void findVehiclesByPrice() {

    }

    private static void addAVehicle() {

    }
}
