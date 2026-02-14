package ex_31_Enum;

public class Lab_1_Enum {
    public static void main(String[] args) {
        Day today = Day.SUNDAY;
        System.out.println(today);
        System.out.println(today.name());
        System.out.println(today.ordinal());
    }
}
