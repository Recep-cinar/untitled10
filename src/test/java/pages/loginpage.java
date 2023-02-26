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




}
