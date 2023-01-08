package tests.day15;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualtyDemyPage;
import utilities.Driver;

public class C03_SoftTest2 {

    @Test
    public void test01(){

        /*
        1- https://www.qualitydemy.com/ anasayfasina gidin
        2- login linkine basin
        3- Kullanici email’i olarak valid email girin
        4- Kullanici sifresi olarak valid sifre girin
        5- Login butonuna basarak login olun
        6- Basarili olarak giris yapilabildigini test edin

         */
        Driver.getDriver().get("https://www.qualitydemy.com/");

        QualtyDemyPage qualtyDemyPage=new QualtyDemyPage();

        qualtyDemyPage.ilkLoginLinki.click();

        qualtyDemyPage.kullaniciEmailKutusu.sendKeys("user_1106147@login.com");

        qualtyDemyPage.passwordKutusu.sendKeys("31488081");

        qualtyDemyPage.loginButonu.click();

        Assert.assertTrue(qualtyDemyPage.myCoursesLinki.isDisplayed());

        Driver.closeDriver();







    }
}
