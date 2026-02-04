package ex_27_Abstraction;

public class Lab_2_Abstraction {

    public static void main(String[] args) {
        Alto A1 = new Alto();
        A1.StartCar();
        System.out.println("Driving a car");
        A1.StopCar();
    }
}


abstract class Car{
    abstract void StartCar();
    abstract void StopCar();
}

class Alto  extends Car{
    @Override
    void StartCar() {
        System.out.println("Start Alto car");
    }

    @Override
    void StopCar() {
        System.out.println("Stop Alto car");
    }
}