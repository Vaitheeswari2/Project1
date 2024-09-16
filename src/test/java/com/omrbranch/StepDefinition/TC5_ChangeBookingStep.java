package com.omrbranch.StepDefinition;
import org.junit.Assert;

import com.omrbranch.PageManager.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class TC5_ChangeBookingStep {
	PageObjectManager pom = new PageObjectManager();

	@When("User navigate to My Booking page")
	public void userNavigateToMyBookingPage() {
		pom.getBookingConfirmationPage().toMyAccountPage();
	}

	@Then("User should verify after navigate to My Booking page success message as {string}")
	public void userVerifyAfterNavigateToMyBookingPage(String actualBookingMessage) {
		boolean contains = pom.getMyBookingPage().expectedBookingMessage().contains(actualBookingMessage);
		Assert.assertTrue("Verify the booking success message", contains);
	}

	@When("User search the Order ID")
	public void userSearchTheOrderId() {
		pom.getMyBookingPage().searchOrderId();

	}

	@When("User search the {string}")
	public void user_search_the(String orderId) {
		pom.getMyBookingPage().searchOrderIdByInput(orderId);
	}

	@When("User search the Order ID {string}")
	public void user_search_the_order_id(String orderId) {
		pom.getMyBookingPage().searchOrderIdByInput(orderId);
	}

	@Then("User should verify same booked Order ID is present or not")
	public void userShouldVerifyThatSameBookedOrderIdIsPresent() {
		Assert.assertTrue("Verify the same order is presenet", pom.getMyBookingPage().getFirstOrderId());
	}

	@Then("User should verify same booked Hotel Name is present or not")
	public void iserShouldVeriftThatSameBookedHotelIsPresent() {
		Assert.assertTrue("Verify that same booked hotel name is present or not",
				pom.getMyBookingPage().verifyTheSameBookedHotelNameIsPresent());
	}

	@Then("User should verify same booked Hotel Price is present or not")
	public void userShouldVerifyThatSameBookedHotelPriceIsPresent() {
		Assert.assertTrue("Verify the same booked hotel price is present or not",
				pom.getMyBookingPage().verifySameBookedHotelPriceIsPresent());
	}

	@When("User edit the Check-in Date {string}")
	public void userEditTheCheckInDate(String modifyDate) {
		pom.getMyBookingPage().modifyChechInDate(modifyDate);
	}

	@Then("User should verify after modify check-in date success message {string}")
	public void userVerifySuccessMessageAfterModify(String actualMessage) {

		Assert.assertEquals("Verify the update successful message", actualMessage,
				pom.getMyBookingPage().expectedBookingSuccessMessage());

	}

	@When("User edit the Check-in Date for the first displayed Order ID {string}")
	public void userEditTheFirstDisplayedOrderID(String chechInDate) {
		pom.getMyBookingPage().modifyChechInDate(chechInDate);
	}


}
