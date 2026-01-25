package ex_14_Strings;

import java.util.Scanner;

public class Lab6_Reverse_String {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        if (str == null || str.length()<=1) {
            System.out.println(str);
        }
        String reverse = "";
        for (int i = str.length()-1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        System.out.println(reverse);
    }
}
