package ch.no1hardy.item;

/**
 * The Item interface defines a contract for items that can be used.
 * It is known by the client code and implemented by concrete product classes.
 */
public interface Item {
    int getPrice();
    void setPrice(int price);

    /**
     * Defines the behavior when the item is used.
     */
    void use();
}
