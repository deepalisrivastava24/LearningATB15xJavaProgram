package ex_28_Static;

public class Lab_2_Static_Block {
    public static void main(String[] args) {
        A a =  new A();
        System.out.println(A.aa);
        A.m1();
    }
}


class A {
    static{
        System.out.println("Called only once when class is loaded");
        System.out.println("excel, file, database sql file");
    }
    {
        System.out.println("***Instance Initiation Block ***");
    }

    static int aa = 10;

    static void m1(){
        System.out.println("Static function");
    }
}
