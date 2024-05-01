public class Main3 {
    public static void main(String[] args) {
        Product.changePackagingPrice(10);

        Product product = new Product();
        product.changeCostPrice(100);

        System.out.printf("Total cost: R$ %6.2f%n", Product.calculateTotalCosts(product));
    }
}
