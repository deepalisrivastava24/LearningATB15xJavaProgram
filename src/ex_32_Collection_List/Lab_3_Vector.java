package ex_32_Collection_List;

import java.util.Vector;

public class Lab_3_Vector {
    public static void main(String[] args) {

        Vector v = new Vector(); //vector is a legacy class which is thread safe
        v.add(1);
        v.add("deepali");
        v.add("srivastava");
        System.out.println(v);
        System.out.println("-------------------");
        System.out.println(v.capacity());
        System.out.println("-------------------");
        System.out.println(v.size());
        System.out.println(v.isEmpty());
        System.out.println(v.contains(1));
        System.out.println("-------------------");
        v.remove(0);
        System.out.println(v);



    }
}
