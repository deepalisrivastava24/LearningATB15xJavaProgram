package Test;

public class Employee_Encapsulation {

    public static void main(String[] args) {
        Employee Emp = new Employee(1, "John Doe", 50000);
        System.out.println(Emp.getId());
        System.out.println(Emp.getName());
        System.out.println(Emp.getSalary());
    }
}

class Employee{
    private int id;
    private String name;
    private int salary;

    public int getId() {
        return id;
    }

//    public void setId(int id) {
//        this.id = id;
//    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public int getSalary() {
        return salary;
    }

//    public void setSalary(int salary) {
//        this.salary = salary;
//    }

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}
