package ex_35_Collections_Stack;

import java.util.Stack;

public class Lab_1_Stack {
    public static void main(String[] args) {
        Stack <String> s1 = new Stack <> ();
        s1.add("pen");
        s1.add("pencil");
        s1.add("erasor");

        System.out.println(s1);

        s1.add(1, "sharpner");
        System.out.println("=============================================");
        System.out.println(s1);
        System.out.println("=============================================");

        System.out.println(s1.peek());

        s1.pop();
        System.out.println("=============================================");
        System.out.println(s1);

        s1.add("inkpot");
        s1.add("inkpot");
        s1.push("scale");

        System.out.println("=============================================");
        System.out.println(s1);





    }
}
