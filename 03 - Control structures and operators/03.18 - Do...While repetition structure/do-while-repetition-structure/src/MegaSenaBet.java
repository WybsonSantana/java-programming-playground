import java.util.Scanner;

public class MegaSenaBet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numbersAmount;

        do {
            System.out.print("Numbers amount in the bet: ");
            numbersAmount = input.nextInt();

            if (numbersAmount < 6 || numbersAmount > 15) {
                System.out.println("The numbers amount must be between 6 and 15!");
            }
        } while (numbersAmount < 6 || numbersAmount > 15);

        int currentNumber = 1;
        String allChosenBetNumbers = "";

        do {
            System.out.printf("Number %d of %d: ", currentNumber, numbersAmount);
            int chosenNumber = input.nextInt();

            if (chosenNumber < 1 || chosenNumber > 60) {
                System.out.println("The bet number must be between 1 and 60!");
            } else {
                allChosenBetNumbers += chosenNumber + " ";
                currentNumber++;
            }
        } while (currentNumber <= numbersAmount);

        System.out.printf("All chosen bet numbers: %s", allChosenBetNumbers);

        input.close();
    }
}