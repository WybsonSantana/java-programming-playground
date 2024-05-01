public class GeometryAreaCalculator {
    static final double pi = 3.14159265358979323846F;

    public static double calculateSquareArea(double squareSideMeasurement) {
        return squareSideMeasurement * squareSideMeasurement;
    }

    public static double calculateCircleArea(double circleRadius) {
        return circleRadius * circleRadius * GeometryAreaCalculator.pi;
    }

}
