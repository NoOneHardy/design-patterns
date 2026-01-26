package ch.no1hardy.interior;

import ch.no1hardy.item.Item;

/**
 * The abstract class Store declares the factory method 'createItem',
 * which is responsible for creating Item objects.
 * Subclasses of Store will provide specific implementations of this method
 * to create different types of items.
 */
public abstract class Store {
    abstract public Item createItem();
}
