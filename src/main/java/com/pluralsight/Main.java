package com.pluralsight;

import java.util.Scanner;

public class Main {
    private static Vehicle[] inventory = new Vehicle[20];
    private static int quantityOfVehicles;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        inventory[0] = new Vehicle(230942, "Lexus IS250", "Blue", 120000, 11000);
        inventory[1] = new Vehicle(230943, "BMW X5", "Black", 80000, 22000);
        inventory[2] = new Vehicle(230944, "Audi A4", "White", 95000, 15000);
        inventory[3] = new Vehicle(230945, "Ford F-150", "Red", 60000, 27000);
        inventory[4] = new Vehicle(192341, "Ford Explorer", "Red", 100000, 10000);
        inventory[5] = new Vehicle(128342, "Toyota Corolla", "Cyan", 250000, 5000);
        inventory[6] = new Vehicle(958392, "Toyota Camry", "Black", 150000, 7000);
        inventory[7] = new Vehicle(690341, "Honda CR-V", "White", 250000, 7000);

        quantityOfVehicles = 8;



        int command;
        do {
            System.out.println("What do you want to do?");
            System.out.println(" 1 - List all vehicles");
            System.out.println(" 2 - Search by make/model");
            System.out.println(" 3 - Search by price range");
            System.out.println(" 4 - Search by color");
            System.out.println(" 5 - Add a vehicle");
            System.out.println(" 6 - Quit");
            command = ConsoleHelper.promptForInt("Enter your command");

            switch (command) {
                case 1:
                    listAllVehicles();
                    break;
                case 2:
                    findVehiclesByMakeModel();
                    break;
                case 3:
                    findVehiclesByPrice();
                    break;
                case 4:
                    findVehiclesByColor();
                    break;
                case 5:
                    addAVehicle();
                    break;
                case 6:
                    return;
                default:
                    System.out.printf("Invalid Command. Please enter a valid number.\n");
                    System.out.println("===================");
            }


        } while(command != 6);
    }

    private static void findVehiclesByColor() {
        String colorToSearchFor = ConsoleHelper.promptForString("Please enter a color to search for: ");
    
    for (Vehicle v :inventory){
        if(v == null){
            continue;
        }
        if (v.getColor().contains(colorToSearchFor)){
            displayVehicle(v);
        }
    }
    }


    private static void findVehiclesByMakeModel() {
        // prompt the user for the make/model to search for.
        String makeModelToSearchFor = ConsoleHelper.promptForString("Please enter a make/model to search for: ");
        

        //loop through inventory and add any matching value to results.
        for (Vehicle v : inventory) {
            if(v == null){
                continue;
            }
            if (v.getMakeModel().contains(makeModelToSearchFor)){
                displayVehicle(v);
            }
        }
    }
    private static void findVehiclesByPrice() {
        Float minPrice = ConsoleHelper.promptForFloat("Please enter the minimum price range you're searching for ");
        Float maxPrice = ConsoleHelper.promptForFloat("Please enter the maximum price range you're searching for: ");

        for (Vehicle v : inventory){
            if(v == null){
                continue;
            }
            if (v.getPrice()>= minPrice && v.getPrice()<= maxPrice){
                displayVehicle(v);
            }
        }
    }
    private static void displayVehicle(Vehicle v){
        System.out.print(v.getVehicleID()+" ");
        System.out.println(v.getColor()+ " " + v.getMakeModel());
    }

    private static void listAllVehicles() {
        System.out.println("Listing out vehicles...");
        for(Vehicle v : inventory ){
            if(v == null){
                continue;
            }
            System.out.println(v.getVehicleID()+ " " + v.getMakeModel());
        }
    }



    private static void addAVehicle() {
         long vehicleID = ConsoleHelper.promptForLong("What is the vehicle ID");
         String makeModel = ConsoleHelper.promptForString("Please enter the make/model");
         String color = ""; ConsoleHelper.promptForString("Please enter the color");
         int odometerReading = ConsoleHelper.promptForInt("please enter the mileage");
         float price = ConsoleHelper.promptForFloat("What is the cost of the vehicle");

         Vehicle newVehicle = new Vehicle(vehicleID,makeModel,color,odometerReading,price);
         int addNewVehicle = 0;

        for (int i = 0; i< Main.inventory.length; i++){
            if (Main.inventory[i] == null){
                addNewVehicle = i;
                break;
            }
        }

        Main.inventory[addNewVehicle] = new Vehicle(vehicleID, makeModel, color, odometerReading, price);

    }
}
