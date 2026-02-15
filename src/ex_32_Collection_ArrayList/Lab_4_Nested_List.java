package ex_32_Collection_ArrayList;

import java.util.*;

public class Lab_4_Nested_List {
    public static void main(String[] args) {
        List fruits1 = new ArrayList();

        fruits1.add("Apple");
        fruits1.add("Banana");
        fruits1.add("Pear");
        System.out.println(fruits1);
        System.out.println("-------------");
        List fruits2 = new ArrayList();

        fruits2.add("Watermelon");
        fruits2.add("Banana");
        fruits2.add("Pear");
        System.out.println(fruits2);
        System.out.println("----------------");

        List vegetables = new ArrayList();
        vegetables.add("potatoes");
        vegetables.add("brinjal");
        vegetables.add("chilly");
        System.out.println(vegetables);
        System.out.println("------------");

        List Add_All_Array =  new ArrayList();
        Add_All_Array.add(fruits1);
        Add_All_Array.add(fruits2);
        Add_All_Array.add(vegetables);
        System.out.println(Add_All_Array);
        System.out.println(Add_All_Array.size());
        System.out.println(Add_All_Array.get(1));
    }
}
