package ch.no1hardy.food;

/**
 * A Concrete Component in the Decorator pattern.
 * Represents a puffer fish food item that can be eaten.
 * 
 * <p>This is another concrete implementation of Eatable that can be decorated
 * with multiple decorators (like poison and nausea effects). Demonstrates how
 * decorators can be stacked to add multiple layers of behavior.</p>
 */
public class PufferFish implements Eatable {
    /**
     * Implements the eating behavior for a puffer fish.
     * Displays a warning message about the spikes when eaten.
     */
    @Override
    public void eat() {
        System.out.println("You eat a puffer fish. Watch out for the spikes!");
    }
}
