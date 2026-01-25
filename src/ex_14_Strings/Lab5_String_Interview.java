package ex_14_Strings;

public class Lab5_String_Interview {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";

        String str3 = new String("Hello");
        String str4 = new String("Hello");
        String str5 = new String("hello");

        //System.out.println(str1 == str3);
        //System.out.println(str1 == str4);
        //System.out.println(str2 == str5);
        //System.out.println(str1 == str2);

        System.out.println(str1.equals(str3));
        System.out.println(str3.equals(str4));
        System.out.println(str3.equalsIgnoreCase(str5));
        System.out.println(str3.equals(str5));
    }
}
