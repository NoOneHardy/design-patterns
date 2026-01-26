package ch.no1hardy.adapter;

import ch.no1hardy.block.Block;
import ch.no1hardy.entity.ArmorStand;

public class ArmorStandBlockAdapter extends Block {
    private final ArmorStand armorStand;

    public ArmorStandBlockAdapter(ArmorStand armorStand) {
        this.armorStand = armorStand;
    }

    @Override
    public void place() {
        armorStand.spawn();
    }
}
