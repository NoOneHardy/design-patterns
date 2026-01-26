package ch.no1hardy.entity;

/**
 * The Entity class represents the ADAPTEE base class in the Adapter Pattern.
 * <p>
 * In the Adapter Pattern, the ADAPTEE is the existing class that has useful functionality,
 * but its interface is incompatible with what the client expects.
 * </p>
 * <p>
 * Entities have a spawn() method instead of a place() method. This incompatibility means
 * that Entity objects cannot be directly used where Block objects are expected (e.g., in the World.place() method).
 * </p>
 * <p>
 * The Adapter Pattern allows us to make Entity objects work with code that expects Block objects,
 * without modifying the Entity class itself.
 * </p>
 */
public abstract class Entity {
    /**
     * Spawns this entity in the world.
     * <p>
     * This is the ADAPTEE method - it has different behavior and a different name
     * than the place() method that the client expects. The adapter will need to
     * translate between these two different interfaces.
     * </p>
     */
    public void spawn() {
        System.out.println("You have spawned an entity!");
    }
}
