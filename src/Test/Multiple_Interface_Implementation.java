package Test;

public class Multiple_Interface_Implementation {
    public static void main(String[] args) {
        Duck duck1 = new Duck();
        duck1.fly();
        duck1.swim();
    }
}

interface Flyable{
    void fly();
}

interface Swimmable{
    void swim();
}

class Duck  implements Flyable,Swimmable{

    @Override
    public void fly() {
        System.out.println("Duck is flying in the sky!");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming in the water!");

    }
}
