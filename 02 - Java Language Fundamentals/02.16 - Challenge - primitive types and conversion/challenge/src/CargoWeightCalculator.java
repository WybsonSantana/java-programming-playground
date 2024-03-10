public class CargoWeightCalculator {
    public static void main(String[] args) {
        double cargoWeight1 = 1033.49;
        double cargoWeight2 = 849.88;

        int cargoTotalWeight = (int) (cargoWeight1 + cargoWeight2);

        // The result should be 1883
        System.out.println("Cargo total weight: " + cargoTotalWeight);
    }
}