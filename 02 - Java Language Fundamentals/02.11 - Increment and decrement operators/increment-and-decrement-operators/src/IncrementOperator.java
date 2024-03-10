public class IncrementOperator {
    public static void main(String[] args) {
        int number = 10;

        number = number + 1; // 11
        number += 3; // 14
        number++; // 15

        int postIncrementedNumber = number++; // 15 - first assigns the value of the variable and then increments
        int preIncrementedNumber = ++number; // 17 - first increments the value of the variable and then assigns

        System.out.println("Number value: " + number);
        System.out.println("Post incremented number: " + postIncrementedNumber);
        System.out.println("Pre incremented number: " + preIncrementedNumber);
    }
}