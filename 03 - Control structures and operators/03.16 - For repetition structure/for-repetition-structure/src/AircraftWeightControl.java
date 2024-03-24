import java.util.Scanner;

public class AircraftWeightControl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Maximum aircraft weight: ");
        int maxSupportedAircraftWeight = input.nextInt();

        System.out.print("Passengers amount: ");
        int passengersAmount = input.nextInt();

        int totalPassengersWeight = 0;

        for (int passenger = 1; passenger <= passengersAmount; passenger++) {
            System.out.printf("Weight of passenger %d:", passenger);
            int passengerWeight = input.nextInt();

            totalPassengersWeight += passengerWeight;
        }

        System.out.printf("Maximum aircraft weight: %d kg%n", maxSupportedAircraftWeight);
        System.out.printf("Total passengers weight: %d kg%n", totalPassengersWeight);
        System.out.printf("Aircraft status: %s", totalPassengersWeight > maxSupportedAircraftWeight ? "Excess weight" : "Aircraft released!");

        input.close();
    }
}
