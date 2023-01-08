package tests.day15;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AmazonPage;
import utilities.Driver;

import java.util.Arrays;

public class C01_soft {

    @Test(groups = "minireg2")
    public static void test01(){

        Driver.getDriver().get("https://wwww.amazon.com");

        SoftAssert softAssert= new SoftAssert();

        String expectedURL="amazon";
        String actualURL= Driver.getDriver().getCurrentUrl();

        softAssert.assertTrue(actualURL.contains(expectedURL),"yet");

        AmazonPage amazonPage=new AmazonPage();

        amazonPage.amazonAramaKutusu.sendKeys("Nutella" + Keys.ENTER);

        String aramaSonuc=amazonPage.amazonAramaElementi.getText();

        softAssert.assertTrue(aramaSonuc.contains("Nutella"),"nut");

        amazonPage.amazonAramaKutusu.clear();
        amazonPage.amazonAramaKutusu.sendKeys("Java"+Keys.ENTER);


        System.out.println(amazonPage.amazonAramaKutusu.getText());

        aramaSonuc=amazonPage.amazonAramaElementi.getText();

        String[] sonucArr= aramaSonuc.split(" ");

        System.out.println(Arrays.toString(sonucArr));

        String javaSonuc=sonucArr[3];

        javaSonuc=javaSonuc.replaceAll("\\W","");

        int sonuSayisi= Integer.parseInt(javaSonuc);

        softAssert.assertTrue(sonuSayisi>1000,"YUH");





        softAssert.assertAll();
        Driver.closeDriver();
    }
}
