package ex_20_Multiple_Inheritance;

public class Run_Class {
    public static void main(String[] args) {
        Son s = new Son();
        s.Car();
        s.BHK3();
        s.Car1();
        s.BHK3();
        s.money();
        s.money1();
        System.out.println("==============");

        Father f = new Father();
        f.Car1();
        f.money1();
        f.BHK2();
        f.Car1();
        System.out.println("==============");

        GrandFather gf = new GrandFather();
        gf.BHK2();
        gf.money();
        System.out.println("==============");

        //Dynamic Dispatch
        GrandFather gf2 = new Son();
        gf2.BHK2();
        gf2.money();
        System.out.println("==============");

        Father f1 = new Father();
        f1.BHK2();
        f1.Car1();
        System.out.println("==============");


    }


}
