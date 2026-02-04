package ex_27_Abstraction;

public class Lab_3_Interface_P1 {
    public static void main(String[] args) {
        Car1 car1 = new Car1();
        car1.startEngines();
        car1.applyBreaks();
        car1.concreteTestEngine();
        Engines.staticTestEngine();
        car1.stopEngines();
    }
}

class Car1 implements Breaks, Engines{

    @Override
    public void applyBreaks() {
        System.out.println("Applying Breaks");
    }

    @Override
    public void startEngines() {
        System.out.println("Starting Engines");

    }

    @Override
    public void stopEngines() {
        System.out.println("Stopping Engines");
    }
}

interface Breaks{
    void applyBreaks();
}

interface Engines{
    void startEngines();
    void stopEngines();

    default void concreteTestEngine(){
        System.out.println("Concrete TestEngine");
    }

    static void staticTestEngine(){
        System.out.println("Static TestEngine" );
    }


}
