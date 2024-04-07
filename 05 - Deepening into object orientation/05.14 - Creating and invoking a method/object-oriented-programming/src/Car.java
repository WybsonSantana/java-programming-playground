public class Car {
    String manufacturer;
    String model;
    String color;
    int manufactureYear;
    Person owner;

    void calculateResaleValue() {
        System.out.printf("Calculate resale value of: %s %d%n", model, manufactureYear);
    }
}