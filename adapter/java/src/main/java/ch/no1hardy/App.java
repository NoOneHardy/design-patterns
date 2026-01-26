package ch.no1hardy;

import ch.no1hardy.adapter.ArmorStandBlockAdapter;
import ch.no1hardy.block.Block;
import ch.no1hardy.entity.ArmorStand;

/**
 * Main application class demonstrating the Adapter Pattern.
 * <p>
 * <strong>ADAPTER PATTERN OVERVIEW:</strong><br>
 * The Adapter Pattern allows objects with incompatible interfaces to work together.
 * It acts as a bridge between two incompatible interfaces by wrapping one object
 * and providing an interface that the client expects.
 * </p>
 * <p>
 * <strong>PROBLEM SOLVED:</strong><br>
 * In this example, we have a World that can place Blocks, but we want to also
 * place Entities (like ArmorStand). However:
 * <ul>
 *   <li>World.place() expects a Block object</li>
 *   <li>ArmorStand is an Entity, not a Block</li>
 *   <li>Block has a place() method, but Entity has a spawn() method</li>
 * </ul>
 * We can't directly pass an ArmorStand to World.place() - it won't compile!
 * </p>
 * <p>
 * <strong>SOLUTION:</strong><br>
 * The ArmorStandBlockAdapter wraps an ArmorStand and makes it look like a Block.
 * When World calls place() on the adapter, the adapter translates this to a spawn()
 * call on the wrapped ArmorStand.
 * </p>
 * <p>
 * <strong>PATTERN PARTICIPANTS:</strong>
 * <ul>
 *   <li><strong>TARGET:</strong> Block - the interface the client expects</li>
 *   <li><strong>CLIENT:</strong> World - the class that uses the target interface</li>
 *   <li><strong>ADAPTEE:</strong> ArmorStand - the existing class with incompatible interface</li>
 *   <li><strong>ADAPTER:</strong> ArmorStandBlockAdapter - converts adaptee's interface to target interface</li>
 * </ul>
 * </p>
 * <p>
 * <strong>BENEFITS:</strong>
 * <ul>
 *   <li>Allows reuse of existing classes even when their interfaces don't match</li>
 *   <li>No need to modify existing code (World, Block, or ArmorStand)</li>
 *   <li>Follows the Open/Closed Principle - open for extension, closed for modification</li>
 *   <li>Single Responsibility Principle - the adapter's only job is interface conversion</li>
 * </ul>
 * </p>
 */
public class App {
    /**
     * Demonstrates the Adapter Pattern in action.
     * <p>
     * This method shows three scenarios:
     * <ol>
     *   <li>Placing a regular Block directly (no adapter needed)</li>
     *   <li>Why we can't place an ArmorStand directly (incompatible interface)</li>
     *   <li>Using an adapter to place an ArmorStand as if it were a Block</li>
     * </ol>
     * </p>
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        // Create the world (CLIENT) that will use Block objects
        World world = new World();

        // SCENARIO 1: Normal usage - Block is already compatible with World
        System.out.println("=== Scenario 1: Placing a regular Block ===");
        Block block = new Block(); // Create a new block (TARGET)
        world.place(block);        // Place the block - this works directly
        System.out.println();

        // SCENARIO 2: The problem - ArmorStand is incompatible
        System.out.println("=== Scenario 2: Why we need an adapter ===");
        ArmorStand armorStand = new ArmorStand(); // Create an ArmorStand (ADAPTEE)
        // world.place(armorStand);               // ❌ COMPILE ERROR! ArmorStand is not a Block
        System.out.println("Cannot call world.place(armorStand) - ArmorStand is not a Block!");
        System.out.println("ArmorStand has spawn() but World expects place()");
        System.out.println();

        // SCENARIO 3: The solution - Use an adapter
        System.out.println("=== Scenario 3: Using the Adapter Pattern ===");
        // Create an ADAPTER that wraps the ArmorStand and makes it look like a Block
        ArmorStandBlockAdapter adapter = new ArmorStandBlockAdapter(armorStand);
        
        // Now we can place the ArmorStand through the adapter!
        // The adapter translates place() calls into spawn() calls
        world.place(adapter); // ✓ This works! The adapter makes ArmorStand compatible
        System.out.println();
        
        System.out.println("Success! The adapter allowed us to place an ArmorStand");
        System.out.println("in the World without modifying World, Block, or ArmorStand classes.");
    }
}
