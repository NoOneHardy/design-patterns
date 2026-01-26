package ch.no1hardy.item.oak;

import ch.no1hardy.item.Door;

public class OakDoor implements Door {
    @Override
    public void open() {
        System.out.println("You open the oak door. It creaks loudly.");
    }
}
