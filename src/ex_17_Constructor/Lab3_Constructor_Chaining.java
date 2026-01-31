package ex_17_Constructor;

public class Lab3_Constructor_Chaining {
    public static void main(String[] args) {
        LoginPage L1 = new LoginPage("deeu@gmail.com", "12345");
        System.out.println(L1.email + " " + L1.password);
        LoginPage L2 = new LoginPage("kuhoo@yahoo.com", "789", "click");
        System.out.println(L2.email + " " + L2.password + " " + L2.PasswordButton);
    }

}

class LoginPage{
    String email;
    String password;
    String PasswordButton;

    public LoginPage(String emailGiven, String passwordGiven) {
        this.email = emailGiven;
        this.password = passwordGiven;
    }

    public LoginPage(String emailGiven, String passwordGiven, String Button) {
        this(emailGiven, passwordGiven);
        PasswordButton = Button;
    }








    }
