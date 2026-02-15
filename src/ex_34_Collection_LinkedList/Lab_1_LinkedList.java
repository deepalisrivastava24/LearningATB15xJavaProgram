package ex_34_Collection_LinkedList;

import java.util.LinkedList;
import java.util.List;

public class Lab_1_LinkedList {
    public static void main(String[] args) {
        //List list = new ArrayList();
        List <String> list1 = new LinkedList <> ();

        list1.add("Apple");
        list1.add("Banana");
        list1.add("Orange");
        list1.addFirst("Watermelon");
        list1.addLast("Pineapple");

        System.out.println(list1);

        System.out.println(list1.getFirst());
        System.out.println(list1.getLast());
        System.out.println(list1.get(2));

        list1.removeFirst();
        list1.removeLast();
        System.out.println(list1);

        System.out.println(list1.size());
        System.out.println(list1.isEmpty());
        System.out.println(list1.contains("Apple"));



    }
}
