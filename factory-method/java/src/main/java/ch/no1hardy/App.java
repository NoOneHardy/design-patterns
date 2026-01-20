package ch.no1hardy;

import ch.no1hardy.interior.FruitStore;
import ch.no1hardy.interior.Jeweler;
import ch.no1hardy.interior.Store;
import ch.no1hardy.item.Item;

import java.util.Scanner;

/**
 * Main application class demonstrating the Factory Method pattern.
 * This class represents the client code that interacts with the shelves and items.
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Factory Method Pattern Example");
        System.out.println("--------------------------------");

        // Create instance of the application to access non-static methods
        App app = new App();
        app.enterMall();

        // Get an instance of the class implementing the factory method
        Store store = app.pickStore();

        System.out.println("--------------------------------");
        // This is the call to the factory method
        Item item = store.createItem();

        // Use the created item without knowing its concrete class
        item.use();
        System.out.println("This item costs: CHF " + item.getPrice());
    }

    /**
     * Simulate entering a mall using print statements.
     */
    public void enterMall() {
        System.out.println("You have entered the mall.");
        System.out.println("You see two stores: a fruit store and a jeweler.");
        System.out.println("Which store do you want to enter?");
        System.out.println("--------------------------------");
    }

    /**
     * Prompt the user to pick a store.
     * @return The selected Store instance providing the factory method.
     */
    public Store pickStore() {
        try (Scanner scan = new Scanner(System.in)) {

            while (true) {
                System.out.println("1. Fruit Store");
                System.out.println("2. Jeweler");
                System.out.print("Enter 1 or 2: ");
                int choice = scan.nextInt();

                // Return the selected store based on user input.
                switch (choice) {
                    case 1:
                        return new FruitStore();
                    case 2:
                        return new Jeweler();
                    default:
                        System.out.println("Invalid choice.");
                        System.out.println();
                }
            }
        }
    }
}