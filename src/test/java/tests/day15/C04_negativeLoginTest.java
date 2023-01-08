package tests.day15;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualtyDemyPage;
import utilities.Driver;

public class C04_negativeLoginTest {

    // 3 test metodu olusturun 1. de yanklis mail 2. de yanlis sifre 3. de yanlis mail ve sifre ile giris yapmayi
    // deneyin ve giris yapilamadigini test edin


    QualtyDemyPage qualtyDemyPage=new QualtyDemyPage();
    @Test
    public void test01yanlismail(){

        Driver.getDriver().get("https://www.qualitydemy.com/");
        qualtyDemyPage.ilkLoginLinki.click();
        qualtyDemyPage.kullaniciEmailKutusu.sendKeys("memo@jjja.com");
        qualtyDemyPage.passwordKutusu.sendKeys("31488081");
        qualtyDemyPage.loginButonu.click();

        Assert.assertTrue(qualtyDemyPage.myCoursesLinki.isDisplayed());

        Driver.closeDriver();

        

    }
}
