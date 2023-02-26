package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import pages.loginpage;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class LoginStepDefinition {
    WebDriver driver;

    @Given("^: User Is Already On Login Page$")
    public void _user_is_already_on_login_page() throws Throwable {
        driver=new ChromeDriver();
        String url=utils.CommonUtils.GetUrl("C:src/test/resources/login.properties");
        driver.get(url);
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
       // driver.findElement(By.xpath("/html/body/form/div[3]/input[1]")).sendKeys("tester");
       // driver.findElement(By.xpath("/html/body/form/div[3]/input[2]")).sendKeys("test");
        // Thread.sleep(2000);
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
