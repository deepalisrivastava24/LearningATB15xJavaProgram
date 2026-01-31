package ex_17_Constructor;

public class Lab1_Constructor {
    public static void main(String[] args) {

        Baby B1 = new Baby();
        Baby B2 = new Baby("deepu", 2);
        Baby B3 = new Baby("kuhoo");

    }
}

class Baby{

    String name;
    int age;

    Baby(){
        System.out.println("Default Baby Constructor");

    }

    Baby(String name){
        System.out.println("Parameterized Baby Constructor with name -> " + name);
    }

    Baby(String name, int age){
        System.out.println("Parameterized Baby Constructor with name and age -> " + name + " " +age);
    }

}
