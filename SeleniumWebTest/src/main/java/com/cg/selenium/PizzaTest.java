package com.cg.selenium;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PizzaTest {

	
		public String baseUrl="http://localhost:9999//SeleniumWebTest//pizza.html";

		@Test
		public void verifyOrder() {
		System.setProperty("webdriver.chrome.driver","D:\\lak\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		    driver.get(baseUrl);
		    WebElement name = driver.findElement(By.name("name"));
		    name.sendKeys("Lakshay Arora");
		    
		    WebElement option1 = driver.findElement(By.id("pizza"));
		    option1.click();
		    
		    Select oSelect = new Select(driver.findElement(By.id("sel")));
		    oSelect.selectByVisibleText("Tomato");
		    oSelect.selectByVisibleText("Onion");
		    


WebElement oCheckBox = driver.findElement(By.name("vegPizza"));

 oCheckBox.click();
 
 WebElement del = driver.findElement(By.name("instructions"));
 del.sendKeys("get it soon");


		    System.out.println("Page title is:"+driver.getTitle());
		   // driver.quit();
		}

		}

