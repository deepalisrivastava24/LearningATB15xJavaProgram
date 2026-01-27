package ex_15_Arrays;

public class Lab12_Array_Max_Min {
    public static void main(String[] args) {
       int[] numbers = {14, 25, 56, 34, 76, 89, 9};

       int max = numbers[0];
       for (int i = 0; i < numbers.length; i++){
           if  (numbers[i] > max){
               max = numbers[i];
           }
       }
        System.out.println(max);

        System.out.println("=======");

       int min = numbers[0];
       for (int i = 0; i < numbers.length; i++){
           if (numbers[i] < min){
               min = numbers[i];
           }
       }
       System.out.println(min);
    }
}
