package ch.no1hardy.item.spruce;

import ch.no1hardy.item.Log;

public class SpruceLog implements Log {
    @Override
    public void strip() {
        System.out.println("You strip the spruce log. The bark comes off easily.");
    }

    @Override
    public void chop() {
        System.out.println("You chop the spruce log. It splits into light pieces.");
    }
}
