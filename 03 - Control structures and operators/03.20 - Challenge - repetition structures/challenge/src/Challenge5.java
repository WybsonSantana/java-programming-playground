import java.util.Scanner;

public class Challenge5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean hasMoreNumber;
        int evenNumbersSum = 0;
        int oddNumbersSum = 0;

        do {
            System.out.print("Type a integer number: ");
            int typedNumber = input.nextInt();

            if (typedNumber % 2 == 0) {
                evenNumbersSum += typedNumber;
            } else {
                oddNumbersSum += typedNumber;
            }

            System.out.print("Do you want to type any more number? ");
            hasMoreNumber = input.nextBoolean();
        } while (hasMoreNumber);

        System.out.printf("The sum of even numbers is: %d%n", evenNumbersSum);
        System.out.printf("The sum of odd numbers is: %d%n", oddNumbersSum);

        input.close();
    }
}
