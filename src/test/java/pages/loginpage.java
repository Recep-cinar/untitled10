package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {

    public static WebDriver driver;

    public loginpage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "ctl00_MainContent_username")
    private WebElement username;

    @FindBy(id = "ctl00_MainContent_password")
    private WebElement password;

    @FindBy(id = "ctl00_MainContent_login_button")
    private WebElement loginbutton;

    @FindBy(xpath="//*[@id=\"ctl00_menu\"]/li[3]/a")
    private WebElement order;

    @FindBy(xpath = "//*[@id=\"ctl00_MainContent_fmwOrder_InsertButton\"]")
    private WebElement process;


    public void SetUsername()throws InterruptedException{
        username.sendKeys("Tester");
        Thread.sleep(2000);
    }

    public void SetPassword()throws InterruptedException{
        password.sendKeys("test");
        Thread.sleep(2000);
    }

    public void SetLoginButton()throws InterruptedException{
        loginbutton.click();
    }

    public void SetClickOrder()throws InterruptedException{
        order.click();
    }
    public void SetComfrimOrder()throws InterruptedException{
        process.click();
    }




}
