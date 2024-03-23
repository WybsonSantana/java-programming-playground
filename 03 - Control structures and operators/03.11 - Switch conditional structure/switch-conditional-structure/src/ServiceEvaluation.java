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
            case 2:
                rateDescription = "Bad!";
            case 3:
                rateDescription = "Reasonable!";
            case 4:
                rateDescription = "Very good!";
            case 5:
                rateDescription = "Great!";
            default:
                rateDescription = "Invalid option!";
        }

        /**
         *************************************************************************
         Without a break statement in the switch it is as if we had the following:
         //
         //        if (serviceRate == 1) {
         //            rateDescription = "Too bad!";
         //            rateDescription = "Bad!";
         //            rateDescription = "Reasonable!";
         //            rateDescription = "Very good!";
         //            rateDescription = "Great!";
         //        } else if (serviceRate == 2) {
         //            rateDescription = "Bad!";
         //            rateDescription = "Reasonable!";
         //            rateDescription = "Very good!";
         //            rateDescription = "Great!";
         //        } else if (serviceRate == 3) {
         //            rateDescription = "Reasonable!";
         //            rateDescription = "Very good!";
         //            rateDescription = "Great!";
         //        } else if (serviceRate == 4) {
         //            rateDescription = "Very good!";
         //            rateDescription = "Great!";
         //        } else if (serviceRate == 5) {
         //            rateDescription = "Great!";
         //        }
         //        rateDescription = "Invalid option!";
         *************************************************************************
         **/

        System.out.printf("You evaluated our service with the rating: %d - %s", serviceRate, rateDescription);
    }
}