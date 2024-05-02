public class EntranceRegistration {
    static final int DEFAULT_EXPIRATION_TIME_IN_MONTHS = 1;

    void register(final Visitor visitor) {
        this.register(visitor, DEFAULT_EXPIRATION_TIME_IN_MONTHS);
    }

    int register(final Visitor visitor, final int expirationInMonths) {
        final var expirationInDays = expirationInMonths * 30;

        System.out.printf("Visitor %s registered for %d days!%n", visitor.name, expirationInDays);

        return 1;
    }
}
