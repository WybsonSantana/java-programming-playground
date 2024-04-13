public class Payroll {

    double calculateSalary(EmploymentContract employmentContract,
                           int normalHoursAmount,
                           int overHoursAmount) {
        double amountToBeReceivedForNormalHours = normalHoursAmount * employmentContract.normalHourValue;
        double amountToBeReceivedForOverHours = overHoursAmount * employmentContract.overHourValue;

        double totalAmountToBeReceived = amountToBeReceivedForNormalHours + amountToBeReceivedForOverHours;

        if (employmentContract.hasAdditionalForHavingChildren()) {
            return totalAmountToBeReceived *= 1.1;
        }

        return totalAmountToBeReceived;
    }
}
