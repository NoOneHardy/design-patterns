package ch.no1hardy.item.spruce;

import ch.no1hardy.item.Door;

/**
 * Concrete product implementation representing a spruce door.
 * 
 * <p>This class is part of the spruce product family in the Abstract Factory pattern.
 * Spruce doors are characterized by their smooth operation when opened, reflecting
 * the light and smooth nature of spruce wood.
 */
public class SpruceDoor implements Door {
    /**
     * Opens the spruce door smoothly, without resistance.
     */
    @Override
    public void open() {
        System.out.println("You open the spruce door. It swings smoothly.");
    }
}
