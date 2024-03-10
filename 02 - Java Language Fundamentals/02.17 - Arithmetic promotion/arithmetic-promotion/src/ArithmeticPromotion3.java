public class ArithmeticPromotion3 {
    public static void main(String[] args) {
        int number1 = 3;
        int number2 = 2;

        //float number3 = number1 / number2; // Assigns 1.0
        //float number3 = (float) (number1 / number2); // Assigns 1.0

        float number3 = number1 / (float) number2; // Assigns 1.5

        System.out.println("Number 1: " + number1);
        System.out.println("Number 2: " + number2);
        System.out.println("Number 3: " + number3);
    }
}
