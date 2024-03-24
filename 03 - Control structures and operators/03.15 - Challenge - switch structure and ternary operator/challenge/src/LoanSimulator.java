import java.util.Scanner;

public class LoanSimulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Loan value: ");
        double loanValue = input.nextDouble();

        System.out.print("Installments number: ");
        int installmentsNumber = input.nextInt();

        double interestRate = switch (installmentsNumber) {
            case 1, 2 -> 1.99;
            case 3 -> 2.99;
            default -> 3.99;
        };

        double fixedFare = loanValue >= 100 ? 1.5 : 0;
        double totalInterest = loanValue * (interestRate / 100 * installmentsNumber);
        double totalLoanCost = loanValue + fixedFare + totalInterest;

        System.out.printf("Fixed fare: R$ %.2f%n", fixedFare);
        System.out.printf("Total interest: R$ %.2f%n", totalInterest);
        System.out.printf("Total loan cost: R$ %.2f%n", totalLoanCost);

        input.close();
    }
}