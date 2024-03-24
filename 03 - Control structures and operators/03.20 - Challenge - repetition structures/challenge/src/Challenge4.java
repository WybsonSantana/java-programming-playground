import java.util.Scanner;

public class Challenge4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Type a integer number: ");
        int typedNumber = input.nextInt();

        int invertedNumber = 0;
        int transitionNumber = typedNumber;

        while (transitionNumber > 0) {
            int rest = transitionNumber % 10;
            invertedNumber = invertedNumber * 10 + rest;
            transitionNumber /= 10;
        }

        System.out.printf("The inverse of the number %d is %d", typedNumber, invertedNumber);

        input.close();
    }
}
