public class Product {
    static double packagingCost;

    double costPrice;
    double salesPrice;

    void changePackagingPrice(double packagingCost) {
        Product.packagingCost = packagingCost;
    }

    void changeCostPrice(double costPrice) {
        this.costPrice = costPrice;
    }

    void printPackageCost() {
        System.out.printf("Package cost: R$ %6.2f%n", Product.packagingCost);
    }
}
