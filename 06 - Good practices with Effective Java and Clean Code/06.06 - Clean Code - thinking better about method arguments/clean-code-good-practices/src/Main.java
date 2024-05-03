public class Main {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        //shoppingCart.addItem("Water", 5, 4);

        Product product = new Product();
        product.name = "Water";
        product.unitPrice = 5;

        //product.changeStatus(true);
        product.activate();
        product.deactivate();
        shoppingCart.addItem(product, 4);

    }
}