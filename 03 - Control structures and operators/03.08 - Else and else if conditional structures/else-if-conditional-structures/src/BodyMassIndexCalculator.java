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
        } else if (bodyMassIndex < 25) {
            System.out.println("You are at ideal weight!");
        } else if (bodyMassIndex < 30) {
            System.out.println("You are overweight!");
        } else if (bodyMassIndex < 35) {
            System.out.println("You have grade I obesity!");
        } else if (bodyMassIndex <= 40) {
            System.out.println("You have grade II obesity!");
        } else {
            System.out.println("You have grade III obesity!");
        }

        System.out.println("End of program...");
    }
}