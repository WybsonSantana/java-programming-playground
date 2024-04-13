public class Payroll {

    PayStub calculateSalary(EmploymentContract employmentContract,
                            int normalHoursAmount,
                            int overHoursAmount) {
        PayStub payStub = new PayStub();
        payStub.employee = employmentContract.employee;
        payStub.amountToBeReceivedForNormalHours = employmentContract.normalHourValue * normalHoursAmount;
        payStub.amountToBeReceivedForOverHours = employmentContract.overHourValue * overHoursAmount;

        double subtotal = payStub.amountToBeReceivedForNormalHours + payStub.amountToBeReceivedForOverHours;

        if (employmentContract.hasAdditionalForHavingChildren()) {
            payStub.additionalValueForHavingChildren += subtotal * 0.1;
        }

        return payStub;
    }
}
