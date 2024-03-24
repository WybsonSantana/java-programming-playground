import java.util.Scanner;

public class Challenge1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int evenNumbersSum = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Type a number: ");
            int typedNumber = input.nextInt();

            if (typedNumber % 2 != 0) {
                i--;
                continue;
            }

            evenNumbersSum += typedNumber;
        }

        System.out.printf("Even numbers sum: %d%n", evenNumbersSum);

        input.close();
    }
}