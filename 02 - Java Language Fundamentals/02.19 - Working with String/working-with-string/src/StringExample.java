public class StringExample {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 5;

        // Concatenates everything
        System.out.println("Result: " + number1 + number2);

        // Performs calculation before concatenation
        System.out.println(number1 + number2 + " was the result of the sum");

        // Performs calculation before concatenation
        System.out.println("Result: " + (number1 + number2));

        String name = "John Due";
        int age = 95;

        System.out.println(name + " is " + age + " years old");
    }
}