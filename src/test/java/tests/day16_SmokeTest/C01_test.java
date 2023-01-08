package tests.day16_SmokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualtyDemyPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class C01_test {

    @Test
    public void test01(){

        Driver.getDriver().get(ConfigReader.getProperty("qdURL"));
        QualtyDemyPage qualtyDemyPage=new QualtyDemyPage();

        qualtyDemyPage.ilkLoginLinki.click();
        qualtyDemyPage.kullaniciEmailKutusu.sendKeys(ConfigReader.getProperty("qDGecerliUser"));
        qualtyDemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qDGecerliPassword"));
        qualtyDemyPage.cookiesAccept.click();
        qualtyDemyPage.loginButonu.click();

        ReusableMethods.bekle(2);

       Assert.assertTrue(qualtyDemyPage.myCoursesLinki.isDisplayed());

        Driver.closeDriver();



    }
}
