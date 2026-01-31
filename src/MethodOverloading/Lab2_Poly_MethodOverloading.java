package MethodOverloading;

public class Lab2_Poly_MethodOverloading {
    public static void main(String[] args) {
        WebAutomation w1 = new WebAutomation();
        w1.OpenBrowser();
        w1.OpenBrowser2("Firefox");
    }
}

class WebAutomation{

    void OpenBrowser(){
        System.out.println("Open Default Browser");
    }

    void OpenBrowser2(String browserName){
        System.out.println("Open Browser" + browserName);
    }
}