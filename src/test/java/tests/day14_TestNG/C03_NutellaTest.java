package tests.day14_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C03_NutellaTest {

    @Test(groups = {"minireg1","minireg2","Smoke"})
    public void test01(){

        Driver.getDriver().get("https://www.amazon.com");

       // WebElement arama=Driver.getdriver().findElement(By.id("twotabsearchtextbox"));
        AmazonPage amazonPage= new AmazonPage();

        amazonPage.amazonAramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

       // WebElement aramaElementi=Driver.getdriver().findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));

        String expected="Nutella";
        String actual= amazonPage.amazonAramaElementi.getText();

        Assert.assertTrue(actual.contains(expected));






    }
}
