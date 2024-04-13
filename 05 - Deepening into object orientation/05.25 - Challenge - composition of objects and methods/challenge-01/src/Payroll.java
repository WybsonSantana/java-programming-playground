public class Payroll {

    double calculateSalary(int normalHoursAmount,
                           int overHoursAmount,
                           double normalHourValue,
                           double overHourValue) {
        double amountToBeReceivedForNormalHours = normalHoursAmount * normalHourValue;
        double amountToBeReceivedForOverHours = overHoursAmount * overHourValue;

        return amountToBeReceivedForNormalHours + amountToBeReceivedForOverHours;
    }
}
