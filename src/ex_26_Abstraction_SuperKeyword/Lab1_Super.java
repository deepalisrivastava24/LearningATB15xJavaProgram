package ex_26_Abstraction_SuperKeyword;

public class Lab1_Super {
}

class BaseClass{

    private String browser;

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

        BaseClass(){
        System.out.println("DC- Parent");
    }

    BaseClass(String browser){
        this.browser = browser;
        System.out.println("DC- Parent");
    }

    void OpenBrowser(String browser){
        System.out.println("Open Browser");
    }

    void CloseBrowser(){
        System.out.println("Close Browser");
    }
}

class TestCase extends BaseClass{

    TestCase() {
        //super("Chrome");
        super();
        super.OpenBrowser("chrome");
        super.CloseBrowser();
        System.out.println(super.getBrowser());
        super.setBrowser("firefox");
    }

    void Test(){}
}