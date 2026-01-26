package ch.no1hardy.decorator;

import ch.no1hardy.food.Eatable;

/**
 * The Base Decorator class in the Decorator pattern.
 * Provides a foundation for all concrete decorators by implementing the Eatable interface
 * and maintaining a reference to a wrapped Eatable object.
 * 
 * <p>This abstract class serves several key purposes in the Decorator pattern:</p>
 * <ul>
 *   <li>Implements the same interface (Eatable) as the components it wraps</li>
 *   <li>Maintains a reference to an Eatable object (the wrapped component)</li>
 *   <li>Delegates the basic eat() behavior to the wrapped object</li>
 *   <li>Allows concrete decorators to extend and add behavior before/after delegation</li>
 * </ul>
 * 
 * <p>Concrete decorators extend this class and override the eat() method to add
 * additional behavior while still calling super.eat() to maintain the chain of delegation.</p>
 */
public abstract class BaseEatableDecorator implements Eatable {
    /**
     * The wrapped Eatable object that this decorator enhances.
     * This could be a concrete component (like Carrot) or another decorator,
     * allowing decorators to be stacked.
     */
    private final Eatable eatable;

    /**
     * Constructs a new BaseEatableDecorator that wraps the given Eatable object.
     * 
     * @param eatable the Eatable object to be decorated/wrapped; must not be null
     */
    public BaseEatableDecorator(Eatable eatable) {
        this.eatable = eatable;
    }

    /**
     * Delegates the eat behavior to the wrapped Eatable object.
     * Concrete decorators override this method to add behavior before or after
     * calling super.eat().
     */
    @Override
    public void eat() {
        eatable.eat();
    }
}
