package Test;

public class Calculator_Method_Overloading {

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.Add(5,3);
        cal.Add(2.5, 3.7);
        cal.Add(1,2,3);

    }

    static class Calculator{
        void Add(int a, int b){
            int sum = a+b;
            System.out.println("Integer addition:" + sum);
        }

        void Add(int a, int b, int c){
            int sum = a+b+c;
            System.out.println("Three integers addition:" + sum);
        }

        void Add(double a, double b){
            double sum = a+b;
            System.out.println("Double addition:" + sum);
        }
    }
}
