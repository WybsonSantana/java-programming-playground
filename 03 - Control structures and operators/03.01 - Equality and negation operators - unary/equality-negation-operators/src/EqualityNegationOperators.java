public class EqualityNegationOperators {
    public static void main(String[] args) {
        boolean equalNumbers1 = 17 == 17;
        boolean equalNumbers2 = 4 + 6 == 5 * 2;

        int number1 = 10;
        int number2 = 11;

        boolean equalNumbers3 = number1 == 10;
        boolean equalNumbers4 = number1 == number2;

        boolean differentNumbers1 = !equalNumbers4;
        boolean differentNumbers2 = !(number1 == number2);
        boolean differentNumbers3 = number1 != number2;

        System.out.printf("Equal numbers: %b%n", equalNumbers1);
        System.out.printf("Equal numbers: %b%n", equalNumbers2);
        System.out.printf("Equal numbers: %b%n", equalNumbers3);
        System.out.printf("Equal numbers: %b%n", equalNumbers4);

        System.out.printf("Different numbers: %b%n", differentNumbers1);
        System.out.printf("Different numbers: %b%n", differentNumbers2);
        System.out.printf("Different numbers: %b%n", differentNumbers3);

        String name1 = "Fulano";
        String name2 = "Beltrano";

        boolean equalNames = name1 == name2;

        System.out.printf("Equal names: %s%n", equalNames);
    }
}