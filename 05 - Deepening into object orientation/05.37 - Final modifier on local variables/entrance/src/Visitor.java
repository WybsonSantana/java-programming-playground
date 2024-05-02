public class Visitor {
    static final int MINIMUM_AGE_FOR_UNRESTRICTED_ACCESS = 18;

    String name;
    int age;

    boolean hasAgeRestrictedAccess() {
        return age < MINIMUM_AGE_FOR_UNRESTRICTED_ACCESS;
    }
}
