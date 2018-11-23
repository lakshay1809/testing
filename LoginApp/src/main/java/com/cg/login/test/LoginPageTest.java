package com.cg.login.test;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"/LoginApp/src/test/java/feature/login.feature"},
		glue= {"com.cg.login.stepdefinition"},
		tags= {"@execute"}
	)
public class LoginPageTest {

}
