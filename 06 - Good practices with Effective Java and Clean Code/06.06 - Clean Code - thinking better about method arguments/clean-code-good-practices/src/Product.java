public class Product {
    String name;
    double unitPrice;
    boolean active;

    void changeStatus(boolean active) {
        if (active) {
            System.out.println("Activating...");
        } else {
            System.out.println("Deactivating...");
        }

        this.active = active;
    }

    void activate() {
        System.out.println("Activating...");
        this.active = true;
    }

    void deactivate() {
        System.out.println("Deactivating...");
        this.active = false;
    }
}
