package ex_17_Constructor;

public class Lab2_Car {
    public static void main(String[] args){
        Car C1 = new Car();
        System.out.println(C1.name + " " +  C1.color + " " + C1.model);

        Car C2 = new Car("XUV");
        System.out.println(C2.name);

        Car C3 = new Car("Tesla", "Red");
        System.out.println(C3.name + " " + C3.color);

        Car C4 = new Car("BMW", "Black", "M5");
        System.out.println(C4.name + " " + C4.color + " " + C4.model);
    }

}

class Car{
    String name;
    String color;
    String model;

    Car(){
        name = "Default";
        color = "Red";
        model = "xyz";
    }

    Car(String nameGiven){
        this.name = nameGiven;
    }

    Car(String nameGiven, String colorGiven){
        this.name = nameGiven;
        this.color = colorGiven;
    }

    Car(String nameGiven, String colorGiven, String modelGiven){
        this.name = nameGiven;
        this.color = colorGiven;
        this.model = modelGiven;
    }
}
