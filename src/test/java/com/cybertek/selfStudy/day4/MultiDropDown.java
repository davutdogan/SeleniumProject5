package com.cybertek.selfStudy.day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDropDown {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/dropdown");

        WebElement multipleItem= driver.findElement(By.name("Languages"));
        Select multiItemSelect=new Select(multipleItem);

        System.out.println("multiItemSelect.isMultiple() = "
                + multiItemSelect.isMultiple());
        multiItemSelect.selectByIndex(3);
        multiItemSelect.selectByValue("c#");
        multiItemSelect.selectByVisibleText("Java");

        multiItemSelect.deselectAll();
        driver.quit();


    }
}
