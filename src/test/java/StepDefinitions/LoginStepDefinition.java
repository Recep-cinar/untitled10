package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.loginpage;

public class LoginStepDefinition {
   public static WebDriver driver;

    @Given("^: User Is Already On Login Page$")
    public void _user_is_already_on_login_page() throws Throwable {

        utils.CommonUtils.GetScreenshot(driver,"LoginPage");
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

}
