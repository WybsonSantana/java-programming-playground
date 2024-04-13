public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Wybson Santana";
        person1.documentId = "111.222.333-44";
        person1.birthYear = 1985;

        Person person2 = new Person();
        person2.name = "John Due";
        person2.documentId = "555.666.777-88";
        person2.birthYear = 1950;

        Car myCar = new Car();
        myCar.manufacturer = "Honda";
        myCar.model = "HR-V";
        myCar.color = "Black";
        myCar.manufactureYear = 2021;
        myCar.purchasePrice = 0;
        myCar.owner = person1;

        Car yourCar = new Car();
        yourCar.manufacturer = "BMW";
        yourCar.model = "X6";
        yourCar.color = "White";
        yourCar.manufactureYear = 2020;
        yourCar.purchasePrice = 980000;
        yourCar.owner = person2;

        double ipvaValue = myCar.calculateIpva();
        System.out.printf("IPVA value: R$ %6.2f%n", ipvaValue);

        myCar.printCarDepreciationSummary();
        yourCar.printCarDepreciationSummary();

//        double myCarResaleValue = myCar.calculateResaleValue();
//        double yourCarResaleValue = yourCar.calculateResaleValue();
//
//        System.out.printf("My car usage time: %d year(s)%n", 2024 - myCar.manufactureYear);
//        System.out.printf("My car resale value: R$ %6.2f%n", myCarResaleValue);
//
//        System.out.printf("Your car usage time: %d year(s)%n", 2024 - yourCar.manufactureYear);
//        System.out.printf("Your car resale value: R$ %6.2f%n", yourCarResaleValue);
//
//        System.out.println("My car");
//        System.out.println("----------------------");
//        System.out.printf("Model: %s%n", myCar.model);
//        System.out.printf("Manufacture year: %d%n", myCar.manufactureYear);
//        System.out.printf("Owner: %s%n%n", myCar.owner.name);
//
//        System.out.println("Your car");
//        System.out.println("----------------------");
//        System.out.printf("Model: %s%n", yourCar.model);
//        System.out.printf("Manufacture year: %d%n", yourCar.manufactureYear);
//        System.out.printf("Owner: %s%n%n", yourCar.owner.name);
    }
}
