package com.omrbranch.StepDefinition;
import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;

import com.omrbranch.baseclass.BaseClass;
import com.omrbranch.PageManager.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class TC1_loginStep extends BaseClass{
	PageObjectManager pom = new PageObjectManager();

	@Given("User is on the OMR Branch hotel page")
	public void userLaunchUrl() throws FileNotFoundException, IOException {
	}

	@When("User enter {string} and {string}")
	public void userLogin(String userName, String password) {

		pom.getLoginPage().login(userName, password);

	}

	@Then("User should verify sucees message after login {string}")
	public void userVerifyMessageAterLogin(String actualLoginMessage) {

		Assert.assertEquals("Verify Succes message after login", actualLoginMessage,
				pom.getSearchHotelPage().expectedWelcomeMessage());

	}

	@When("User enter {string} and {string} with enter key")
	public void userLoginWithEnter(String userName, String password) throws AWTException {
		pom.getLoginPage().loginWithEnter(userName, password);

	}

	@Then("User should verify error message after login {string}")
	public void userVerifyErrorMessage(String expectedErrorMessage) {
		Assert.assertTrue("Verify the error message after login",
				expectedErrorMessage.contains(pom.getLoginPage().actualErrorMessage()));

	}

}


