public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "John Due";
        employee.childrenNumber = 5;

        EmploymentContract employmentContract = new EmploymentContract();
        employmentContract.employee = employee;
        employmentContract.normalHourValue = 70.0;
        employmentContract.overHourValue = 105.0;

        Payroll payroll = new Payroll();

        double receivableAmount = payroll.calculateSalary(employmentContract, 160, 30);

        System.out.printf("Receivable amount: R$ %6.2f%n", receivableAmount);
    }
}