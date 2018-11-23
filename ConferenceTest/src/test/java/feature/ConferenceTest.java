package feature;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ConferenceTest 
{
	public String baseUrl="http://localhost:9999//ConferenceTest//ConferenceRegistartion.html";
	WebDriver driver = null;
	
	
	@Before
	public void pre()
	{
		System.setProperty("webdriver.chrome.driver","D:\\lak\\chromedriver.exe");

        driver = new ChromeDriver();
	    driver.get(baseUrl);
	}
	@Given("^User is on Conference room booking page$")
	//@Test
	public void user_is_on_Conference_room_booking_page()
	{
		driver.get(baseUrl);
	}

	@When("^user select 'Next' link without entering 'FirstName'$")
	public void user_select_Next_link_without_entering_FirstName() {
		driver.findElement(By.linkText("Next")).click();
	}

	@Then("^'Please fill the First Name' message should display$")
	public void please_fill_the_First_Name_message_should_display() {
		Alert alert = driver.switchTo().alert();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String str = alert.getText();
		alert.accept();
		System.out.println(str);
		WebElement element = driver.findElement(By.id("txtFirstName"));
		element.sendKeys("Sushant");

	}

	@When("^user select 'Next' link without entering 'LastName'$")
	public void user_select_Next_link_without_entering_LastName() {
		driver.findElement(By.linkText("Next")).click();

	}

	@Then("^'Please fill the Last Name' message should display$")
	public void please_fill_the_Last_Name_message_should_display() {
		Alert alert = driver.switchTo().alert();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String str = alert.getText();
		alert.accept();
		System.out.println(str);
		WebElement element = driver.findElement(By.id("txtLastName"));
		element.sendKeys("Mandal");

	}

	@When("^user select 'Next' link without entering 'Email'$")
	public void user_select_Next_link_without_entering_Email() {
		driver.findElement(By.linkText("Next")).click();
	}

	@Then("^'Please fill the Email' message should display$")
	public void please_fill_the_Email_message_should_display() {
		Alert alert = driver.switchTo().alert();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String str = alert.getText();
		alert.accept();
		System.out.println(str);
		WebElement element = driver.findElement(By.id("txtEmail"));
		element.sendKeys("smandal@cg.com");

	}

	@When("^user select 'Next' link without entering 'Contactno'$")
	public void user_select_Next_link_without_entering_Contactno() {
		driver.findElement(By.linkText("Next")).click();
	}

	@Then("^'Please fill the Contact No' message should display$")
	public void please_fill_the_Contact_No_message_should_display() {
		Alert alert = driver.switchTo().alert();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String str = alert.getText();
		alert.accept();
		System.out.println(str);
		WebElement element = driver.findElement(By.id("txtPhone"));
		element.sendKeys("7899999999");

	}

	@When("^user select 'Next' link without entering 'NumberofPeople'$")
	public void user_select_Next_link_without_entering_NumberofPeople() {
		driver.findElement(By.linkText("Next")).click();
	}

	@Then("^'Please fill Number of people attending' message should display$")
	public void please_fill_Number_of_people_attending_message_should_display() {
		Alert alert = driver.switchTo().alert();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String str = alert.getText();
		alert.accept();
		System.out.println(str);
		Select dropdown = new Select(driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/select")));
		// dropdown.deselectAll();
		dropdown.selectByIndex(0);

	}

	@When("^user select 'Next' link without entering 'BuildingandRoom'$")
	public void user_select_Next_link_without_entering_BuildingandRoom() {
		driver.findElement(By.linkText("Next")).click();
	}

	@Then("^'Please fill Building & Room No' message should display$")
	public void please_fill_Building_Room_No_message_should_display() {
		Alert alert = driver.switchTo().alert();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String str = alert.getText();
		alert.accept();
		System.out.println(str);
		WebElement element = driver.findElement(By.id("txtAddress1"));
		element.sendKeys("Hyderabad");

	}

	@When("^user select 'Next' link without entering 'Areaname'$")
	public void user_select_Next_link_without_entering_Areaname() {
		driver.findElement(By.linkText("Next")).click();

	}

	@Then("^'Please fill Area name' message should display$")
	public void please_fill_Area_name_message_should_display() {
		Alert alert = driver.switchTo().alert();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String str = alert.getText();
		alert.accept();
		System.out.println(str);
		WebElement element = driver.findElement(By.id("txtAddress2"));
		element.sendKeys("Gar");

	}

	@When("^user select 'Next' link without entering 'City'$")
	public void user_select_Next_link_without_entering_City() {
		driver.findElement(By.linkText("Next")).click();
	}

	@Then("^'Please select city' message should display$")
	public void please_select_city_message_should_display() {
		Alert alert = driver.switchTo().alert();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String str = alert.getText();
		alert.accept();
		System.out.println(str);
		Select dropdown = new Select(driver.findElement(By.xpath("/html/body/form/table/tbody/tr[9]/td[2]/select")));
		// dropdown.deselectAll();
		dropdown.selectByIndex(1);

	}

	@When("^user select 'Next' link without entering 'State'$")
	public void user_select_Next_link_without_entering_State() {
		driver.findElement(By.linkText("Next")).click();

	}

	@Then("^'Please select state' message should display$")
	public void please_select_state_message_should_display() {
		Alert alert = driver.switchTo().alert();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String str = alert.getText();
		alert.accept();
		System.out.println(str);
		Select dropdown = new Select(driver.findElement(By.xpath("/html/body/form/table/tbody/tr[10]/td[2]/select")));
		// dropdown.deselectAll();
		dropdown.selectByIndex(1);

	}

	@When("^user select 'Next' link without entering 'MembershipStatus'$")
	public void user_select_Next_link_without_entering_MembershipStatus() {
		driver.findElement(By.linkText("Next")).click();

	}

	@Then("^'Please select MembershipStatus' message should display$")
	public void please_select_MembershipStatus_message_should_display() {
		Alert alert = driver.switchTo().alert();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String str = alert.getText();
		alert.accept();
		System.out.println(str);
		WebElement element = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[12]/td[2]/input"));
		element.click();
	}

	@Given("^User has given all the required fields$")
	public void user_has_given_all_the_required_fields() {
		driver.findElement(By.linkText("Next")).click();

	}

	@Then("^'Personal Details are validated' message should display$")
	public void personal_Details_are_validated_message_should_display() {
		Alert alert = driver.switchTo().alert();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String str = alert.getText();
		alert.accept();
		System.out.println(str);
	}

	@Test
	public void TestAll() {
		user_is_on_Conference_room_booking_page();
		user_select_Next_link_without_entering_FirstName();
		please_fill_the_First_Name_message_should_display();
		user_select_Next_link_without_entering_LastName();
		please_fill_the_Last_Name_message_should_display();
		user_select_Next_link_without_entering_Email();
		please_fill_the_Email_message_should_display();
		user_select_Next_link_without_entering_Contactno();
		please_fill_the_Contact_No_message_should_display();
		user_select_Next_link_without_entering_NumberofPeople();
		please_fill_Number_of_people_attending_message_should_display();
		user_select_Next_link_without_entering_BuildingandRoom();
		please_fill_Building_Room_No_message_should_display();
		user_select_Next_link_without_entering_Areaname();
		please_fill_Area_name_message_should_display();
		user_select_Next_link_without_entering_City();
		please_select_city_message_should_display();
		user_select_Next_link_without_entering_State();
		please_select_state_message_should_display();
		user_select_Next_link_without_entering_MembershipStatus();
		please_select_MembershipStatus_message_should_display();
		user_has_given_all_the_required_fields();
		personal_Details_are_validated_message_should_display();
	}

	@After
	public void post() {
		// driver.quit();
	}

}