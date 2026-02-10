package ex_29_Collection_Framework;

public class Lab_2_Generics {
    public static void main(String[] args) {

           temp_sum(10, 20);
           temp_sum("orange", "pear");
    }

    static <T> void temp_sum(T a, T b){
        System.out.println(a);
        System.out.println(b);

    }



    }

