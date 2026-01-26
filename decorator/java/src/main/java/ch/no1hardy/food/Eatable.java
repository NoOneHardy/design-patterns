package ch.no1hardy.food;

/**
 * The Component interface for the Decorator pattern.
 * Defines the common interface for both concrete food items and their decorators.
 * 
 * <p>In the Decorator pattern, this interface serves as the base type that both
 * the concrete components (actual food items) and decorators implement, allowing
 * decorators to wrap components transparently.</p>
 */
public interface Eatable {
    /**
     * Executes the eating behavior.
     * 
     * <p>This method will be implemented by concrete food items to define their
     * basic eating behavior, and overridden by decorators to add additional
     * behavior before or after delegating to the wrapped component.</p>
     */
    void eat();
}
