package ch.no1hardy.food;

/**
 * A Concrete Component in the Decorator pattern.
 * Represents a basic spider eye food item that can be eaten.
 * 
 * <p>Like other concrete components, this class can be wrapped by decorators
 * to add side effects (such as poisoning). It provides the base eating behavior
 * that decorators can enhance.</p>
 */
public class SpiderEye implements Eatable {
    /**
     * Implements the eating behavior for a spider eye.
     * Displays a message indicating that a spider eye was eaten.
     */
    @Override
    public void eat() {
        System.out.println("You eat a spider eye. Yuck!");
    }
}
