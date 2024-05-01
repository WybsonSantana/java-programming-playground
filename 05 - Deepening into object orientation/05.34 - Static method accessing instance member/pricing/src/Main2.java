public class Main2 {
    public static void main(String[] args) {
        Product product1 = new Product();
        Product product2 = new Product();

        Product.changePackagingPrice(30);

        Product.printPackageCost();
    }
}