public class NumberUtil {
    static int getHighestNumber(int x, int y) {
        return x > y ? x : y;
    }

    static int getHighestNumber(int x, int y, int z) {
        return getHighestNumber(getHighestNumber(x, y), z);
    }

    static double getHighestNumber(double x, double y) {
        return x > y ? x : y;
    }

    static double getHighestNumber(double x, double y, double z) {
        return getHighestNumber(getHighestNumber(x, y), z);
    }
}
