package ch.no1hardy.item.oak;

import ch.no1hardy.item.Door;

/**
 * Concrete product implementation representing an oak door.
 * 
 * <p>This class is part of the oak product family in the Abstract Factory pattern.
 * Oak doors are characterized by their creaky nature when opened, reflecting the
 * sturdy and aged characteristics of oak wood.
 */
public class OakDoor implements Door {
    /**
     * Opens the oak door with its characteristic loud creak.
     */
    @Override
    public void open() {
        System.out.println("You open the oak door. It creaks loudly.");
    }
}
