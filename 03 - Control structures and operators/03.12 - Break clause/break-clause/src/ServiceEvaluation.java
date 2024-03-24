import java.util.Scanner;

public class ServiceEvaluation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Rate our service on a scale from 1 to 5: ");
        int serviceRate = input.nextInt();

        String rateDescription;

        switch (serviceRate) {
            case 1:
                rateDescription = "Too bad!";
                break;
            case 2:
                rateDescription = "Bad!";
                break;
            case 3:
                rateDescription = "Reasonable!";
                break;
            case 4:
                rateDescription = "Very good!";
                break;
            case 5:
                rateDescription = "Great!";
                break;
            default:
                rateDescription = "Invalid option!";
        }

        System.out.printf("You evaluated our service with the rating: %d - %s", serviceRate, rateDescription);

        input.close();
    }
}