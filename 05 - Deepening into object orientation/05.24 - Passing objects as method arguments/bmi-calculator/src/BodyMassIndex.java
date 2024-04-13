public class BodyMassIndex {
    double result;
    double weight;
    double height;

    boolean isObese() {
        return result >= 30;
    }

    boolean isUnderWeight() {
        return result <= 18.5;
    }
}
