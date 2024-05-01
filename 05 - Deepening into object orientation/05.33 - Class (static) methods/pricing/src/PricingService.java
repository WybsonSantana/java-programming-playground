public class PricingService {

    void setSalesPrice(Product product, double profitMarginPercentage) {
        // There could be much more complex calculations here

        double calculatedSalesPrice = product.costPrice * ((profitMarginPercentage / 100) + 1);
        calculatedSalesPrice += Product.packagingCost;

        product.salesPrice = calculatedSalesPrice;
    }
}
