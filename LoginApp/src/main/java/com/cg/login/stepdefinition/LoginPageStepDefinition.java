package com.cg.login.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.cg.login.beans.LoginPageBean;


import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageStepDefinition {
	
	private WebDriver driver;
	private LoginPageBean pageBean;
	
	@Before
	public void pre()
	{
		System.setProperty("webdriver.chrome.driver","D:\\lak\\chromedriver.exe");
	}

	
	@Given("^User is on the login page$")

	public void user_is_on_the_login_page()

	{

	driver = new ChromeDriver();

	driver.get("http://localhost:9999/LoginApp/login.html");

	driver.manage().window().maximize();

	pageBean = new LoginPageBean();

	PageFactory.initElements(driver, pageBean);

	}

	@When("^User clicks on 'Submit' without entering 'UserName'$")

	public void user_clicks_on_Submit_without_entering_UserName()

	{

	pageBean.submitbuttonclick();

	}

	@Then("^'All fields are madatory' message should display$")

	public void please_fill_the_First_Name_message_should_display()

	{

	String actualMessage = driver.switchTo().alert().getText();

	String expectedMessage = "All fields are madatory";

	Assert.assertEquals(expectedMessage, actualMessage);

	}

	@Given("^User has given all the required fields$")

	public void user_has_given_all_the_required_fields()

	{

	driver.switchTo().alert().dismiss();

	pageBean.setName("Lak");

	pageBean.setPass("123");

	}

	@When("^User clicks 'Submit'$")

	public void user_clicks_Submit()

	{

	pageBean.submitbuttonclick();

	}

	@Then("^'successfully submitted!!' message should display$")

	public void successfully_Submitted_message_should_display()

	{

	String actualMessage = driver.switchTo().alert().getText();

	String expectedMessage = "successfully submitted!!";

	Assert.assertEquals(expectedMessage, actualMessage);

	}

	@When("^User clicks 'Reset'$")

	public void user_clicks_Reset()

	{

	pageBean.resetbuttonclick();

	}

	@Then("^'fields cleared' message should display$")

	public void login_Cancelled_message_should_display()

	{

	String actualMessage = driver.switchTo().alert().getText();

	String expectedMessage = "fields cleared";

	Assert.assertEquals(expectedMessage, actualMessage);

	}

	}




