public class ByteAndShortExample {
    public static void main(String[] args) {
        byte age = 127; // Max supported value
        //byte identifier = 128; // Doesn't compile

        short stockQuantity = 32767; // Max value
        //short orderQuantity = 32768; // Doesn't compile

        System.out.println("Age: " + age);
        System.out.println("Stock quantity: " + stockQuantity);
    }
}
