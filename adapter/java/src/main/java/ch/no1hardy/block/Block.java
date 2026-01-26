package ch.no1hardy.block;

/**
 * The Block class represents the TARGET interface in the Adapter Pattern.
 * <p>
 * In the Adapter Pattern, the TARGET is the interface that the client expects to work with.
 * The World class expects to work with Block objects and calls their place() method.
 * </p>
 * <p>
 * This class defines the standard interface for objects that can be placed in the world.
 * Any object that needs to be placed must either be a Block or be adapted to look like a Block.
 * </p>
 */
public class Block {
    /**
     * Places this block in the world.
     * <p>
     * This is the TARGET method that the client (World) expects to call.
     * When an object is placed in the world, this method will be invoked.
     * </p>
     */
    public void place() {
        System.out.println("You have placed a block!");
    }
}
