public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient();
        patient.height = 1.85;
        patient.weight = 180;

        BodyMassIndex bmi = patient.calculateBodyMassIndex();

        if (bmi.isObese()) {
            System.out.printf("Patient with height %.2f and weight %.2f is obese!%n", bmi.height, bmi.weight);
        }

        System.out.printf("Body Mass Index: %.2f%n", bmi.result);
    }
}