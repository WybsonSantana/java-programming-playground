public class PayStub {
    Employee employee;
    double amountToBeReceivedForNormalHours;
    double amountToBeReceivedForOverHours;
    double additionalValueForHavingChildren;

    double calculateReceivableAmount() {
        return amountToBeReceivedForNormalHours + amountToBeReceivedForOverHours + additionalValueForHavingChildren;
    }

    void print() {
        System.out.println("PAY STUB");
        System.out.println("--------------------");
        System.out.printf("Employee name: %s%n", employee.name);
        System.out.printf("Amount to be received for normal hours: R$ %6.2f%n", amountToBeReceivedForNormalHours);
        System.out.printf("Amount to be received for over hours: R$ %6.2f%n", amountToBeReceivedForOverHours);
        System.out.printf("Additional value for having children: R$ %6.2f%n", additionalValueForHavingChildren);
        System.out.printf("Total amount receivable: R$ %6.2f%n", calculateReceivableAmount());
    }
}
