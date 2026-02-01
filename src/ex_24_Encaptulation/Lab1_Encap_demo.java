package ex_24_Encaptulation;

public class Lab1_Encap_demo {
    public static void main(String[] args) {
        Login login = new Login("admin","12345");
        System.out.println(login.password);
        login.password = "67890";
        System.out.println(login.password);

        GoodLogin glogin = new GoodLogin("admin","666");

        System.out.println(glogin.getPassword());

    }
}
class Login {
    public String username;
    public String password;

    Login(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
class GoodLogin{
    private String username;
    private String password;

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getUsername() {
        return username;
    }
    //public void setUsername(String username) {
     //   this.username = username;
    //}

    GoodLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }
}