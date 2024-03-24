import java.util.Scanner;

public class VitaminDTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Desired level: above 20 ng per ml
// Risk group: 30 to 60 ng per ml

        System.out.print("Risk group: ");
        boolean riskGroup = input.nextBoolean();

        System.out.print("Vitamin D level: ");
        double vitaminD = input.nextDouble();

        boolean normalVitaminD = (!riskGroup && vitaminD > 20)
                || (riskGroup && vitaminD >= 30 && vitaminD <= 60);

        System.out.printf("Normal vitamin D: %b%n", normalVitaminD);
    }
}
