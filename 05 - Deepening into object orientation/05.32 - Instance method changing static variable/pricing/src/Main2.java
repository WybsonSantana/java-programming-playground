public class Main2 {
    public static void main(String[] args) {
        Product product1 = new Product();
        Product product2 = new Product();

        product1.changePackagingPrice(10);
        product2.changePackagingPrice(30);

        product1.printPackageCost();
        product2.printPackageCost();
    }
}