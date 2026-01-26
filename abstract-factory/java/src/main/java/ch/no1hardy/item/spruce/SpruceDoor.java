package ch.no1hardy.item.spruce;

import ch.no1hardy.item.Door;

public class SpruceDoor implements Door {
    @Override
    public void open() {
        System.out.println("You open the spruce door. It swings smoothly.");
    }
}
