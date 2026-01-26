package ch.no1hardy.entity;

/**
 * The ArmorStand class represents a specific ADAPTEE in the Adapter Pattern.
 * <p>
 * ArmorStand is a concrete entity that extends the Entity base class.
 * Like all entities, it has a spawn() method instead of a place() method.
 * </p>
 * <p>
 * This class demonstrates a common scenario in the Adapter Pattern:
 * We want to use an ArmorStand in a context that expects a Block,
 * but we cannot or do not want to modify the ArmorStand class itself
 * (perhaps because it's part of a library or has many other uses).
 * </p>
 */
public class ArmorStand extends Entity {
    /**
     * Spawns an armor stand entity in the world.
     * <p>
     * This override provides ArmorStand-specific behavior for the spawn() method.
     * The adapter will call this method when the client calls place() on the adapter.
     * </p>
     */
    @Override
    public void spawn() {
        System.out.println("You have spawned an armor stand!");
    }
}
