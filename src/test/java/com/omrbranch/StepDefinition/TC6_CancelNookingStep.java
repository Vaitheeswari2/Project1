package com.omrbranch.StepDefinition;
import org.junit.Assert;

import com.omrbranch.PageManager.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC6_CancelNookingStep {
	PageObjectManager pom = new PageObjectManager();

	@When("User should Cancel the new order ID")
	public void user_should_cancel_the_new_order_id() {
		pom.getMyBookingPage().cancelBooking();
	}
	@Then("User should verify after cancel booking success message {string}")
	public void user_should_verify_after_cancel_booking_success_message(String actualCancelSuccessMessage) {
		Assert.assertEquals("Verify the cancel booking message", actualCancelSuccessMessage,
				pom.getMyBookingPage().expectedCancelSuccessMessage());
	}

	@When("User should Cancel the existing order ID {string}")
	public void user_should_cancel_the_existing_order_id(String orderId) {
		pom.getMyBookingPage().cancelBooking();
	}

	@When("User should Cancel the first order ID")
	public void user_should_cancel_the_first_order_id() {
		pom.getMyBookingPage().cancelBooking();
	}








}
