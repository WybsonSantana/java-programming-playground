public class FloatAndDoubleExample {
    public static void main(String[] args) {
        float price = 1_249.90F; // 'F' is required
        //float taxRate = 27.5; // Doesn't compile

        double exchangeRate = 6.99D; // 'D' is optional

        System.out.println("Price: " + price);
        System.out.println("Exchange rate: " + exchangeRate);
    }
}