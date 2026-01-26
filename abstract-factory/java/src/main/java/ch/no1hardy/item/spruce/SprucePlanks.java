package ch.no1hardy.item.spruce;

import ch.no1hardy.item.Planks;

public class SprucePlanks implements Planks {
    @Override
    public void place() {
        System.out.println("You place the spruce planks on the ground. They look sturdy.");
    }
}
