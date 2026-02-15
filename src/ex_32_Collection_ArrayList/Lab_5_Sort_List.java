package ex_32_Collection_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab_5_Sort_List {
    public static void main(String[] args) {

        List marks = new ArrayList();
        marks.add(78);
        marks.add(26);
        marks.add(34);
        marks.add(89);

        System.out.println(marks);

        Collections.sort(marks);
        System.out.println(marks);

        Collections.sort(marks, Collections.reverseOrder());
        System.out.println(marks);
    }
}
