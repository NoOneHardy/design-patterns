package ch.no1hardy.item.spruce;

import ch.no1hardy.item.Log;

/**
 * Concrete product implementation representing a spruce log.
 * 
 * <p>This class is part of the spruce product family in the Abstract Factory pattern.
 * Spruce logs are characterized by their light weight and ease of processing,
 * making them easy to work with compared to denser wood types.
 */
public class SpruceLog implements Log {
    /**
     * Strips the bark from the spruce log easily due to spruce's lighter, softer nature.
     */
    @Override
    public void strip() {
        System.out.println("You strip the spruce log. The bark comes off easily.");
    }

    /**
     * Chops the spruce log into light pieces, reflecting spruce's characteristic lightweight.
     */
    @Override
    public void chop() {
        System.out.println("You chop the spruce log. It splits into light pieces.");
    }
}
