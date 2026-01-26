package ch.no1hardy.factory;

import ch.no1hardy.item.Door;
import ch.no1hardy.item.Log;
import ch.no1hardy.item.Planks;

public interface WoodFactory {
    Door createDoor();
    Log createLog();
    Planks createPlanks();
}
