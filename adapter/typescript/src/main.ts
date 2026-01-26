import {World} from './world'
import {Block} from './block/block'
import {ArmorStand} from './entity/armor-stand'
import {ArmorStandBlockAdapter} from './adapter/armor-stand-block.adapter'

// Create the world (CLIENT) that will use Block objects
const world: World = new World()

// SCENARIO 1: Normal usage - Block is already compatible with World
console.log('=== Scenario 1: Placing a regular Block ===')
const block: Block = new Block() // Create a new block (TARGET)
world.place(block)               // Place the block - this works directly
console.log()

// SCENARIO 2: The problem - ArmorStand is incompatible
console.log('=== Scenario 2: Why we need an adapter ===')
const armorStand: ArmorStand = new ArmorStand() // Create an ArmorStand (ADAPTEE)
// world.place(armorStand)                      // ❌ COMPILE ERROR! ArmorStand is not a Block
console.log('Cannot call world.place(armorStand) - ArmorStand is not a Block!')
console.log('ArmorStand has spawn() but World expects place()')
console.log()

// SCENARIO 3: The solution - Use an adapter
console.log('=== Scenario 3: Using the Adapter Pattern ===')
// Create an ADAPTER that wraps the ArmorStand and makes it look like a Block
const adapter: ArmorStandBlockAdapter = new ArmorStandBlockAdapter(armorStand)

// Now we can place the ArmorStand through the adapter!
// The adapter translates place() calls into spawn() calls
world.place(adapter) // ✓ This works! The adapter makes ArmorStand compatible
console.log()

console.log('Success! The adapter allowed us to place an ArmorStand')
console.log('in the World without modifying World, Block, or ArmorStand classes.')