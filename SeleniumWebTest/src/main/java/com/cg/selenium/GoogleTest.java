package com.cg.selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {
public String baseUrl="http://www.google.co.in/";

@Test
public void verifyHomePageTitle() throws Exception {
System.setProperty("webdriver.chrome.driver","D:\\lak\\chromedriver.exe");

WebDriver driver = new ChromeDriver();
    driver.get(baseUrl);
    WebElement element = driver.findElement(By.name("q"));
    element.sendKeys("different types of pushups\n"); // send also a "\n"
    element.submit();
    System.out.println("Page title is:"+driver.getTitle());
    driver.quit();
}

}
