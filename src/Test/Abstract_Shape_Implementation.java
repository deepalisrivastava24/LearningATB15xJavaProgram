package Test;

public class Abstract_Shape_Implementation {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 3);
        System.out.println("Rectangle Area:" + rectangle.getArea());

        Circle circle = new Circle(4);
        System.out.println("Circle Area:" + circle.getArea() );
    }
}

abstract class Shape{
    abstract double getArea();
}

class Rectangle extends Shape {
    private double lenght;
    private double width;

    public Rectangle(double length, double width) {
        this.lenght = length;
        this.width = width;
    }

    @Override
    double getArea() {
    return lenght * width;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
}


