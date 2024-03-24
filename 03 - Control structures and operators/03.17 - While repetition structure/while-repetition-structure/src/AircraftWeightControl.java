import java.util.Scanner;

public class AircraftWeightControl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Maximum aircraft weight: ");
        int maxSupportedAircraftWeight = input.nextInt();

        int totalPassengersWeight = 0;
        boolean addNewPassenger = true;

        while (totalPassengersWeight <= maxSupportedAircraftWeight && addNewPassenger) {
            System.out.print("Weight of passenger: ");
            int passengerWeight = input.nextInt();

            totalPassengersWeight += passengerWeight;

            System.out.print("Do you want to add a new passenger? ");
            addNewPassenger = input.nextBoolean();
        }

        System.out.printf("Maximum aircraft weight: %d kg%n", maxSupportedAircraftWeight);
        System.out.printf("Total passengers weight: %d kg%n", totalPassengersWeight);
        System.out.printf("Aircraft status: %s", totalPassengersWeight > maxSupportedAircraftWeight ? "Excess weight" : "Aircraft released!");

        input.close();
    }
}
