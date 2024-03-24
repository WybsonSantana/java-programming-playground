public class LogicalOperatorsPrecedence {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 20;

        boolean result1 = number1 == 13 && number1 == 15 || number2 == 20;
        boolean result2 = (number1 == 13 && number1 == 15) || number2 == 20;
        boolean result3 = number1 == 13 && (number1 == 15 || number2 == 20);

        System.out.printf("Result 1: %b%n", result1);
        System.out.printf("Result 2: %b%n", result2);
        System.out.printf("Result 3: %b%n", result3);
    }
}