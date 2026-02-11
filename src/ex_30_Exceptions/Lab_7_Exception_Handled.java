package ex_30_Exceptions;

public class Lab_7_Exception_Handled {
    public static void main(String[] args) {
        System.out.println("Starting of a Program");
        Integer output = null; //java.lang.ArithmeticException -> divide by zero
        try {
            String input = args[0]; // java.lang.ArrayIndexOutOfBoundsException -> no input
            Integer a = Integer.parseInt(args[0]);// java.lang.NumberFormatException -> input as "Deepali"
            output = 100/a;
        } catch (ArithmeticException | NumberFormatException | ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            //e.printStackTrace();
        }
        System.out.println(output);
        System.out.println("Ending of a Program");

    }
}
