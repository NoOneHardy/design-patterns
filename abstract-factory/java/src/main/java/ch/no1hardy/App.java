package ch.no1hardy;

import ch.no1hardy.factory.OakFactory;
import ch.no1hardy.factory.SpruceFactory;
import ch.no1hardy.factory.WoodFactory;
import ch.no1hardy.item.Door;
import ch.no1hardy.item.Log;
import ch.no1hardy.item.Planks;

/**
 * Demonstrates the Abstract Factory design pattern using a wood-themed example.
 * 
 * <p>The Abstract Factory pattern provides an interface for creating families of related
 * or dependent objects without specifying their concrete classes. In this example, different
 * wood factories (Oak and Spruce) create consistent families of wood products (doors, logs, planks).
 * 
 * <p>This allows the client code to work with abstract product types (Door, Log, Planks) 
 * without knowing the specific concrete implementations being used.
 */
public class App {
    /** The factory used to create wood-related items. */
    private final WoodFactory factory;

    /**
     * Constructs a new App with the specified wood factory.
     * 
     * @param factory the factory to use for creating wood items
     */
    public App(WoodFactory factory) {
        this.factory = factory;
    }

    /**
     * Main entry point demonstrating the Abstract Factory pattern.
     * 
     * <p>Creates two different concrete factories (Spruce and Oak) and demonstrates
     * how each factory produces a consistent family of related products. The client
     * code (this main method) works with abstract product types and doesn't need to
     * know the concrete implementation details.
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println("Abstract Factory Pattern Example");

        WoodFactory factory = new SpruceFactory(); // Create a factory for a specific type of wood
        App spruceApp = new App(factory);          // Pass the factory to the application
        System.out.println("Using Spruce Factory:");
        spruceApp.run();                           // Run the application

        OakFactory oakFactory = new OakFactory(); // Create a factory for oak wood
        App oakApp = new App(oakFactory);         // Pass the oak factory to a new application
        System.out.println("\nUsing Oak Factory:");
        oakApp.run();                             // Run the oak application
    }

    /**
     * Runs the application by creating and using wood items from the factory.
     * 
     * <p>Demonstrates how the factory pattern allows client code to work with
     * abstract product interfaces (Door, Log, Planks) without knowing the
     * specific concrete types being instantiated.
     */
    public void run() {
        Door door = factory.createDoor(); // Create a door using the factory
        door.open();                      // Use the door

        Log log = factory.createLog();   // Create a log using the factory
        log.chop();                      // Use the log
        log.strip();                     // Use the log again

        Planks planks = factory.createPlanks(); // Create planks using the factory
        planks.place();                         // Use the planks
    }
}
