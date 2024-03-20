public class LogicalOperatorsShortCircuiting {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 20;

        boolean result1 = number1 == 10 && number2++ == 20;
        boolean result2 = number1 == 15 || number2++ == 20;

        System.out.printf("Result 1: %b%n", result1);
        System.out.printf("Result 2: %b%n", result2);
        System.out.printf("Number 1: %d%n", number1);
        System.out.printf("Number 2: %d%n", number2);
    }
}