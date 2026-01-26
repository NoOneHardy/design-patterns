import {Block} from './block/block'

/**
 * The World class represents the CLIENT in the Adapter Pattern.
 * <p>
 * In the Adapter Pattern, the CLIENT is the class that uses the TARGET interface.
 * The World class expects to work with Block objects - it doesn't know or care about
 * Entity objects or the Adapter Pattern being used.
 * </p>
 * <p>
 * This demonstrates an important principle: the client code remains unchanged and
 * unaware of the adapter. The adapter allows incompatible classes to work with the
 * client without modifying either the client or the incompatible class.
 * </p>
 */
export class World {
  /**
   * Places a block in the world.
   * <p>
   * This method expects a Block object (the TARGET interface).
   * Thanks to the Adapter Pattern, we can pass in:
   * <ul>
   *   <li>Regular Block objects directly</li>
   *   <li>Adapted objects (like ArmorStandBlockAdapter) that extend Block</li>
   * </ul>
   * </p>
   * <p>
   * The client doesn't need to know whether it's working with a real Block
   * or an adapter - it just calls place() and the right behavior occurs.
   * </p>
   *
   * @param block the block to place in the world (can be a real Block or an adapter)
   */
  public place(block: Block): void {
    // Call the place() method on the block
    // If it's an adapter, this will be translated to the adaptee's method
    block.place()
  }
}
