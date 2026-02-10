package Test;

public class Student_Management_System {
    public static void main(String[] args) {
        Student S = new Student("Bob", 101,"A");
        System.out.println(S.name + " " + S.rollNo + " " + S.section);

//        Student S2 = new Student("Alice", 30, "C");
//        System.out.println(S2.name + " " + S2.rollNo + " " + S2.section);

    }
}

class Student {
    String name;
    int rollNo;
    String section;
    Student(String name, int rollNo, String section) {
        this.name = name;
        this.rollNo = rollNo;
        this.section = section;
    }
}
