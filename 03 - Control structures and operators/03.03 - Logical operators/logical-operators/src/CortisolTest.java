import java.util.Scanner;

public class CortisolTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Cortisol level: ");
        double cortisolLevel = input.nextDouble();

        // Ideal level between 6.0 to 18.4
        boolean normalCortisolLevel = cortisolLevel >= 6.0 && cortisolLevel <= 18.4;
        boolean abnormalCortisolLevel = cortisolLevel < 6.0 || cortisolLevel > 18.4;

        System.out.printf("Normal cortisol level: %b%n", normalCortisolLevel);
        System.out.printf("Abnormal cortisol level: %b%n", abnormalCortisolLevel);

        input.close();
    }
}