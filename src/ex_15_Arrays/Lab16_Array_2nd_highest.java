package ex_15_Arrays;

public class Lab16_Array_2nd_highest {
    public static void main(String[] args) {
        int[] numbers = {12, 34, 10, 1, 100, 45, 4, 32};
        int second_highest = 0;
        int highest = 0;


        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > highest) {
                second_highest = highest;
                highest = numbers[i];
            } else if (numbers[i] > second_highest && numbers[i] != highest) {
                second_highest = numbers[i];

            }


        }
        System.out.println(second_highest);


    }
}
