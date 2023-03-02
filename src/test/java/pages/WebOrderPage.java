package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.Map;

public class WebOrderPage {
     WebDriver driver;

    public WebOrderPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id=\"ctl00_MainContent_fmwOrder_ddlProduct\"]")
    public WebElement dropdown;

    @FindBy(xpath = "//*[@id=\"ctl00_MainContent_fmwOrder_txtQuantity\"]")
    public WebElement quantity;

    @FindBy(xpath = "//*[@id=\"ctl00_MainContent_fmwOrder_txtName\"]")
    public WebElement CostumerName;

    @FindBy(xpath = "//*[@id=\"ctl00_MainContent_fmwOrder_TextBox2\"]")
    public WebElement Street;
    @FindBy(xpath = "//*[@id=\"ctl00_MainContent_fmwOrder_TextBox3\"]")
    public WebElement City;
    @FindBy(xpath = "//*[@id=\"ctl00_MainContent_fmwOrder_TextBox4\"]")
    public WebElement State;
    @FindBy(xpath = "//*[@id=\"ctl00_MainContent_fmwOrder_TextBox5\"]")
    public WebElement Zip;
    @FindBy(xpath = "//*[@id=\"ctl00_MainContent_fmwOrder_cardList_0\"]")
    public WebElement Card;
    @FindBy(xpath = "//*[@id=\"ctl00_MainContent_fmwOrder_TextBox6\"]")
    public WebElement Cardno;
    @FindBy(xpath = "//*[@id=\"ctl00_MainContent_fmwOrder_TextBox1\"]")
    public WebElement expiredate;


    public void productinfo(Map<String ,String> dataTable){
        Select select=new Select(dropdown);
        select.selectByVisibleText(dataTable.get("Product"));
        quantity.sendKeys(dataTable.get("Quantity"));
    }
    public void adressinfo(Map<String ,String> dataTable){

        CostumerName.sendKeys(dataTable.get("Customer Name"));
        Street.sendKeys(dataTable.get("Street"));
        City.sendKeys(dataTable.get("City"));
        State.sendKeys(dataTable.get("State"));
        Zip.sendKeys(dataTable.get("Zip"));
    }
    public void paymentinfo(Map<String ,String> dataTable){
        Card.click();
        Cardno.sendKeys(dataTable.get("Card Nr"));
        expiredate.sendKeys(dataTable.get("Expire date"));
    }


}
