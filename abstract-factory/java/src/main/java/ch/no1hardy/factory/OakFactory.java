package ch.no1hardy.factory;

import ch.no1hardy.item.Door;
import ch.no1hardy.item.Log;
import ch.no1hardy.item.Planks;
import ch.no1hardy.item.oak.OakDoor;
import ch.no1hardy.item.oak.OakLog;
import ch.no1hardy.item.oak.OakPlanks;

public class OakFactory implements WoodFactory {

    @Override
    public Door createDoor() {
        return new OakDoor();
    }

    @Override
    public Log createLog() {
        return new OakLog();
    }

    @Override
    public Planks createPlanks() {
        return new OakPlanks();
    }
}
