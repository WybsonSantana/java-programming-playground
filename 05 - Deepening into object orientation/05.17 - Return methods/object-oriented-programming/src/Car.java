public class Car {
    String manufacturer;
    String model;
    String color;
    int manufactureYear;
    double purchasePrice;
    Person owner;

    double calculateResaleValue() {
        int usageTimeInYears = 2024 - manufactureYear;
        int lifespanInYears = 20;

        double resaleValue = (purchasePrice / lifespanInYears) * (lifespanInYears - usageTimeInYears);

        if (resaleValue < 0) {
            resaleValue = 0;
        }

        return resaleValue;
    }
}