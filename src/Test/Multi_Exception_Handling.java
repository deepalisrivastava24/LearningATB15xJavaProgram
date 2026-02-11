package Test;

public class Multi_Exception_Handling {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int c = a / b;


        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception : cannot divide by zero");
        }

        try {
            int num = Integer.parseInt("xyz");
        }catch (NumberFormatException e) {
            System.out.println("NumberFormatException : Invalid number format");
        }

        try {

            int[] A = new int[5];
            A[10] = 50;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException : Array index out of bounds");
        }finally {
            System.out.println("Execution completed");
        }
    }
}
