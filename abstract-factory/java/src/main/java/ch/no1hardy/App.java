package ch.no1hardy;

import ch.no1hardy.factory.OakFactory;
import ch.no1hardy.factory.SpruceFactory;
import ch.no1hardy.factory.WoodFactory;
import ch.no1hardy.item.Door;
import ch.no1hardy.item.Log;
import ch.no1hardy.item.Planks;

public class App {
    private final WoodFactory factory;

    public App(WoodFactory factory) {
        this.factory = factory;
    }

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
