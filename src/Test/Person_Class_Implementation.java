package Test;

public class Person_Class_Implementation {
    public static void main(String[] args) {
        Person P = new Person("John", 25);
        System.out.println(P.name + " " + P.age);
        Person P2 = new Person("Alice", 30);
        System.out.println(P2.name + " " + P2.age);

    }

}

class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
