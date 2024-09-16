package com.omrbranch.StepDefinition;
import org.junit.Assert;

import com.omrbranch.PageManager.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC3_SelectHotelStep {
	PageObjectManager pom = new PageObjectManager();

	@When("User save the first hotel name and hotel price")
	public void userSaveTheFirstHotelNameAndPrice() {
		System.out.println(pom.getSelectHotelPage().textFirstHotelName());
		System.out.println(pom.getSelectHotelPage().textFirstHotelPrice());
	}

	@When("User select the first hotel and accept the alert")
	public void userSelectFirstHotelAndAcceptAlert() {
		pom.getSelectHotelPage().clickFirstHotelContinue();
	}

	@Then("User should verify after select success message {string}")
	public void userVerifySuccesMessageAfterSelectHotel(String bookHotel) {
		Assert.assertTrue("Verify the Succes message after select hotel",
				pom.getBookHotelPage().expectedBookHotel().contains(bookHotel));
	}

	@When("User save the last hotel name and hotel price")
	public void userSaveTheLastHotelNameAndPrice() {
		System.out.println(pom.getSelectHotelPage().textLastHotelName());
		System.out.println(pom.getSelectHotelPage().textLastHotelPrice());

	}

	@When("User select the last hotel and accept the alert")
	public void UserSelextLastHotelAndAcceptTheAlert() {
		pom.getSelectHotelPage().clickLastHotelContinue();

	}

}
