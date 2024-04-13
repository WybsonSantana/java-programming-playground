public class Car {
    String manufacturer;
    String model;
    String color;
    int manufactureYear;
    double purchasePrice;
    Person owner;

    void printCarDepreciationSummary() {
        double resaleValue = calculateResaleValue();
        int usageTimeInYears = calculateUsageTimeInYears();

        System.out.printf("Usage time: %d year(s)%n", usageTimeInYears);
        System.out.printf("Resale value: R$ %6.2f%n", resaleValue);
    }

    double calculateIpva() {
        return calculateResaleValue() * 0.04;
    }

    int calculateUsageTimeInYears() {
        return 2024 - manufactureYear;
    }

    double calculateResaleValue() {
        int usageTimeInYears = calculateUsageTimeInYears();
        int lifespanInYears = 20;

        double resaleValue = (purchasePrice / lifespanInYears) * (lifespanInYears - usageTimeInYears);

        if (resaleValue < 0) {
            resaleValue = 0;
        }

        return resaleValue;
    }
}