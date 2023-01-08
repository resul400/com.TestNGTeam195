package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class QualtyDemyPage {

   public QualtyDemyPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

 @FindBy(linkText = "Log in")
 public WebElement ilkLoginLinki;

 @FindBy(id = "login-email")
 public WebElement kullaniciEmailKutusu;

 @FindBy(xpath = "//*[text()='Accept']")
 public WebElement cookiesAccept;

 @FindBy(id = "login-password")
 public WebElement passwordKutusu;

 @FindBy(id = "sign_up")
 public WebElement loginButonu;

 @FindBy(linkText = "My courses")
 public WebElement myCoursesLinki;

}
