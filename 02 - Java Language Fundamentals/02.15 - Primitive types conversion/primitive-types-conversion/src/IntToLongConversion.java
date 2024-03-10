public class IntToLongConversion {
    public static void main(String[] args) {
        int number1 = 115_369;

        long number2 = number1;
        long number3 = (long) number1; // Casting instruction is optional

        System.out.println("Number 1: " + number1);
        System.out.println("Number 2: " + number2);
        System.out.println("Number 3: " + number3);
    }
}
