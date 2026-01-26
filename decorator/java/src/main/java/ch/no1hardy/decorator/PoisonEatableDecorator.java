package ch.no1hardy.decorator;

import ch.no1hardy.food.Eatable;

/**
 * A Concrete Decorator that adds poison side effects to eating.
 * 
 * <p>This decorator demonstrates the Decorator pattern by wrapping an Eatable object
 * and adding additional behavior (poison effects) before and after the core eating action.
 * The poison effects are added without modifying the original food classes.</p>
 * 
 * <p>Key aspects of this decorator:</p>
 * <ul>
 *   <li>Adds behavior before eating (warning message)</li>
 *   <li>Delegates to the wrapped object via super.eat()</li>
 *   <li>Adds behavior after eating (poison effects)</li>
 * </ul>
 */
public class PoisonEatableDecorator extends BaseEatableDecorator {
    /**
     * Constructs a new PoisonEatableDecorator that wraps the given Eatable.
     * 
     * @param eatable the Eatable object to be decorated with poison effects
     */
    public PoisonEatableDecorator(Eatable eatable) {
        super(eatable);
    }

    /**
     * Adds poison effects before and after eating the wrapped food.
     * 
     * <p>This method demonstrates the decorator pattern's ability to add behavior:</p>
     * <ol>
     *   <li>Before: Displays a warning that you don't feel pain yet</li>
     *   <li>During: Calls super.eat() to execute the wrapped object's behavior</li>
     *   <li>After: Displays messages about feeling pain and being poisoned</li>
     * </ol>
     */
    @Override
    public void eat() {
        // Behavior added before the core eating action
        System.out.println("You don't feel any pain yet...");
        
        // Delegate to the wrapped object (could be a food item or another decorator)
        super.eat();
        
        // Behavior added after the core eating action
        System.out.println("You feel a sharp pain after eating this food.");
        System.out.println("You have been poisoned!!!!!");
    }
}
