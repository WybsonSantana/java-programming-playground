public class Main {
    public static void main(String[] args) {
        Visitor newVisitor = new Visitor();
        newVisitor.name = "Mary Doe";
        newVisitor.age = 16;

        EntranceRegistration entranceRegistration = new EntranceRegistration();
        entranceRegistration.register(newVisitor, 10);
    }
}