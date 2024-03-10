public class DoubleToFloatConversion {
    public static void main(String[] args) {
        double price1 = 17.0;
        float price2 = (float) price1;

        System.out.println("Price 1: " + price1);
        System.out.println("Price 2: " + price2);

        float tax1 = 16.9F;
        double tax2 = tax1;
        double tax3 = (double) tax1; // Casting instruction is optional

        System.out.println("Tax 1: " + tax1);
        System.out.println("Tax 2: " + tax2);
        System.out.println("Tax 3: " + tax3);
    }
}