package ch.no1hardy.item;

/**
 * Abstract product interface representing a door.
 * 
 * <p>This interface is part of the Abstract Factory pattern's product hierarchy.
 * Different concrete implementations will provide variant-specific behavior
 * while maintaining a consistent interface for client code.
 * 
 * <p>Doors created by different factories will have different characteristics
 * (e.g., oak doors creak, spruce doors swing smoothly).
 */
public interface Door {
    /**
     * Opens the door, displaying variant-specific behavior.
     */
    void open();
}
