public class Main {
    public static void main(String[] args) {
        Payroll payroll = new Payroll();

        double receivableAmount = payroll.calculateSalary(160, 30, 70.0, 105.0);

        System.out.printf("Receivable amount: R$ %6.2f%n", receivableAmount);
    }
}