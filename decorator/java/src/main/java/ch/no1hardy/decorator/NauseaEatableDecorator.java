package ch.no1hardy.decorator;

import ch.no1hardy.food.Eatable;

/**
 * A Concrete Decorator that adds nausea side effects to eating.
 * 
 * <p>This decorator wraps an Eatable object and adds nausea-related behavior
 * before and after the core eating action. It demonstrates how multiple decorators
 * can be stacked (e.g., both NauseaEatableDecorator and PoisonEatableDecorator
 * can wrap the same food item).</p>
 * 
 * <p>This decorator follows the same pattern as PoisonEatableDecorator but adds
 * different side effects, showing how the Decorator pattern allows for flexible
 * combinations of behaviors.</p>
 */
public class NauseaEatableDecorator extends BaseEatableDecorator {
    /**
     * Constructs a new NauseaEatableDecorator that wraps the given Eatable.
     * 
     * @param eatable the Eatable object to be decorated with nausea effects
     */
    public NauseaEatableDecorator(Eatable eatable) {
        super(eatable);
    }

    /**
     * Adds nausea effects before and after eating the wrapped food.
     * 
     * <p>Execution flow:</p>
     * <ol>
     *   <li>Before: Displays a message that you don't feel nauseous yet</li>
     *   <li>During: Calls super.eat() to delegate to the wrapped object</li>
     *   <li>After: Displays a message about feeling nauseous</li>
     * </ol>
     */
    @Override
    public void eat() {
        // Behavior added before the core eating action
        System.out.println("You don't feel nauseous yet...");
        
        // Delegate to the wrapped object (could be a food item or another decorator)
        super.eat();
        
        // Behavior added after the core eating action
        System.out.println("You feel nauseous after eating this food.");
    }
}
