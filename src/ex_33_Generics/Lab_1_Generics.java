package ex_33_Generics;

public class Lab_1_Generics {

    public static void main(String[] args) {
        Number_Sum(5,8);
        Number_Sum("Deepali", "Srivastava");

    }

//    static void Number_Sum(Integer a, Integer b) {
//        int Sum = a +b;
//        System.out.println("Sum: " + Sum);
//    }
//
//    static void Number_Sum(String a, String b) {
//        System.out.println("Sum: " + a + b);
//    }

    static <T> T Number_Sum(T a, T b) {
        System.out.println("Sum: " + a + b);
        return null;
    }
}
