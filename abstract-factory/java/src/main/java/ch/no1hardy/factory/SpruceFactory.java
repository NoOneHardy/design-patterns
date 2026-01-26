package ch.no1hardy.factory;

import ch.no1hardy.item.Door;
import ch.no1hardy.item.Log;
import ch.no1hardy.item.Planks;
import ch.no1hardy.item.spruce.SpruceDoor;
import ch.no1hardy.item.spruce.SpruceLog;
import ch.no1hardy.item.spruce.SprucePlanks;

/**
 * Concrete factory implementation for creating spruce wood products.
 * 
 * <p>This factory creates a complete family of spruce-based products, ensuring
 * consistency across all wood items. All products created by this factory
 * (doors, logs, planks) will be of spruce variant, demonstrating how the
 * Abstract Factory pattern maintains product family coherence.
 * 
 * <p>Spruce products typically have characteristics like being light and smooth.
 */
public class SpruceFactory implements WoodFactory {

    /**
     * Creates a spruce door.
     * 
     * @return a new SpruceDoor instance
     */
    @Override
    public Door createDoor() {
        return new SpruceDoor();
    }

    /**
     * Creates a spruce log.
     * 
     * @return a new SpruceLog instance
     */
    @Override
    public Log createLog() {
        return new SpruceLog();
    }

    /**
     * Creates spruce planks.
     * 
     * @return a new SprucePlanks instance
     */
    @Override
    public Planks createPlanks() {
        return new SprucePlanks();
    }
}
