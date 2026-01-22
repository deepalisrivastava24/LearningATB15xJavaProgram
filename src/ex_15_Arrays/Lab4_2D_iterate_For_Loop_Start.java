package ex_15_Arrays;

public class Lab4_2D_iterate_For_Loop_Start {
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print("*" + " | ");
            }
            System.out.println();
        }
    }
}
