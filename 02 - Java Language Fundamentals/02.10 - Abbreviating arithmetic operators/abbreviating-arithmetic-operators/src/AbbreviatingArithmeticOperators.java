public class AbbreviatingArithmeticOperators {
    public static void main(String[] args) {
        int totalProducts = 10;

        // This...
        totalProducts = totalProducts + 7; // 17

        // It's the same...
        totalProducts += 7; // 24

        totalProducts -= 14; // 10

        totalProducts /= 2; // 5

        totalProducts *= 5; // 25

        totalProducts %= 3; // 1

        System.out.println("Total of products: " + totalProducts);
    }
}