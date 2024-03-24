import java.util.Scanner;

public class Challenge3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numbersSum = 0;

        while (numbersSum < 100) {
            System.out.print("Type a integer number: ");
            int typedNumber = input.nextInt();

            numbersSum += typedNumber;
        }

        System.out.printf("Numbers sum: %d%n", numbersSum);

        input.close();
    }
}
