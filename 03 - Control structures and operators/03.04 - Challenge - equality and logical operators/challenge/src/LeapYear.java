import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Type a year: ");
        int year = input.nextInt();

        boolean leapYear = year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);

        System.out.printf("Is %d a leap year? %b%n", year, leapYear);

        input.close();
    }
}