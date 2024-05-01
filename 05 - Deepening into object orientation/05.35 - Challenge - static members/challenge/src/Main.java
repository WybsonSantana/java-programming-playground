public class Main {
    public static void main(String[] args) {
        double squareArea = GeometryAreaCalculator.calculateSquareArea(5.2);
        double circleArea = GeometryAreaCalculator.calculateCircleArea(10.5);

        System.out.printf("Square area: %.2f%n", squareArea);
        System.out.printf("Circle area: %.2f%n", circleArea);
    }
}