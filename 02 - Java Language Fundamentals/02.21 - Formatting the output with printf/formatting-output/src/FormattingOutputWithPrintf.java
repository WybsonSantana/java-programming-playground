public class FormattingOutputWithPrintf {
    public static void main(String[] args) {
        String name1 = "John Due";
        System.out.printf("Hello, %s!%n", name1);

        int quantity = 369;
        System.out.printf("Quantity: %d items.%n", quantity);

        double weight = 738.123;
        System.out.printf("Weight: %10.2f", weight);
    }
}