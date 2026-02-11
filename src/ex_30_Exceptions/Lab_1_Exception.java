package ex_30_Exceptions;

public class Lab_1_Exception {
    public static void main(String[] args) {
        System.out.println("Starting of a Program");
        String input = args[0]; // java.lang.ArrayIndexOutOfBoundsException -> no input
        Integer a = Integer.parseInt(args[0]);// java.lang.NumberFormatException -> input as "Deepali"
        Integer output = 100/a; //java.lang.ArithmeticException -> divide by zero
        System.out.println(output);
        System.out.println("Ending of a Program");

    }
}
