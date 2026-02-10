package Test;

public class Animal_Sound_Polymorphism {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.MakeSound();

        Cat cat = new Cat();
        cat.MakeSound();
    }

}

class Animal {
    void MakeSound() {
        System.out.println("Animal sound");
    }
}

class Cat extends Animal {
    void MakeSound() {
        System.out.println("Cat says: Meow! Meow!");
    }

}

class Dog extends Animal {
    void MakeSound() {
        System.out.println("Dog says: Woof! Woof!");
    }
}
