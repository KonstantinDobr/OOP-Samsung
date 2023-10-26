public class Main {
    public static void main(String[] args) {
        Person person = new Person("Kostya", 15);
        person.birthday();
        person.printInfo();

        Student student = new Student("Konstantin", 17, "DGTU");
        student.birthday();
        student.printInfo();
    }
}