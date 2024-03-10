public class ArithmeticPromotion2 {
    public static void main(String[] args) {
        long number1 = 10;
        float number2 = 3.69F;

        //long number3 = number1 * number2; // Doesn't compile
        float number3 = number1 * number2;

        System.out.println("Number 1: " + number1);
        System.out.println("Number 2: " + number2);
        System.out.println("Number 3: " + number3);
    }
}
