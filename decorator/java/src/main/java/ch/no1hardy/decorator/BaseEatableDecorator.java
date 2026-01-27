package ch.no1hardy.decorator;

import ch.no1hardy.food.Eatable;

/**
 * Base decorator for eatable items.
 * Implements the Eatable interface. This is necessary because if a decorator is wrapping an eatable the concrete type of the eatable becomes the type of the decorator
 * <pre>
 * Eatable carrot = new PoisonEatableDecorator(new Carrot()); // the concrete type is PoisonEatableDecorator
 * carrot.eat(); // works because PoisonEatableDecorator implements Eatable and calls the eat method of Carrot
 * </pre>
 *
 * <p>
 * By implementing Eatable, all decorators extending this class can be interpreted as Eatable items themselves, allowing nesting of decorators.
 * When a decorator wraps another decorator, the outer decorator calls the eat method of the inner decorator, which in turn calls the eat method of the actual eatable item.
 *
 * <p>
 * All eatable decorators should extend this class.
 */
public abstract class BaseEatableDecorator implements Eatable {
    /**
     * The reference to the actual eatable item or another eatable decorator.
     */
    private final Eatable eatable;

    /**
     * Constructor to initialize the decorator with the eatable item it wraps.
     * @param eatable an actual Eatable or another decorator compatible with Eatables
     */
    public BaseEatableDecorator(Eatable eatable) {
        this.eatable = eatable;
    }

    @Override
    public void eat() {
        eatable.eat();
    }
}
