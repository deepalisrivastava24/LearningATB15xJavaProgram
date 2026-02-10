package Test;

public class Method_Overriding_Demo {
    public static void main(String[] args) {
       Parent parent = new Parent();
       Child child = new Child();

       parent.display();
       child.display();
    }
}

class Parent{
    void display(){
        System.out.println("Parent class display method");
    }
}

class Child extends Parent{
    void display(){
        System.out.println("Child class display method");
    }
}
