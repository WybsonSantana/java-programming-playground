public class EntranceRegistration {
    void register(final Visitor visitor, final int expirationInMonths) {
        final int expirationInDays = expirationInMonths * 30;

        System.out.printf("Visitor %s registered for %d days!%n", visitor.name, expirationInDays);

    }
}
