package ex_27_Abstraction;

public class Lab_5_Interface_Variable {
    public static void main(String[] args) {
        Srivastava srivastava = new Srivastava();
        srivastava.display();
        int P = srivastava.aa;
        System.out.println("P = " + P);

        Kuhoo  kuhoo = new Kuhoo();
        kuhoo.display();
            }

}


interface Deepali{
    final int a = 10;
    String notes = "Java";
    void display();

}

class Srivastava implements Deepali{

    int aa = 110;
    @Override
    public void display() {
        System.out.println(a);
        System.out.println(this.aa);
    }
}

class Kuhoo implements Deepali{

    @Override
    public void display() {
        System.out.println(notes);
    }
}
