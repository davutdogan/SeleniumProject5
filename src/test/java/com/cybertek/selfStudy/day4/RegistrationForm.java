package com.cybertek.selfStudy.day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationForm {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");

        WebElement srchBox = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
        srchBox.sendKeys("Hedphone");
        WebElement srchSubmit= driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]"));
        srchSubmit.click();
        WebElement sonyHeadPhone= driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[6]/div/span/div/div/div[2]/div[2]/div/div/div[1]/h2/a"));
       sonyHeadPhone.click();
       WebElement sonyPrice=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[6]/div/span/div/div/div[2]/div[2]/div/div/div[3]/div[1]/div/div[1]/div/a/span/span[2]/span[3]"));
       sonyPrice.click();


        driver.quit();

    }
}
