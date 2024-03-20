import java.util.Scanner;

public class BodyMassIndexCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Weight: ");
        int weight = input.nextInt();

        System.out.print("Height: ");
        double height = input.nextDouble();

        double bodyMassIndex = weight / (height * height);

        if (bodyMassIndex < 18.5) {
            System.out.println("You are below your ideal weight!");
        }

        if (bodyMassIndex >= 18.5 && bodyMassIndex < 25) {
            System.out.println("You are at ideal weight!");
        }

        if (bodyMassIndex > 25 && bodyMassIndex < 30) {
            System.out.println("You are overweight!");
        }

        if (bodyMassIndex >= 30 && bodyMassIndex < 35) {
            System.out.println("You have grade I obesity!");
        }

        if (bodyMassIndex > 35 && bodyMassIndex <= 40) {
            System.out.println("You have grade II obesity!");
        }

        if (bodyMassIndex >= 40) {
            System.out.println("You have grade III obesity!");
        }

        System.out.println("End of program...");
    }
}