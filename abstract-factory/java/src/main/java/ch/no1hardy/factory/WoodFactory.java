package ch.no1hardy.factory;

import ch.no1hardy.item.Door;
import ch.no1hardy.item.Log;
import ch.no1hardy.item.Planks;

/**
 * Abstract Factory interface for creating families of related wood products.
 * 
 * <p>This interface defines the contract for creating a complete family of wood-based
 * items (doors, logs, and planks). Concrete implementations of this interface will
 * ensure that all created products are of the same wood type variant (e.g., all oak
 * or all spruce), maintaining consistency across the product family.
 * 
 * <p>This is the core abstraction in the Abstract Factory pattern, allowing client
 * code to work with different product families without depending on concrete classes.
 */
public interface WoodFactory {
    /**
     * Creates a door of the specific wood type.
     * 
     * @return a new Door instance of the appropriate wood variant
     */
    Door createDoor();
    
    /**
     * Creates a log of the specific wood type.
     * 
     * @return a new Log instance of the appropriate wood variant
     */
    Log createLog();
    
    /**
     * Creates planks of the specific wood type.
     * 
     * @return a new Planks instance of the appropriate wood variant
     */
    Planks createPlanks();
}
