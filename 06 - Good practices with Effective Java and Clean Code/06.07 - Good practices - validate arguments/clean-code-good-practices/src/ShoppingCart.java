import java.util.Objects;

public class ShoppingCart {
    void addItem(Product product, int amount) {
        Objects.requireNonNull(product, "The product must be informed");

        if (amount <= 0) {
            throw new IllegalArgumentException("The amount must be greater than zero!");
        }

        System.out.printf("Product: %s%n", product.name);
    }

    void generateOrder(Address deliveryAddress) {
        Objects.requireNonNull(deliveryAddress, "The delivery address must be informed");

        createNewOrder(deliveryAddress);
    }

    void generateOrder() {
        createNewOrder(null);
    }

    // Internal method (we will study private soon)
    private void createNewOrder(Address deliveryAddress) {
        // TODO: Implement the order creation
    }
}
