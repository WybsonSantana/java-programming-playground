public class Aircraft {
    boolean active = true;
    int totalSeats;
    int reservedSeatsAmount;

    int calculateAvailableSeats() {
        return totalSeats - reservedSeatsAmount;
    }

    void reserveSeats(int amount) {
        if (active) {
            reservedSeatsAmount += amount;
        } else {
            // There is a better way to do this: exceptions
            // But we haven't studied it yet
            System.out.println("Decommissioned aircraft! Unreserved seats.");
        }
    }

    void deactivate() {
        active = false;
    }

    void activate() {
        active = true;
    }
}
