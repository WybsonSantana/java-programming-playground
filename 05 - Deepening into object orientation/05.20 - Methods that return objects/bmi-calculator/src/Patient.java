public class Patient {
    double weight;
    double height;

    BodyMassIndex calculateBodyMassIndex() {
        BodyMassIndex bmi = new BodyMassIndex();
        bmi.result = weight / (height * height);
        bmi.weight = weight;
        bmi.height = height;

        return bmi;
    }
}
