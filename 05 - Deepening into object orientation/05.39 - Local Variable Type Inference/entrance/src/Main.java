public class Main {
    public static void main(String[] args) {
        var newVisitor = new Visitor();
        newVisitor.name = "Mary Doe";
        newVisitor.age = 16;

        var entranceRegistration = new EntranceRegistration();
        //entranceRegistration.register(newVisitor);
        //int visitorId = entranceRegistration.register(newVisitor, 10);
        var visitorId = entranceRegistration.register(newVisitor, 10);
    }
}