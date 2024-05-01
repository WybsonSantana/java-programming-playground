public class Main {
    public static void main(String[] args) {
        double supplierPurchasePrice = 140;

        PricingService pricingService = new PricingService();
        pricingService.calculateSalesPrice(supplierPurchasePrice);

        System.out.printf("Price: R$ %6.2f%n", supplierPurchasePrice);
    }
}