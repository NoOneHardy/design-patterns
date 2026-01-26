package ch.no1hardy.item.oak;

import ch.no1hardy.item.Log;

public class OakLog implements Log {
    @Override
    public void strip() {
        System.out.println("You strip the oak log. The bark comes off with some effort.");
    }

    @Override
    public void chop() {
        System.out.println("You chop the oak log. It splits into sturdy pieces.");
    }
}
