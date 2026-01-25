package ex_14_Strings;

import java.util.Scanner;

public class Lab7_Palidrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("****Enter a string****");
        String str1 = scanner.next();

        String reversed_string= "";
        for(int i = str1.length()-1; i >= 0 ; i--){
            //System.out.println(str1.charAt(i));
            reversed_string = reversed_string + str1.charAt(i);
        }
        System.out.println(reversed_string);

        if (reversed_string.equalsIgnoreCase(str1)) {
            System.out.println("PALINDROME");
        }
        else {
            System.out.println("NOT PALINDROME");
        }


    }
}
