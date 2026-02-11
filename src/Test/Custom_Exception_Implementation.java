package Test;

public class Custom_Exception_Implementation {
    public static void main(String[] args) {
        Agecheck checker = new Agecheck();
        try {
            checker.validateAge(15);
        }catch (Exception e){
            System.out.println(e);
        }
        try{
            checker.validateAge(25);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {

        super(message);
    }
}

class Agecheck{
    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above. Provided age: " + age);
        }
        System.out.println("Age is valid:" + age);
    }
}






