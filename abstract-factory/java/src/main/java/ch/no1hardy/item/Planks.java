package ch.no1hardy.item;

/**
 * Abstract product interface representing planks.
 * 
 * <p>This interface is part of the Abstract Factory pattern's product hierarchy.
 * Different concrete implementations will provide variant-specific behavior
 * while maintaining a consistent interface for client code.
 * 
 * <p>Planks from different wood types will have different visual and structural
 * characteristics (e.g., oak planks look magnificent, spruce planks look sturdy).
 */
public interface Planks {
    /**
     * Places the planks on the ground, displaying variant-specific behavior.
     */
    void place();
}
