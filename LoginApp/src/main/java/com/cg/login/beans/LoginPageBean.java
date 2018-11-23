package com.cg.login.beans;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageBean 
{

	@FindBy(how=How.ID, id="username")
	private WebElement name;
	
	@FindBy(how=How.ID, id="password")
	private WebElement pass;

	@FindBy(how=How.NAME, name="submit")
	private WebElement submitb;
	
	@FindBy(how=How.NAME, name="reset")
	private WebElement resetb;
	
	public String getName() {
		return name.getAttribute("id");
	}

	public void setName(String name) {
		this.name.sendKeys(name); 
	}

	public String getPass() {
		return pass.getAttribute("id");
	}

	public void setPass(String pass) {
		this.pass.sendKeys(pass);
	}
	 public void submitbuttonclick() {
		 submitb.click();
	 }
	 public void resetbuttonclick() {
		 resetb.click();
	 }
}
