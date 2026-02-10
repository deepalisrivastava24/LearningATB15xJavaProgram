package Test;

public class Drawable_Interface_Implementation {
    public static void main(String[] args) {
        Circle1 circle1 = new Circle1();
        circle1.draw();

        Rectangle1 rectangle1 = new Rectangle1();
        rectangle1.draw();
    }

}

interface Drawable{
    void draw();
}

class Circle1 implements Drawable{

    @Override
    public void draw() {
        System.out.println("Drawing a Circle");

    }
}

class Rectangle1 implements Drawable{
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}
