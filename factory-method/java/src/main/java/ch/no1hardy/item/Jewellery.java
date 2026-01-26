package ch.no1hardy.item;

/**
 * A concrete product implementing the Item interface.
 * Represents a piece of jewellery with concrete implementation of individual and common behaviors.
 * Common behaviors are defined in the Item interface.
 * Individual behaviors are defined in this class.
 * The individual behaviors can be accessed by the factory method.
 */
public class Jewellery implements Item {
    /**
     * The price of the jewellery.
     */
    private int price;

    /**
     * Constructor to initialize the jewellery with a specific price.
     *
     * @param price The price of the jewellery.
     */
    public Jewellery(int price) {
        setPrice(price);
    }

    /**
     * Gets the price of the jewellery.
     * This is common behavior defined in the Item interface.
     *
     * @return The price of the jewellery.
     */
    @Override
    public int getPrice() {
        return price;
    }

    /**
     * Sets the price of the jewellery.
     * This is common behavior defined in the Item interface.
     *
     * @param price The new price of the jewellery.
     */
    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * Defines the behavior when the jewellery is used.
     * This is common behavior defined in the Item interface.
     * It is implemented specifically for the Jewellery class.
     */
    @Override
    public void use() {
        System.out.println("You just put on a piece of jewellery.");
        System.out.println("Wait, you are not allowed to try the jewellery before buying it!");
        System.out.println("The jewellery has been confiscated.");
    }

    /**
     * Individual behavior specific to the Jewellery class.
     * This method can be accessed by the factory method.
     * It is not part of the Item interface.
     * Thus, it is not known by the client code calling the factory method.
     */
    public void specificJewelleryMethod() {
        System.out.println("This is a method specifically for jewellery.");
        System.out.println("I am so shiny!");
    }
}
