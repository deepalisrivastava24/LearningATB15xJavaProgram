package ex_27_Abstraction;

public class Lab_1_Abstraction {
    public static void main(String[] args) {
        Son S1 = new Son();
        S1.loan50K();
        S1.loan10k();
    }
}

abstract class Father{

    abstract void loan50K();
    void loan10k(){
        System.out.println("Loan Given");
    }

}
class Son extends Father{

    @Override
    void loan50K() {
        System.out.println("Given!!");
    }
}
