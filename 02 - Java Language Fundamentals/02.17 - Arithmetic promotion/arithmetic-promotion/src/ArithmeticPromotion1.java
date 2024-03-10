public class ArithmeticPromotion1 {
    public static void main(String[] args) {
        int number1 = 10;
        long number2 = 5;

        //int number3 = number1 * number2; // Doesn't compile
        long number3 = number1 * number2;

        System.out.println("Number 1: " + number1);
        System.out.println("Number 2: " + number2);
        System.out.println("Number 3: " + number3);
    }
}