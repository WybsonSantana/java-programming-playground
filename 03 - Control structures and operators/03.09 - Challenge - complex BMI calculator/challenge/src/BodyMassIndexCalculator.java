import java.util.Scanner;

public class BodyMassIndexCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Type your weight: ");
        int weight = input.nextInt();

        System.out.print("Type your height: ");
        double height = input.nextDouble();

        System.out.print("Type your sex:\n\tf - female\n\tm - male\n\tA:\\> ");
        char sex = input.next().charAt(0);

        if (sex != 'f' && sex != 'm') {
            System.out.println("Oops! Invalid option.\nSee you later!");
            System.exit(0);
        }

        double bodyMassIndex = weight / (height * height);

        if ((sex == 'f' && bodyMassIndex < 19.1) || (sex == 'm' && bodyMassIndex < 20.7)) {
            System.out.printf("Body Mass Index: %.2f%n", bodyMassIndex);
            System.out.println("You're underweight!");
        } else if ((sex == 'f' && bodyMassIndex <= 25.8) || (sex == 'm' && bodyMassIndex <= 26.4)) {
            System.out.printf("Body Mass Index: %.2f%n", bodyMassIndex);
            System.out.println("You are at your ideal weight!");
        } else if ((sex == 'f' && bodyMassIndex <= 27.3) || (sex == 'm' && bodyMassIndex <= 27.8)) {
            System.out.printf("Body Mass Index: %.2f%n", bodyMassIndex);
            System.out.println("You're a little overweight!");
        } else if ((sex == 'f' && bodyMassIndex <= 32.3) || (sex == 'm' && bodyMassIndex <= 31.1)) {
            System.out.printf("Body Mass Index: %.2f%n", bodyMassIndex);
            System.out.println("You are overweight!");
        } else {
            System.out.printf("Body Mass Index: %.2f%n", bodyMassIndex);
            System.out.println("You are obese!");
        }

        input.close();
    }
}