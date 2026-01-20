package ch.no1hardy.item;

/**
 * A concrete product implementing the Item interface.
 * Represents an apple with concrete implementation of individual and common behaviors.
 * Common behaviors are defined in the Item interface.
 * Individual behaviors are defined in this class.
 * The individual behaviors can be accessed by the factory method.
 */
public class Apple implements Item {
    /**
     * The price of the apple.
     */
    private int price;

    /**
     * Constructor to initialize the apple with a specific price.
     * @param price The price of the apple.
     */
    public Apple(int price) {
        setPrice(price);
    }

    /**
     * Defines the behavior when the apple is used.
     * This is common behavior defined in the Item interface.
     * It is implemented specifically for the Apple class.
     */
    public void use() {
        System.out.println("You just ate an apple.");
    }

    /**
     * Gets the price of the apple.
     * This is common behavior defined in the Item interface.
     * @return The price of the apple.
     */
    public int getPrice() {
        return price;
    }

    /**
     * Sets the price of the apple.
     * This is common behavior defined in the Item interface.
     * @param price The new price of the apple.
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * Individual behavior specific to the Apple class.
     * This method can be accessed by the factory method.
     * It is not part of the Item interface.
     * Thus, it is not known by the client code calling the factory method.
     */
    public void specificAppleMethod() {
        System.out.println("This is a method specifically for apples.");
    }
}
