import java.util.Scanner;

public class Payroll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Employee name: ");
        String employeeName = input.nextLine();

        System.out.print("Value per worked hour: ");
        double valuePerWorkedHour = input.nextDouble();

        System.out.print("Number of worked hours: ");
        int numberOfWorkedHours = input.nextInt();

        System.out.print("Discount amount: ");
        double discountAmount = input.nextDouble();

        double grossAmount = valuePerWorkedHour * numberOfWorkedHours;
        double amountDue = grossAmount - discountAmount;

        System.out.printf("Payroll: %s%n", employeeName);
        System.out.printf("%d hours x R$ %.2f = R$ %.2f%n", numberOfWorkedHours, valuePerWorkedHour, grossAmount);
        System.out.printf("Discounts: R$ %.2f%n", discountAmount);
        System.out.printf("Amount due: R$ %.2f%n", amountDue);

        input.close();
    }
}