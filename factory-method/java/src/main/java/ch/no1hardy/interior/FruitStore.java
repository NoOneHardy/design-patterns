package ch.no1hardy.interior;

import ch.no1hardy.item.Apple;
import ch.no1hardy.item.Item;

/**
 * Concrete implementation of the Store class defining the factory method to create Apple items.
 * This class implements the factory method to produce Apple objects.
 */
public class FruitStore extends Store {
    /**
     * Factory method to create and return an Apple item.
     *
     * @return A new Apple item as an Item for uniform handling.
     */
    @Override
    public Item createItem() {
        Apple apple = new Apple(2);
        // Additional initialization or configuration can be done here if needed
        apple.specificAppleMethod();
        return apple;
    }
}
