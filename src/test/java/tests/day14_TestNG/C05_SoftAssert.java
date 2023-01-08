package tests.day14_TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class C05_SoftAssert {

    @Test(groups = {"Smoke"})
    public void test01(){

        SoftAssert softAssert= new SoftAssert();

        softAssert.assertEquals(6,6);

        System.out.println("1. soft");

        softAssert.assertTrue(5>3);

        System.out.println("2. soft");

        softAssert.assertFalse(8>9);

        System.out.println("3. soft");




        softAssert.assertAll();





    }
}
