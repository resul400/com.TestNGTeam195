package tests.day14_TestNG;

import org.testng.annotations.Test;

public class C01_TestNG {



    @Test(priority = 90)
    public void test01(){

        System.out.println("1");
    }

    @Test(priority = 10)
    public void test02(){

        System.out.println("2");
    }
    @Test(priority = 23)

    public void test03(){

        System.out.println("3");
    }
}
