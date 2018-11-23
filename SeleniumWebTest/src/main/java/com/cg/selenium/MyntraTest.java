package com.cg.selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MyntraTest {

	public String baseUrl = "https://www.myntra.com/";

	@Test
	public void verifyOrder() {
		WebDriver driver = null;
		try {
			System.setProperty("webdriver.chrome.driver", "D:\\lak\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.get(baseUrl);
			WebElement name = driver.findElement(By.className("desktop-searchBar"));
			name.sendKeys("mobile");
			name.sendKeys(Keys.RETURN);

			WebElement xyz = driver.findElement(
					By.xpath("//*[@id=\"mountRoot\"]/div/main/div[3]/div[1]/section/div/div[3]/ul/li[3]/label/input"));

			Actions actions = new Actions(driver);
			actions.moveToElement(xyz);
			actions.click().perform();

			String path = "//*[@id=\"desktopSearchResults\"]/div[2]/section/ul/li[2]/a/div[1]/div/div/div";
			WebElement abc = driver.findElement(By.xpath(path));
			actions.moveToElement(abc);
			actions.click().perform();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// driver.quit();
		}
	}

}
