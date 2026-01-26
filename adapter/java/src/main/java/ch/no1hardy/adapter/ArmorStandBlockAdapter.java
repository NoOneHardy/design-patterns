package ch.no1hardy.adapter;

import ch.no1hardy.block.Block;
import ch.no1hardy.entity.ArmorStand;

/**
 * The ArmorStandBlockAdapter class is the ADAPTER in the Adapter Pattern.
 * <p>
 * This is the core of the Adapter Pattern. The adapter class:
 * <ul>
 *   <li>Extends or implements the TARGET interface (Block) that the client expects</li>
 *   <li>Contains a reference to the ADAPTEE (ArmorStand) that needs to be adapted</li>
 *   <li>Translates calls from the target interface to the adaptee's interface</li>
 * </ul>
 * </p>
 * <p>
 * This adapter makes an ArmorStand object usable in contexts where a Block is expected.
 * When the client calls place() on this adapter, the adapter internally calls spawn()
 * on the wrapped ArmorStand object.
 * </p>
 * <p>
 * <strong>Key Pattern Elements:</strong>
 * <ul>
 *   <li>TARGET: Block class (what the client expects)</li>
 *   <li>ADAPTEE: ArmorStand class (what we need to adapt)</li>
 *   <li>ADAPTER: This class (ArmorStandBlockAdapter - bridges the gap)</li>
 * </ul>
 * </p>
 */
public class ArmorStandBlockAdapter extends Block {
    /**
     * The ArmorStand being adapted.
     * <p>
     * This is the ADAPTEE instance that this adapter wraps.
     * The adapter delegates the actual work to this object,
     * but translates the interface so it appears to be a Block.
     * </p>
     */
    private final ArmorStand armorStand;

    /**
     * Constructs an adapter that makes an ArmorStand appear as a Block.
     * <p>
     * The adapter takes the incompatible object (ArmorStand) as a constructor parameter
     * and stores it for later use. This is known as object composition.
     * </p>
     *
     * @param armorStand the ArmorStand entity to be adapted to the Block interface
     */
    public ArmorStandBlockAdapter(ArmorStand armorStand) {
        this.armorStand = armorStand;
    }

    /**
     * Adapts the Block's place() method to call ArmorStand's spawn() method.
     * <p>
     * This is where the actual adaptation happens. When the client (World) calls
     * place() expecting Block behavior, the adapter translates this call into
     * a spawn() call on the wrapped ArmorStand.
     * </p>
     * <p>
     * This method override demonstrates the core purpose of the Adapter Pattern:
     * converting one interface (ArmorStand.spawn()) into another interface (Block.place())
     * that the client expects.
     * </p>
     */
    @Override
    public void place() {
        // Delegate to the adaptee's spawn() method when place() is called
        // This is the key translation: place() -> spawn()
        armorStand.spawn();
    }
}
