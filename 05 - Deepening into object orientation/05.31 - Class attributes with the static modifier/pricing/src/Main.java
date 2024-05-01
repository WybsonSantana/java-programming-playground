public class Main {
    public static void main(String[] args) {
        Product.packagingCost = 10;

        Product newProduct1 = new Product();
        newProduct1.costPrice = 100;
        newProduct1.changeCostPrice(80);
        //newProduct1.packagingCost = 30;

        Product newProduct2 = new Product();
        //newProduct2.packagingCost = 20;

        PricingService pricingService = new PricingService();
        pricingService.setSalesPrice(newProduct1, 20);

        System.out.printf("Cost price: R$ %6.2f%n", newProduct1.costPrice);
        System.out.printf("Sales price: R$ %6.2f%n", newProduct1.salesPrice);
    }
}