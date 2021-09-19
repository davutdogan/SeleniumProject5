package com.cybertek.selfStudy.day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class radioButton {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/radio_buttons");
        WebElement blueRadioButton=driver.findElement(By.id("blue"));
        System.out.println("blueRadioButtton.isSelected() = " +
                blueRadioButton.isSelected());
        blueRadioButton.click();
        WebElement redButton= driver.findElement(By.id("red"));
        redButton.click();
        System.out.println("redButton.isSelected() = " + redButton.isSelected());
        System.out.println("after selecting red button blueRadioButton.isSelected() = "
                + blueRadioButton.isSelected());

        List<WebElement>allColorRadios=driver.findElements(By.name("color"));
        System.out.println("allColorRadios.size() = " + allColorRadios.size());

        for (WebElement eachRadioButton:allColorRadios         ) {
            System.out.println("eachRadioButton.getAttribute(\"id\") = " + eachRadioButton.getAttribute("id"));
            System.out.println("eachRadioButton.isEnabled() = " + eachRadioButton.isEnabled());
            System.out.println("eachRadioButton.isSelected() = " + eachRadioButton.isSelected());
        }
        driver.quit();

    }
}
