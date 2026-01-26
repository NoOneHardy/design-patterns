package ch.no1hardy.item.oak;

import ch.no1hardy.item.Log;

/**
 * Concrete product implementation representing an oak log.
 * 
 * <p>This class is part of the oak product family in the Abstract Factory pattern.
 * Oak logs are characterized by their sturdiness and density, requiring more effort
 * to process but yielding strong, durable pieces.
 */
public class OakLog implements Log {
    /**
     * Strips the bark from the oak log, which requires some effort due to oak's density.
     */
    @Override
    public void strip() {
        System.out.println("You strip the oak log. The bark comes off with some effort.");
    }

    /**
     * Chops the oak log into sturdy pieces, reflecting oak's strong and durable nature.
     */
    @Override
    public void chop() {
        System.out.println("You chop the oak log. It splits into sturdy pieces.");
    }
}
