public class DecrementOperator {
    public static void main(String[] args) {
        int number = 10;

        number--; // 9

        int postDecrementNumber = number--; // 9 - first assign the value of the variable and then decrement it
        int preDecrementNumber = --number; // 7 - first decrement the value and then assign the variable

        System.out.println("Number value: " + number);
        System.out.println("Post decremented value: " + postDecrementNumber);
        System.out.println("Pre decremented value: " + preDecrementNumber);
    }
}
