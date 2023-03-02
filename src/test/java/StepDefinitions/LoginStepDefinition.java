package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import pages.WebOrderPage;
import pages.loginpage;

import java.util.Map;

public class LoginStepDefinition {
   public static WebDriver driver;
    static Logger log=LogManager.getLogger(LoginStepDefinition.class);


    @Given("^: User Is Already On Login Page$")
    public void _user_is_already_on_login_page() throws Throwable {
        utils.CommonUtils.GetScreenshot(driver,"LoginPage");
        log.info(driver.getTitle());
    }
    @When("^:Title Of Page Is Web Orders Login$")
    public void title_of_page_is_web_orders_login() throws Throwable {
        String title=driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("Web Orders Login",title);
    }

    @Then("^User Enter Username And Password$")
    public void user_enter_username_and_password() throws Throwable {
        loginpage username=new loginpage(driver);
        username.SetUsername();

        loginpage password=new loginpage(driver);
        password.SetPassword();
        utils.CommonUtils.GetScreenshot(driver,"get user info");
    }
    @And("^:User Click On Login Button$")
    public void user_click_on_login_button() throws Throwable {
        loginpage loginbutton=new loginpage(driver);
        loginbutton.SetLoginButton();

    }
    @And("^:User On The Home Page$")
    public void user_on_the_home_page() throws Throwable {
        String title=driver.getTitle();
        System.out.println(title);
    }



    @Given("^:User enter username As \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void user_enter_username_as_something_and_password_as_something(String arg1,String arg2) throws Throwable {
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys(arg1);
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys(arg2);
        Thread.sleep(2000);
        loginpage LoginButton=new loginpage(driver);
        LoginButton.SetLoginButton();
    }
    @When("^:user on order page$")
    public void user_on_order_page() throws Throwable {
        loginpage clickorder=new loginpage(driver);
        clickorder.SetClickOrder();
        Thread.sleep(2000);
    }
    @And("^:user enter product information$")
    public void user_enter_product_information(Map<String,String> datatable) throws Throwable {
        WebOrderPage order=new WebOrderPage(driver);
        order.productinfo(datatable);
    }
    @And("^:User enter address information$")
    public void user_enter_address_information(Map<String,String>datatable) throws Throwable {
        WebOrderPage order=new WebOrderPage(driver);
        order.adressinfo(datatable);
    }

    @And("^:User enter payment information$")
    public void user_enter_payment_information(Map<String,String>datatable) throws Throwable {

        WebOrderPage order=new WebOrderPage(driver);
        order.paymentinfo(datatable);
    }
    @Then("^:order successful$")
    public void order_successful() throws Throwable {
        loginpage process=new loginpage(driver);
        process.SetComfrimOrder();

    }

}

