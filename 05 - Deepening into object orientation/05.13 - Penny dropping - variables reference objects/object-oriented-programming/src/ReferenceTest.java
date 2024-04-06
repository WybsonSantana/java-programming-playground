public class ReferenceTest {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "John Due";

        Person person2 = new Person();
        person2.name = "Mary Due";

        Car car1 = new Car();
        car1.model = "HR-V";

        Car car2 = new Car();
        car2.model = "X6";

        car1.owner = person1;
        System.out.printf("Car 1 owner name: %s%n", car1.owner.name);

        car2.owner = person1;
        System.out.printf("Car 2 owner name: %s%n", car2.owner.name);

        car2.owner = person2;
        System.out.printf("Car 2 owner name: %s%n", car2.owner.name);

        car1.owner.name = "Scott Lin";
        System.out.printf("Car 1 owner name: %s%n", car1.owner.name);
        System.out.printf("Car 2 owner name: %s%n", car2.owner.name);

        car1.owner.name = "Mary Due";
        System.out.printf("Person 1 name: %s%n", person1.name);

        person1.name = "John Due";
        System.out.printf("Car 1 owner name: %s%n", car1.owner.name);
    }
}
