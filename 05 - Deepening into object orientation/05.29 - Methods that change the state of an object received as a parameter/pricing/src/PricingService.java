public class PricingService {

    void setSalesPrice(Product product, double profitMarginPercentage) {
        // There could be much more complex calculations here

        product.salesPrice = product.costPrice * ((profitMarginPercentage / 100) + 1);

        // Other executions
    }
}
