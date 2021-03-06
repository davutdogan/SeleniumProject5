package com.cybertek.tests.day06_junit_practice_utiliy_methods;

import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class SlowElementTest extends TestBase {
    @Test
    public void testWait() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("http://practice.cybertekschool.com/dynamic_controls");
        driver.findElement(By.xpath("//button[.='Remove']")).click();

        Thread.sleep(5000);

        WebElement itsGoneElm = driver.findElement(By.id("message"));
        System.out.println("itsGoneElm.getText() = " + itsGoneElm.getText());
        System.out.println("The end");

    }
}
