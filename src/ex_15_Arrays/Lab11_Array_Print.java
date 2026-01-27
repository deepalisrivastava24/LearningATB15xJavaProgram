package ex_15_Arrays;

public class Lab11_Array_Print {
    public static void main(String[] args) {
        int[] marks1 = {78, 100,95, 89,92};

        for (int number : marks1) {
            System.out.println(number);
        }
        System.out.println("=========");

        for (int i = 0; i < marks1.length; i++){
            System.out.println(marks1[i]);

        }

    }
}
