import java.util.Scanner;

public class OpeningHours {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Type a day of the week (sun, mon, tue, wed, thu, fri, sat): ");
        String weekDay = input.nextLine();

        System.out.print("Type the month (1 - 12): ");
        int month = input.nextInt();

        if (month <= 0 || month >= 13) {
            System.out.println("Oops! Invalid month!");
            System.exit(0);
        }

        String openingHours = switch (weekDay) {
            case "mon" -> {
                if (month == 12) {
                    yield "08:00 AM until 04:00 PM";
                }
                yield "Closed!";
            }
            case "tue", "wed", "thu", "fri" -> "08:00 AM until 06:00 PM";
            case "sat", "sun" -> "08:00 AM until 12:00 PM";
            default -> "Invalid day!";
        };

        System.out.printf("Opening hours: %s%n", openingHours);

        input.close();
    }
}