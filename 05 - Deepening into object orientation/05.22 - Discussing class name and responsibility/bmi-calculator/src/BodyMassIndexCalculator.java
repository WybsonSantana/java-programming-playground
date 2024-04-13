public class BodyMassIndexCalculator {
    double weight;
    double height;

    BodyMassIndex calculate() {
        BodyMassIndex bmi = new BodyMassIndex();
        bmi.result = weight / (height * height);
        bmi.weight = weight;
        bmi.height = height;

        return bmi;
    }
}
