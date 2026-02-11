package ex_30_Exceptions;

import java.util.Scanner;

public class Lab_8_TryCatch_Finally {
    public static void main(String[] args) {
        Scanner scanner= null;
        scanner= new Scanner(System.in);
        System.out.println("Enter the value of v");
        int v= scanner.nextInt();
        int b= 0;
        try {
            b = 10/v;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
            System.out.println("I will close scanner");
        }
        System.out.println(b);



    }
}
