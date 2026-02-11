package ex_30_Exceptions;

public class Lab_4_Handle_Exception {
    public static void main(String[] args) {
        int a = 0;
        try {
            a = 100/0;
        } catch (Exception e) {

            System.out.println(e.getMessage());
            //System.out.println("Divide by zero not allowed");
        }
        System.out.println(a);
    }
}
