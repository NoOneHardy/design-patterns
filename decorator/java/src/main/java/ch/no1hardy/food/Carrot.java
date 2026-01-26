package ch.no1hardy.food;

/**
 * A Concrete Component in the Decorator pattern.
 * Represents a basic, undecorated food item (a carrot) that can be eaten.
 * 
 * <p>This class provides the core functionality that can be wrapped by decorators
 * to add additional behavior (like side effects). It implements the Eatable interface
 * with a simple, straightforward eating behavior.</p>
 */
public class Carrot implements Eatable {
    /**
     * Implements the eating behavior for a carrot.
     * Displays a simple message indicating that a carrot was eaten.
     */
    @Override
    public void eat() {
        System.out.println("You eat a carrot. Crunch!");
    }
}
