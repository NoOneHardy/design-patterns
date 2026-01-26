package ch.no1hardy.factory;

import ch.no1hardy.item.Door;
import ch.no1hardy.item.Log;
import ch.no1hardy.item.Planks;
import ch.no1hardy.item.oak.OakDoor;
import ch.no1hardy.item.oak.OakLog;
import ch.no1hardy.item.oak.OakPlanks;

/**
 * Concrete factory implementation for creating oak wood products.
 * 
 * <p>This factory creates a complete family of oak-based products, ensuring
 * consistency across all wood items. All products created by this factory
 * (doors, logs, planks) will be of oak variant, demonstrating how the
 * Abstract Factory pattern maintains product family coherence.
 * 
 * <p>Oak products typically have characteristics like being sturdy and creaky.
 */
public class OakFactory implements WoodFactory {

    /**
     * Creates an oak door.
     * 
     * @return a new OakDoor instance
     */
    @Override
    public Door createDoor() {
        return new OakDoor();
    }

    /**
     * Creates an oak log.
     * 
     * @return a new OakLog instance
     */
    @Override
    public Log createLog() {
        return new OakLog();
    }

    /**
     * Creates oak planks.
     * 
     * @return a new OakPlanks instance
     */
    @Override
    public Planks createPlanks() {
        return new OakPlanks();
    }
}
