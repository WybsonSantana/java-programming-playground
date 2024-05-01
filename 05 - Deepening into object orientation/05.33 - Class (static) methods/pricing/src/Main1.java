public class Main1 {
    public static void main(String[] args) {
        Product.packagingCost = 10;

        Product newProduct = new Product();
        newProduct.costPrice = 100;
        newProduct.changeCostPrice(80);
        newProduct.packagingCost = 30;

        PricingService pricingService = new PricingService();
        pricingService.setSalesPrice(newProduct, 20);

        System.out.printf("Cost price: R$ %6.2f%n", newProduct.costPrice);
        System.out.printf("Sales price: R$ %6.2f%n", newProduct.salesPrice);
    }
}