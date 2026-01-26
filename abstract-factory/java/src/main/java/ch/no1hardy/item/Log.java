package ch.no1hardy.item;

/**
 * Abstract product interface representing a log.
 * 
 * <p>This interface is part of the Abstract Factory pattern's product hierarchy.
 * Different concrete implementations will provide variant-specific behavior
 * while maintaining a consistent interface for client code.
 * 
 * <p>Logs from different wood types will have different processing characteristics
 * (e.g., oak logs are sturdy and harder to strip, spruce logs are light and easy to work with).
 */
public interface Log {
    /**
     * Strips the bark from the log, displaying variant-specific behavior.
     */
    void strip();
    
    /**
     * Chops the log into pieces, displaying variant-specific behavior.
     */
    void chop();
}
