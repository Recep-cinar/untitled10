package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class hooks extends utils.driverutils{

    @Before("@SanityTest")
    public void initialeTest() throws IOException{
        LoginStepDefinition.driver=initialseDriver(LoginStepDefinition.driver,"chrome");
        String url=utils.CommonUtils.GetUrl("src/test/resources/login.properties");
        LoginStepDefinition.driver.get(url);
    }
    @After("@SanityTest")
    public void teardown() throws IOException, InterruptedException {
        Thread.sleep(10000);
        LoginStepDefinition.driver.close();
    }
}
