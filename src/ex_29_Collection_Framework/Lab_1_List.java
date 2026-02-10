package ex_29_Collection_Framework;

import java.util.ArrayList;
import java.util.List;

public class Lab_1_List {

    public static void main(String[] args) {

        List fruits = List.of("Apple","Orange", "Pear","Strawberry");
        System.out.println(fruits);

        List arrayList = new ArrayList();
        arrayList.add("Apple");
        arrayList.add(123);
        arrayList.add(true);
        System.out.println(arrayList);

    }
}
