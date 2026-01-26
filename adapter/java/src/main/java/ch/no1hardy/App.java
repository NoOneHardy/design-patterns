package ch.no1hardy;

import ch.no1hardy.adapter.ArmorStandBlockAdapter;
import ch.no1hardy.block.Block;
import ch.no1hardy.entity.ArmorStand;

public class App {
    public static void main(String[] args) {
        World world = new World(); // Create a new world

        Block block = new Block(); // Create a new block
        world.place(block);        // Place the block in the world

        ArmorStand armorStand = new ArmorStand(); // Create a new armor stand
        // world.place(armorStand);               // This line would cause a compile-time error because ArmorStand is not a Block


        ArmorStandBlockAdapter adapter = new ArmorStandBlockAdapter(armorStand); // Create an adapter for the armor stand
        world.place(adapter);                                                    // Place the armor stand in the world using the adapter
    }
}
