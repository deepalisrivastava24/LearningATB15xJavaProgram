package ex_30_Exceptions;

public class Lab_6_Try_IQ {
    public static void main(String[] args) {
        try {
            String str = null;
            int a= 10/0;
        } catch (NumberFormatException | ArithmeticException e) {
            System.out.println("null error or Arithmetic error" );
        }
        System.out.println("End");
    }
}
