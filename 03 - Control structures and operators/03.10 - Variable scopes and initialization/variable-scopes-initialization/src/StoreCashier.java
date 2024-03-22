import java.util.Scanner;

public class StoreCashier {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Products price: ");
        double productsPrice = input.nextDouble();

        System.out.print("Shipping charge: ");
        boolean hasShippingCharge = input.nextBoolean();

        double shippingChargeValue = 0;

        if (hasShippingCharge) {
            System.out.print("Shipping charge value: ");
            shippingChargeValue = input.nextDouble();
        }

        double totalPrice = productsPrice + shippingChargeValue;

        System.out.printf("Total price: US$ %.2f", totalPrice);

        input.close();
    }
}