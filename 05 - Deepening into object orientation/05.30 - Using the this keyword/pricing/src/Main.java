public class Main {
    public static void main(String[] args) {
        Product newProduct = new Product();
        newProduct.costPrice = 100;
        newProduct.changeCostPrice(80);

        PricingService pricingService = new PricingService();
        pricingService.setSalesPrice(newProduct, 20);

        System.out.printf("Sales price: R$ %6.2f%n", newProduct.salesPrice);
    }
}