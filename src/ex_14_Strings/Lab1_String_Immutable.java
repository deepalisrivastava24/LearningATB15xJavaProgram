package ex_14_Strings;

import java.util.Scanner;

public class Lab1_String_Immutable {
    public static void main(String[] args) {
        String name ="Deepali";
        boolean result = name.contains("s");
        System.out.println(result);

        name = name.toUpperCase();
        System.out.println(name);
    }
}
