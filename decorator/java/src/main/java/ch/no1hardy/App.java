package ch.no1hardy;

import ch.no1hardy.decorator.NauseaEatableDecorator;
import ch.no1hardy.decorator.PoisonEatableDecorator;
import ch.no1hardy.food.Carrot;
import ch.no1hardy.food.Eatable;
import ch.no1hardy.food.PufferFish;
import ch.no1hardy.food.SpiderEye;

/**
 * Demonstration of the Decorator Design Pattern.
 * 
 * <p>This application showcases how the Decorator pattern allows you to add
 * responsibilities to objects dynamically without modifying their classes.
 * It demonstrates three scenarios:</p>
 * <ol>
 *   <li>Using a plain object (undecorated carrot)</li>
 *   <li>Using a single decorator (spider eye with poison)</li>
 *   <li>Stacking multiple decorators (puffer fish with both poison and nausea)</li>
 * </ol>
 * 
 * <p>The Decorator pattern is useful when you want to add behavior to individual
 * objects without affecting other objects of the same class. In this Minecraft-inspired
 * example, different foods can have different side effects applied to them.</p>
 */
public class App {
    /**
     * Main entry point demonstrating the Decorator pattern with food items.
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println("Decorator Pattern Example");

        // Scenario 1: Using a concrete component without any decorators
        // This shows the base behavior without any enhancements
        System.out.println("\nEating a simple carrot:");
        Eatable carrot = new Carrot();
        carrot.eat();

        // Scenario 2: Wrapping a concrete component with a single decorator
        // The PoisonEatableDecorator adds poison effects to the spider eye
        System.out.println("\nEating a decorated spider eye:");
        Eatable spiderEye = new PoisonEatableDecorator(
                new SpiderEye()
        );
        spiderEye.eat();

        // Scenario 3: Stacking multiple decorators on a single object
        // This demonstrates the power of the Decorator pattern - you can combine
        // multiple decorators in any order to achieve different combinations of behavior.
        // Here, the puffer fish is wrapped first with NauseaEatableDecorator,
        // and then that result is wrapped with PoisonEatableDecorator.
        System.out.println("\nEating a puffer fish with multiple decorators:");
        Eatable pufferFish = new PoisonEatableDecorator(
                new NauseaEatableDecorator(
                        new PufferFish()
                ));
        pufferFish.eat();
    }
}
