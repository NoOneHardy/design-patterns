package ch.no1hardy.factory;

import ch.no1hardy.item.Door;
import ch.no1hardy.item.Log;
import ch.no1hardy.item.Planks;
import ch.no1hardy.item.spruce.SpruceDoor;
import ch.no1hardy.item.spruce.SpruceLog;
import ch.no1hardy.item.spruce.SprucePlanks;

public class SpruceFactory implements WoodFactory {

    @Override
    public Door createDoor() {
        return new SpruceDoor();
    }

    @Override
    public Log createLog() {
        return new SpruceLog();
    }

    @Override
    public Planks createPlanks() {
        return new SprucePlanks();
    }
}
