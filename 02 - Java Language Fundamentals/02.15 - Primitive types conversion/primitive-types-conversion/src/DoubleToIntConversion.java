public class DoubleToIntConversion {
    public static void main(String[] args) {
        double length = 129.95;

        //int width = length; // Doesn't compile
        int width = (int) length;

        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
    }
}
