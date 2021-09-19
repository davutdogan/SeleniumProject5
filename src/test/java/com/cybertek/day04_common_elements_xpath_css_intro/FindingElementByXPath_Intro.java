package com.cybertek.day04_common_elements_xpath_css_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingElementByXPath_Intro {
    public static void main(String[] args) {
        ///html/body/div[2]/div[2]/div/div/div/h1/span
        ///html/body/div[2]/div[2]/div/div/div/h1/span
        ///html/body/div[2]/div[2]/div/div/div/h1/span
        ///html/body/div/div/div[2]/div/div/div/h1/span
        ////*[@id="content"]/div/div/h1/span
        ///html/body/div[2]/div[2]/div/div/div/h1/span

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/");

        WebElement headerSpan = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/h1/span"));
        System.out.println("headerSpan.getText() = " + headerSpan.getText());


        WebElement headerSpan2 = driver.findElement(By.xpath("//h1/span"));
        System.out.println("headerSpan2.getText() = " + headerSpan2.getText());

       driver.findElement(By.xpath("a[text()='Checkboxes']")).click();


        driver.quit();
    }
}
