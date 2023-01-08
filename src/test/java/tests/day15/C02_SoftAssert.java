package tests.day15;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.ZeroWebAppPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.*;

public class C02_SoftAssert {

    @Test
    public void test01(){

        /*

        1. “http://zero.webappsecurity.com/” Adresine gidin
 2. Sign in butonuna basin
 3. Login kutusuna “username” yazin
 4. Password kutusuna “password” yazin
 5. Sign in tusuna basin
 6. Online banking menusu icinde Pay Bills sayfasina gidin
 7. “Purchase Foreign Currency” tusuna basin
 8. “Currency” drop down menusunden Eurozone’u secin
 9. soft assert kullanarak “Eurozone (euro)” secildigini test edin
 10. soft assert kullanarak DropDown listesinin su secenekleri oldugunu test edin “Select One”,
 “Australia (dollar)“, “Canada (dollar)“,”Switzerland (franc)“,”China (yuan)“,”Denmark (krone)“,
 ”Eurozone (euro)“,”Great Britain (pound)“,”Hong Kong (dollar)“,”Japan (yen)“,”Mexico (peso)“,”Norway (krone)“
 ,”New Zealand (dollar)“,”Sweden (krona)“,”Singapore (dollar)“,”Thailand (baht)”
         */

        Driver.getDriver().get("http://zero.webappsecurity.com/");

        ZeroWebAppPage zeroWebAppPage=new ZeroWebAppPage();

        zeroWebAppPage.signinBotun.click();
        zeroWebAppPage.username.sendKeys("username");
        zeroWebAppPage.password.sendKeys("password");
        zeroWebAppPage.submitButon.click();
        Driver.getDriver().navigate().back();
        zeroWebAppPage.onlineBnaking.click();
        zeroWebAppPage.paybill.click();
        zeroWebAppPage.purchaseFC.click();
        Select select= new Select(zeroWebAppPage.currencyDrop);
        select.selectByVisibleText("Eurozone (euro)");

        SoftAssert softAssert=new SoftAssert();
        String actualDrop=select.getFirstSelectedOption().getText();
        String expectedDrop="Eurozone (euro)";
        softAssert.assertEquals(actualDrop,expectedDrop,"Para");

        List<WebElement> optionElementList= select.getOptions();
        List<String> actualOptionList=new ArrayList<>();

        for (WebElement each: optionElementList
             ) {
            actualOptionList.add(each.getText());
        }
        String[] arr={"“Select One”,\n" +
                " “Australia (dollar)“, “Canada (dollar)“,”Switzerland (franc)“,”China (yuan)“,”Denmark (krone)“,\n" +
                " ”Eurozone (euro)“,”Great Britain (pound)“,”Hong Kong (dollar)“,”Japan (yen)“,”Mexico (peso)“,”Norway (krone)“\n" +
                " ,”New Zealand (dollar)“,”Sweden (krona)“,”Singapore (dollar)“,”Thailand (baht)"};
        List<String> expectedOption= Arrays.asList();

        Collections.sort(actualOptionList);
        Collections.sort(expectedOption);

        softAssert.assertEquals(actualDrop,expectedDrop);






        ReusableMethods.bekle(3);
        softAssert.assertAll();
        Driver.closeDriver();


    }

}
