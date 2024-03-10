public class BooleanExample {
    public static void main(String[] args) {
        boolean purchaseApproved = true;
        boolean blockedCustomer = false;

        System.out.println("Purchase approved: " + purchaseApproved);
        System.out.println("Blocked customer: " + blockedCustomer);

        int stockQuantity = 10;
        int orderQuantity = 15;

        boolean sufficientStock = stockQuantity >= orderQuantity;

        System.out.println("Sufficient stock: " + sufficientStock);
    }
}