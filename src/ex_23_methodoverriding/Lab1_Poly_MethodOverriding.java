package ex_23_methodoverriding;

public class Lab1_Poly_MethodOverriding {
    public static void main(String[] args) {
        father f1 = new father();
        child ch1 = new child();
        f1.home();
        ch1.home();
        father f2 = new child(); //dynamic dispatch
        f2.home();
    }
}

class father{
    void home(){
        System.out.println("2BHK");
    }
}

class child extends father{
    @Override
    void home(){
        System.out.println("3BHK");
    }
}