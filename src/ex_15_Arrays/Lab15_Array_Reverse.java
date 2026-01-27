package ex_15_Arrays;

import java.util.Arrays;

public class Lab15_Array_Reverse {
    public static void main(String[] args) {
        String[] array = {"deepali", "kuhoo","cutie","chotasher"};

        int n = array.length;

        for(int i = 0; i < n/2 ; i++){
            String temp = array[i];
            array[i] = array[n-i-1];
            array[n-i-1] = temp;
        }

        for(String s : array){
            System.out.println(s);
        }

    }
}
