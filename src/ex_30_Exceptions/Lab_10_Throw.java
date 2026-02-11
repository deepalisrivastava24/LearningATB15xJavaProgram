package ex_30_Exceptions;

import java.util.Scanner;

public class Lab_10_Throw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age:");
        int age = scanner.nextInt();
        try {
            ValidateAge(age);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    static  void ValidateAge(int age) throws Exception {
        if(age<18){
            throw new Exception("you are a minor, Not allow to visit Goa !!");
            //System.out.println("Not allow to visit Goa");
        }else{
            System.out.println("You can go Goa !!");
        }
    }
}


