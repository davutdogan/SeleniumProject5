package com.cybertek.test.day06_junit_practice_utiliy_methods;

import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebTables extends TestBase {

    @Test
    public void testWebTable(){
        driver.get("http://practice.cybertekschool.com/tables");
       String cell42Locator="//table[@id='table1']/tbody/tr[4]/td[2]";
        WebElement cell42=driver.findElement(By.xpath(cell42Locator));

        System.out.println("cell42.getText() = " + cell42.getText());
    }

}
