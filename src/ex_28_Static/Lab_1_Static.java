package ex_28_Static;

public class Lab_1_Static {
    public static void main(String[] args) {
        Student student1 = new Student(23);
        Student student2 = new Student(33);

        System.out.println(student1.student_age);
        System.out.println(student2.student_age);


        System.out.println(Student.student_course);

    }
}

class Student{
    int student_age;
    static String student_course = "Java Automation";

    public Student(int a){
        this.student_age = a;
    }

    static void M1(){
        System.out.println("Static method");
    }
}
