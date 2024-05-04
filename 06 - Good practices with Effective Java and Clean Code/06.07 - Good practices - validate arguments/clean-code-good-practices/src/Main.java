public class Main {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product();
        product.name = "Water";
        product.unitPrice = 5;

        shoppingCart.addItem(product, 4);

        Address address = new Address();
        address.street = "JVM Avenue";
        address.number = "17";
        address.neighborhood = "Spring Park";

        shoppingCart.generateOrder(address);

        System.out.println("Order generated!");
    }
}