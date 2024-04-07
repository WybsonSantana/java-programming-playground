public class Car {
    String manufacturer;
    String model;
    String color;
    int manufactureYear;
    double purchasePrice;
    Person owner;

    void calculateResaleValue() {
        int usageTimeInYears = 2024 - manufactureYear;
        int lifespanInYears = 20;

        double resaleValue = (purchasePrice / lifespanInYears) * (lifespanInYears - usageTimeInYears);

        if (resaleValue < 0) {
            resaleValue = 0;
        }

        System.out.printf("Usage time: %d year(s)%n", usageTimeInYears);
        System.out.printf("Resale value: R$ %6.2f%n", resaleValue);
    }
}