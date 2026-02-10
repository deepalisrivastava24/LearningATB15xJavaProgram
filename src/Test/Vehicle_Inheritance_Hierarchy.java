package Test;

public class Vehicle_Inheritance_Hierarchy {
    public static void main(String[] args) {
        //Vehicle[] vehicles = {new Car(), new Vehicle()};
        Vehicle[] vehicles = {new Car(), new Bike() };

        for (Vehicle vehicle : vehicles) {
            vehicle.start();
        }
    }
}

class Vehicle{
    void start(){
        System.out.println("Vehicle starting");
    }
}

class Car extends Vehicle{
    @Override
    void start(){
        System.out.println("Car engine starts with a roar!");
    }
}

class Bike extends Vehicle{
    @Override
    void start(){
        System.out.println("Bike engine starts with a purr!");
    }
}