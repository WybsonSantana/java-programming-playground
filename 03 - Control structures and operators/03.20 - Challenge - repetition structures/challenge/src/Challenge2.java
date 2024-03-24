import java.util.Scanner;

public class Challenge2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean isPrimeNumber = true;

        System.out.print("Type a integer number: ");
        int typedNumber = input.nextInt();

        for (int i = 2; i < typedNumber; i++) {
            if (typedNumber % i == 0) {
                isPrimeNumber = false;
                break;
            }
        }

        if (isPrimeNumber && typedNumber > 1) {
            System.out.printf("The number %d is prime%n", typedNumber);
        } else {
            System.out.printf("The number %d is not prime%n", typedNumber);
        }

        input.close();
    }
}
