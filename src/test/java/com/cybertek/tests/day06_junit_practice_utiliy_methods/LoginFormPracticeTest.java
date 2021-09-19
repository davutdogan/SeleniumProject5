package com.cybertek.tests.day06_junit_practice_utiliy_methods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;

public class LoginFormPracticeTest {
    WebDriver driver;

    @BeforeEach
    public void setupWebDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterEach
    public void closeBrowser() {
        driver.quit();

    }
    @Test
    public void testLogin(){

        driver.get("http://practice.cybertekschool.com/login");

        //h2[ .='Login Page' ]
        WebElement header = driver.findElement(By.xpath("//h2[ .='Login Page' ]"));
        System.out.println("header.getText() = " + header.getText());

        //   css selector :   input[name='username']
        // @Hande Tek Karsi
        driver.findElement(By.cssSelector("input[name='username']")).sendKeys("tomsmith");
        //   css selector :   input[name='password']
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("SuperSecretPassword");

        // wooden_spoon
        driver.findElement(By.id("wooden_spoon")).click();

        //div[@id='flash']
        WebElement successMsg = driver.findElement(By.xpath(" //div[@id='flash']"));

        String expectedResult = "You logged into a secure area!" ;
        assertTrue(successMsg.getText().startsWith(expectedResult) );

        System.out.println("successMsg.isDisplayed() = " + successMsg.isDisplayed());

        String xpathStr = "//div[ contains( text() , 'You logged into a secure area!') ]" ;
        WebElement successMsg2 = driver.findElement(By.xpath(xpathStr)) ;

        assertTrue(   successMsg2.isDisplayed()  );
    }

    public static class IsDisplayedPracticeTest {

        WebDriver driver ;
        // setting up all driver stuff here directly in @BeforeEach method
        @BeforeEach
        public void setupWebDriver(){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }

        @AfterEach
        public void closeBrowser(){
            driver.quit();
        }

        // navigate to the form page http://practice.cybertekschool.com/registration_form
        // identify the error message exists but not displayed
        // enter text "a" and check the error message displayed

        /**
         * small[data-bv-for='firstname'][data-bv-validator='stringLength]
         * //small[.='first name must be more than 2 and less than 64 characters long']
         */
        @Test
        public void testErrorMessage(){


            driver.get("http://practice.cybertekschool.com/registration_form");

            String xpathForErrorMsg = "//small[.='first name must be more than 2 and less than 64 characters long']" ;
            // this element exists in html but it's hidden not displayed on the screen
            // it will only display when there is an input validation error like less 2 or more than 64 chars in this case
            // so isDisplayed method will return false
            WebElement strLengthErrorElement = driver.findElement(By.xpath(xpathForErrorMsg)) ;
            System.out.println("strLengthErrorElement.isDisplayed() = " + strLengthErrorElement.isDisplayed());

            assertTrue( ! strLengthErrorElement.isDisplayed() ) ;
            assertFalse(  strLengthErrorElement.isDisplayed() );

            // now we are entering something invalid : less than 2 character
            WebElement firstNameField = driver.findElement(By.name("firstname")) ;
            firstNameField.sendKeys("a");
            // now the error message should show up
            System.out.println("strLengthErrorElement.isDisplayed() = " + strLengthErrorElement.isDisplayed());

            assertTrue( strLengthErrorElement.isDisplayed() );

        }



    }
}
