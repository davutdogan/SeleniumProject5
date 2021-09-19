package com.cybertek.day04_common_elements_xpath_css_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatingDropDownList {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/dropdown");

        WebElement yearDropDown = driver.findElement(By.id("year"));

        Select yearSelectObj = new Select(yearDropDown);
        yearSelectObj.selectByIndex(2);
        yearSelectObj.selectByValue("2019");
        yearSelectObj.selectByVisibleText("1990");

        WebElement monthDropDown=driver.findElement(By.id("month"));
        Select montHSelectObj=new Select(monthDropDown);





        driver.quit();
    }
}
