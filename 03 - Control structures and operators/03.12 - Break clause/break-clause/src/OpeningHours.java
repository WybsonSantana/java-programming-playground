import java.util.Scanner;

public class OpeningHours {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Type a day of the week (sun, mon, tue, wed, thu, fri, sat): ");
        String weekDay = input.nextLine();
        String openingHours;

        switch (weekDay) {
            case "mon":
                openingHours = "Closed!";
                break;
            case "tue":
            case "wed":
            case "thu":
            case "fri":
                openingHours = "08:00 AM until 06:00 PM";
                break;
            case "sat":
            case "sun":
                openingHours = "08:00 AM until 12:00 PM";
                break;
            default:
                openingHours = "Invalid day!";
        }

        System.out.printf("Opening hours: %s%n", openingHours);

        input.close();
    }
}