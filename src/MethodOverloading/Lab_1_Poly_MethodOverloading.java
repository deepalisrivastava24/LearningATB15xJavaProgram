package MethodOverloading;

public class Lab_1_Poly_MethodOverloading {
    public static void main(String[] args) {
        MathOperator M1 = new MathOperator();
       int m1 =  M1.add(1, 2);
        System.out.println(m1);

        int m2 = M1.add(1, 2, 2);
        System.out.println(m2);

        double m3 = M1.add(4.6, 7.8, 9.6);
        System.out.println(m3);

        String m4 = M1.add("Deepali", "Srivastava");
        System.out.println(m4);

    }

}

class MathOperator{
    int add (int a, int b){
        return a+b;
    }

    int add (int a, int b, int c){
        return a+b+c;
    }

    double add (double a, double b, double c){
        return a+b+c;
    }

    String add (String a, String b){
        return a+b;
    }


}
