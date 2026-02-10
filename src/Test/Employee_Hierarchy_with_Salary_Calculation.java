package Test;

public class Employee_Hierarchy_with_Salary_Calculation {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.Salary1(60000, 10000);

        Developer developer = new Developer();
        developer.Salary2(50,160);

    }
}

class Employee1{
    void Salary(){
        System.out.println("Salary calculation");
    }
}

class Manager extends Employee1{
    void Salary1(double baseSalary, double bonus){
        double Manage_Salary = baseSalary + bonus;
        System.out.println("Manager Salary :" + Manage_Salary);
    }
}

class Developer extends Employee1{
    void Salary2(double hourlyRate, double hours){
        double Developer_Salary = hourlyRate * hours;
        System.out.println("Developer Salary :" +  Developer_Salary);
    }
}
