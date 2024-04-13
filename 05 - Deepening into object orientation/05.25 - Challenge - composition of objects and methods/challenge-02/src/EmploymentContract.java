public class EmploymentContract {
    Employee employee;
    double normalHourValue;
    double overHourValue;

    boolean hasAdditionalForHavingChildren() {
        return employee.hasChildren();
    }
}
