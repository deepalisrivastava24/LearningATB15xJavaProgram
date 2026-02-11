package ex_30_Exceptions;

public class Lab_5_Multiple_Catch {
    public static void main(String[] args) {
        int a = 0;
        try {
            a= 10/0;
        } catch (ArithmeticException e) {
            System.out.println("Are you a fool");
        } catch (Exception e){
            System.out.println("Are you a fool too");
        }
        System.out.println("a="+a);

    }
}
