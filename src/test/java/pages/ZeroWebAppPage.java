package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ZeroWebAppPage {

    public ZeroWebAppPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(id="signin_button")
    public WebElement signinBotun;

    @FindBy(id = "user_login")
    public WebElement username;

    @FindBy(id="user_password")
    public WebElement password;

    @FindBy(xpath = "//input[@name='submit']")
    public WebElement submitButon;

    @FindBy(xpath = "//strong[text()='Online Banking']")
    public WebElement onlineBnaking;

    @FindBy(xpath= "//span[@id='pay_bills_link']")
    public WebElement paybill;

    @FindBy(xpath = "//a[text()='Purchase Foreign Currency']")
    public WebElement purchaseFC;

    @FindBy(id = "pc_currency")
    public WebElement currencyDrop;






    }




