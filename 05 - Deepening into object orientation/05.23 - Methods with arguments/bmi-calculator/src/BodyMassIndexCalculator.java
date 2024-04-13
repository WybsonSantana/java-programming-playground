public class BodyMassIndexCalculator {

    BodyMassIndex calculate(double weight, double height) {
        BodyMassIndex bmi = new BodyMassIndex();
        bmi.result = weight / (height * height);
        bmi.weight = weight;
        bmi.height = height;

        return bmi;
    }
}
