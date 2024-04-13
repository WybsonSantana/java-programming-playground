public class BodyMassIndexCalculator {

    BodyMassIndex calculate(Patient patient) {
        BodyMassIndex bmi = new BodyMassIndex();
        bmi.result = patient.weight / (patient.height * patient.height);
        bmi.weight = patient.weight;
        bmi.height = patient.height;

        return bmi;
    }
}
