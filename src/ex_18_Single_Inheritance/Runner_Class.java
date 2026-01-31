package ex_18_Single_Inheritance;

public class Runner_Class {
    public static void main(String[] args) {

        Son S1 = new Son();
        S1.BHK3();
        S1.BHK2();
        System.out.println(S1.Gold_f);
        
        Father F1 = new Father();
        F1.BHK2();
        System.out.println(F1.Gold_f);

    }
}
