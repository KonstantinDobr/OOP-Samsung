public class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        if (0 < age && age < 200) {
            this.age = age;
        } else {
            this.age = 0;
        }
        this.name = name;
    }

    public void printInfo() {
        System.out.println("Name : " + this.name);
        System.out.println("Age : " + this.age);
    }

    public int birthday() {
        ++this.age;
        return this.age;
    }
}
