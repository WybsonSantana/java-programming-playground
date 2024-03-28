public class InitializationTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.manufacturer = "Honda";
        car.manufactureYear = 2023;

        /*
        car.owner.name = "Foo Lanno"; // NullPointerException
        Person previousOwner = car.owner; // NullPointerException
        */

        car.owner = new Person();

        System.out.printf("Manufacturer: %s%n", car.manufacturer);
        System.out.printf("Model: %s%n", car.model);
        System.out.printf("Color: %s%n", car.color);
        System.out.printf("Manufacture year: %d%n", car.manufactureYear);
        System.out.printf("Owner name: %s%n", car.owner.name);
    }
}
