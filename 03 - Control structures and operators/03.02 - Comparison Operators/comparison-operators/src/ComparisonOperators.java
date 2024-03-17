public class ComparisonOperators {
    public static void main(String[] args) {
        int productsTotalWeight = 900;
        int truckLoadLimit = 1000;

        boolean exceededLoad = productsTotalWeight > truckLoadLimit;

        System.out.printf("Exceeded load: %b%n", exceededLoad);

        boolean releasedLoad1 = productsTotalWeight < truckLoadLimit;
        boolean releasedLoad2 = productsTotalWeight <= truckLoadLimit;
        boolean releasedLoad3 = truckLoadLimit > productsTotalWeight;
        boolean releasedLoad4 = truckLoadLimit >= productsTotalWeight;

        System.out.printf("Released load: %b%n", releasedLoad1);
        System.out.printf("Released load: %b%n", releasedLoad2);
        System.out.printf("Released load: %b%n", releasedLoad3);
        System.out.printf("Released load: %b%n", releasedLoad4);
    }
}