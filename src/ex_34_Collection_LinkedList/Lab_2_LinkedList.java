package ex_34_Collection_LinkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab_2_LinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continueInput = "Y";
        List <String> name = new ArrayList<>();

        while (continueInput.equalsIgnoreCase("Y")) {
            System.out.println("Enter the element you want to add: ");
            String str = sc.next();
            name.add(str);
            sc.nextLine();
            System.out.println("Do you want to add another element: Y/N");
            continueInput = sc.nextLine();

        }
        for(String s: name){
            System.out.println(s);
        }

        sc.close();

    }
}
