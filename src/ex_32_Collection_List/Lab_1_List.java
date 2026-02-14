package ex_32_Collection_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab_1_List {
    public static void main(String[] args) {
//        List fruits = List.of("Apple", "Pear", "Orange", "Watermelon");
//        System.out.println(fruits);

        List arrayList = new ArrayList();
        arrayList.add("Apple");
        arrayList.add("Cherry");
        arrayList.add(123);
        arrayList.add(123);
        arrayList.add(7);
        arrayList.add(true);

        System.out.println(arrayList);
        System.out.println(arrayList.size());
        System.out.println(arrayList.isEmpty());
        System.out.println(arrayList.contains("Apple"));
        System.out.println(arrayList.contains(7));
        System.out.println(arrayList.indexOf(123));
        System.out.println(arrayList.lastIndexOf(123));

        System.out.println("--------");
        //Print array List

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        System.out.println("--------");
        //Print array List
        for (Object o : arrayList) {
            System.out.println(o);
        }

        System.out.println("--------");
        //Print array List
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }



    }
}
