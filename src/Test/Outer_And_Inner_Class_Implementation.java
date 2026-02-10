package Test;

public class Outer_And_Inner_Class_Implementation {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.showInteraction();
    }
}

class Outer {
    int x = 10;

    // Define the Inner class
    class Inner {
        void display() {

            System.out.println("Inner class accessing outer variable: " + x);
        }
    }

    void showInteraction() {
        System.out.println("Outer class variable x: " + x);

        Inner inner = new Inner();
        inner.display();
    }
}
