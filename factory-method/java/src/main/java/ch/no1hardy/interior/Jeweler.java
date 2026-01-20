package ch.no1hardy.interior;

import ch.no1hardy.item.Item;
import ch.no1hardy.item.Jewellery;

/**
 * Concrete implementation of the Store class defining the factory method to create Jewellery items.
 * This class implements the factory method to produce Jewellery objects.
 */
public class Jeweler extends Store {
    /**
     * Factory method to create and return a Jewellery item.
     * @return A new Jewellery item as an Item for uniform handling.
     */
    public Item createItem() {
        Jewellery jewellery = new Jewellery(100);
        // Additional initialization or configuration can be done here if needed
        jewellery.specificJewelleryMethod();
        return jewellery;
    }
}
