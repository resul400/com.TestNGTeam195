package tests.day14_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class C04_HardAssert {


    @Test
    public void test01(){
        Assert.assertTrue(6>4);
        System.out.println("1.ass");
        Assert.assertTrue(6>14);
        System.out.println("2.ass");
        Assert.assertEquals(6,6);
        System.out.println("3.ass");



    }
}
