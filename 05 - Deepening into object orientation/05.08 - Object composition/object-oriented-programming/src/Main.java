public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.manufacturer = "Honda";
        myCar.model = "HR-V";
        myCar.color = "Black";
        myCar.manufactureYear = 2021;

        Car yourCar = new Car();
        yourCar.manufacturer = "BMW";
        yourCar.model = "X6";
        yourCar.color = "White";
        yourCar.manufactureYear = 2022;

        System.out.println("My car");
        System.out.println("----------------------");
        System.out.printf("Model: %s%n", myCar.model);
        System.out.printf("Manufacture year: %d%n%n", myCar.manufactureYear);

        System.out.println("Your car");
        System.out.println("----------------------");
        System.out.printf("Model: %s%n", yourCar.model);
        System.out.printf("Manufacture year: %d%n%n", yourCar.manufactureYear);
    }
}
