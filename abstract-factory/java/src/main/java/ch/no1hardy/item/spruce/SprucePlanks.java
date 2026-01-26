package ch.no1hardy.item.spruce;

import ch.no1hardy.item.Planks;

/**
 * Concrete product implementation representing spruce planks.
 * 
 * <p>This class is part of the spruce product family in the Abstract Factory pattern.
 * Spruce planks are known for their sturdy appearance and reliability, making them
 * a practical choice for construction.
 */
public class SprucePlanks implements Planks {
    /**
     * Places the spruce planks on the ground, showcasing their sturdy appearance.
     */
    @Override
    public void place() {
        System.out.println("You place the spruce planks on the ground. They look sturdy.");
    }
}
