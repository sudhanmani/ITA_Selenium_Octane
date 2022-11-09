package com.test.octane_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleSeleniumScript1 {
	

    @Test()

    public void chromeBrowserTest() {

         

    WebDriverManager.chromedriver().setup();

    WebDriver driver = new ChromeDriver();

    driver.manage().window().maximize();

    driver.get("https://www.geeksforgeeks.org/");
    
    driver.findElement(By.xpath("//*[@id=\"home-page\"]/div/div[1]/div[1]/div/div[2]/div/div/div/span/a")).click();



    /*

    * driver.findElement(By.id("user_email_Login")).sendKeys("");

    * driver.findElement(By.id("user_password")).sendKeys("your_password");

    * driver.findElement(By.name("login"));

    *

     * String actualUrl=""; String expectedUrl= driver.getCurrentUrl();

    * Assert.assertEquals(expectedUrl,actualUrl);

    */

   

    //driver.close();

         

    }

}
