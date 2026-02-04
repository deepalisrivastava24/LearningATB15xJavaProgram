package ex_27_Abstraction;

public class Lab_4_Multiple_Inheritance {
    public static void main(String[] args) {
        Child C1 = new Child();
        C1.Money();
    }
}

class Child implements F1, F2{
    @Override
    public void Money() {
        System.out.println("Child Money");
    }
}


interface F1{
    void Money();
}

interface F2{
    void Money();
}
