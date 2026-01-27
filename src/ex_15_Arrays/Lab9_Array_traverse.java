package ex_15_Arrays;

public class Lab9_Array_traverse {
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0] = 100;
        marks[1] = 90;
        marks[2] = 99;
        //System.out.println(marks[0]);
        //System.out.println(marks[1]);
        //System.out.println(marks[2]);

        for(int number : marks){
            System.out.println(number);
        }
    }
}
