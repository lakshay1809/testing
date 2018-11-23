package feature;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageTest {

	
	public String baseUrl="http://localhost:9999/ConferenceTest/ImageTest.html";

	@Test
	public void verifyImage() throws Exception {
	System.setProperty("webdriver.chrome.driver","D:\\lak\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	    driver.get(baseUrl);
	    WebElement element = driver.findElement(By.xpath("/html/body/img"));
	    
	    System.out.println(element.isDisplayed()+ " "+ element.getSize()+" "+ element.getTagName()+ " "+ element.getLocation() );
	    
	    File screen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(screen, new File("D:\\fkayyy1.gif"));
	    //driver.quit();
	}
}
