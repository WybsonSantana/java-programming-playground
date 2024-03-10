public class LongToIntConversion {
    public static void main(String[] args) {
        long number1 = 10;

        int number2 = (int) number1;
        //int number3 = number1; // Doesn't compile

        System.out.println("Number 1: " + number1);
        System.out.println("Number 2: " + number2);
    }
}
