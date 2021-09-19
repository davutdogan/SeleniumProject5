package com.cybertek.selfStudy.day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLab {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        WebElement userName=driver.findElement(By.id("user-name"));
        userName.sendKeys("standard_user");

        WebElement password=driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");

        WebElement submit=driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
        submit.click();

        driver.quit();



    }
}
