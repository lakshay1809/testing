package com.cg.selenium;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	
	WebDriver driver;
	@Test
	public void Example() throws InterruptedException
	{
		String path="/html/body/fieldset/button";
		System.setProperty("webdriver.chrome.driver", "D:\\lak\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:9999/SeleniumWebTest/alert.html");
		Thread.sleep(2000);
		WebElement name = driver.findElement(By.xpath(path));
		name.click();
		Alert alerts=driver.switchTo().alert();
		Thread.sleep(1000);
		String str= alerts.getText();
		alerts.accept();
		System.out.println(str);
	}
}
