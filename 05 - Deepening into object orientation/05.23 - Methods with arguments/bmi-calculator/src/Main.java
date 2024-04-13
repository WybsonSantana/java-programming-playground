public class Main {
    public static void main(String[] args) {
        BodyMassIndexCalculator bodyMassIndexCalculator = new BodyMassIndexCalculator();
        double weight = 180;
        double height = 1.85;

        BodyMassIndex bmi = bodyMassIndexCalculator.calculate(weight, height);

        if (bmi.isObese()) {
            System.out.printf("Patient with height %.2f and weight %.2f is obese!%n", bmi.height, bmi.weight);
        }

        System.out.printf("Body Mass Index: %.2f%n", bmi.result);
    }
}