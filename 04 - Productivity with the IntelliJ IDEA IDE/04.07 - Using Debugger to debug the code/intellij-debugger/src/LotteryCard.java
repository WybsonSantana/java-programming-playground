public class LotteryCard {
    public static void main(String[] args) {
        System.out.println("Printing card...\n");

        int totalNumbers = 60;
        int numbersPerLine = 10;

        for (int i = 1; i <= totalNumbers; i++) {
            if (i < 10) {
                System.out.print("0");
            }

            System.out.print(i + " ");

            if (i % numbersPerLine == 0 || i == totalNumbers) {
                System.out.println();
            }
        }

        System.out.printf("%nCard with %d numbers printed successfully%n", totalNumbers);
    }

}