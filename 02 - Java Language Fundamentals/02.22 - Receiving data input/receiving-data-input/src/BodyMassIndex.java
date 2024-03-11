import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Type your weight: ");
        int weight = input.nextInt();

        System.out.print("Type your height: ");
        double height = input.nextDouble();

        // Workaround to consume line break before next nextLine
        input.nextLine();

        System.out.print("Type your name: ");
        String name = input.nextLine();

        double bmi = weight / (height * height);
        System.out.printf("Body Mass Index of %s: %.2f%n", name, bmi);

        input.close();
    }
}
