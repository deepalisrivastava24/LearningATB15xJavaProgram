package ex_15_Arrays;

public class Lab14_Array_Sum {
    public static void main(String[] args) {
        int [] marks = {20, 12, 46};
        int sum = 0;
        for(int i = 0; i < marks.length; i++){
            sum = sum + marks[i];
        }
        System.out.println(sum);
    }
}
