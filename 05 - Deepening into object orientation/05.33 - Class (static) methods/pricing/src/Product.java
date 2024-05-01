public class Product {
    static double packagingCost;

    double costPrice;
    double salesPrice;

    void changeCostPrice(double costPrice) {
        this.costPrice = costPrice;
    }

    static void changePackagingPrice(double packagingCost) {
        Product.packagingCost = packagingCost;
    }

    static void printPackageCost() {
        System.out.printf("Package cost: R$ %6.2f%n", Product.packagingCost);
    }
}
