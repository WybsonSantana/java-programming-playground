public class Main {
    public static void main(String[] args) {
        Visitor newVisitor = new Visitor();
        newVisitor.name = "Mary Doe";
        newVisitor.age = 16;

        if (newVisitor.hasAgeRestrictedAccess()) {
            System.out.printf("Access not permitted for minors under %d!%n", Visitor.MINIMUM_AGE_FOR_UNRESTRICTED_ACCESS);
        } else {
            System.out.println("Access released!");
        }
    }
}