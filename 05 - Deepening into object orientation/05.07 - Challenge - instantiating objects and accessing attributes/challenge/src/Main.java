public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Spike";
        dog1.breed = "Dobermann";
        dog1.gender = 'M';
        dog1.age = 5;

        Dog dog2 = new Dog();
        dog2.name = "Layka";
        dog2.breed = "Labrador Retriever";
        dog2.gender = 'F';
        dog2.age = 3;

        System.out.println("Dog 01");
        System.out.println("--------------------");
        System.out.printf("Name: %s%n", dog1.name);
        System.out.printf("Breed: %s%n", dog1.breed);
        System.out.printf("Gender: %s%n", dog1.gender);
        System.out.printf("Age: %d%n%n", dog1.age);

        System.out.println("Dog 02");
        System.out.println("--------------------");
        System.out.printf("Name: %s%n", dog2.name);
        System.out.printf("Breed: %s%n", dog2.breed);
        System.out.printf("Gender: %s%n", dog2.gender);
        System.out.printf("Age: %d%n%n", dog2.age);
    }
}