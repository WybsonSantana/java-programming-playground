public class Main {
    public static void main(String[] args) {
        Aircraft aircraft1 = new Aircraft();
        aircraft1.totalSeats = 100;

        //aircraft1.active = false;
        aircraft1.deactivate();
        aircraft1.activate();

        aircraft1.reserveSeats(10);

        System.out.printf("Aircraft status: %s%nNumber of seats available: %d%n",
                aircraft1.active ? "activated" : "deactivated",
                aircraft1.calculateAvailableSeats());

        Aircraft aircraft2 = new Aircraft();
        aircraft2.totalSeats = 120;

        aircraft2.reserveSeats(5);

        System.out.printf("Aircraft status: %s%nNumber of seats available: %d%n",
                aircraft2.active ? "activated" : "deactivated",
                aircraft2.calculateAvailableSeats());
    }
}