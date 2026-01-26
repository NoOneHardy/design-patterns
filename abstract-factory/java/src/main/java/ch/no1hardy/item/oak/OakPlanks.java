package ch.no1hardy.item.oak;

import ch.no1hardy.item.Planks;

public class OakPlanks implements Planks {
    @Override
    public void place() {
        System.out.println("You place the oak planks on the ground. They look magnificent.");
    }
}
