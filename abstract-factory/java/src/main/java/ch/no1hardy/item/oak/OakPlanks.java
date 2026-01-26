package ch.no1hardy.item.oak;

import ch.no1hardy.item.Planks;

/**
 * Concrete product implementation representing oak planks.
 * 
 * <p>This class is part of the oak product family in the Abstract Factory pattern.
 * Oak planks are known for their magnificent appearance and quality, reflecting
 * the premium characteristics of oak wood.
 */
public class OakPlanks implements Planks {
    /**
     * Places the oak planks on the ground, showcasing their magnificent appearance.
     */
    @Override
    public void place() {
        System.out.println("You place the oak planks on the ground. They look magnificent.");
    }
}
