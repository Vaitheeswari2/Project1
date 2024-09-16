package com.omrbranch.StepDefinition;
import org.junit.Assert;

import com.omrbranch.PageManager.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class TC4_BookHotelStep {
	PageObjectManager pom = new PageObjectManager();

	@When("User add Guest Details {string},{string},{string},{string} and {string}")
	public void userAddGuestDetails(String salutation, String firstName, String lastName, String mobileNo,
			String email) {
		pom.getBookHotelPage().addGuestDetails(salutation, firstName, lastName, mobileNo, email);
	}

	@When("User add GST Details {string},{string} and {string}")
	public void userAddGstDetails(String registrationNo, String companyName, String companyAddress) {
		pom.getBookHotelPage().addGstDetails(registrationNo, companyName, companyAddress);
	}

	@Then("User add Special Request {string}")
	public void userAddSpecialRequest(String specialRequest) throws Exception {
		pom.getBookHotelPage().addSpecialRequest(specialRequest);

	}

	@When("User enter payment details, procced with Card Type {string}")
	public void userEnterPaymentType(String card, io.cucumber.datatable.DataTable dataTable) {
		pom.getBookHotelPage().addPaymentDetails(card, dataTable);
	}

	@When("User should verify after hotel booking success message {string} and save the order ID")
	public void userVerifySuccessMessage(String actualBookingMessage) {

		Assert.assertEquals("Verify the booking success message ", actualBookingMessage,
				pom.getBookingConfirmationPage().expectedBookingMessage());
		System.out.println(pom.getBookingConfirmationPage().saveOrderId());

	}

	@Then("User should verify same selected Hotel is booked or not")
	public void userVerifySameSelectedHotelIsBooked() {
		Assert.assertTrue("Verify that same selected hotel is booked", pom.getBookingConfirmationPage()
				.hotelNameInBookingPage().contains(pom.getBookingConfirmationPage().hotelNameWithoutRoomType()));

	}

	@When("User click credit card")
	public void user_click_credit_card() {
		pom.getBookHotelPage().clickCreditCard();
	}

	@When("User click submit without enetring payment details")
	public void userClickSubmitWithoutEnteringPaymentDetails() {
		pom.getBookHotelPage().clickSubmitWithoutAnyDetails();
	}

	@Then("User should verify after payment details error message {string},{string},{string},{string},{string} and {string}")
	public void userVerifyAllErrorMessage(String cardTypeErro, String cardError, String numberError, String nameError,
			String dateError, String cvvError) {

		Assert.assertEquals("Verify the card type error message", cardTypeErro,
				pom.getBookHotelPage().getCardTypeError());
		Assert.assertEquals("Verify the card  error message", cardError, pom.getBookHotelPage().getCardError());
		Assert.assertEquals("Verify the card number error message", numberError,
				pom.getBookHotelPage().getCardNumberError());
		Assert.assertEquals("Verify the card name error message", nameError, pom.getBookHotelPage().getCardNameError());
		Assert.assertEquals("Verify the card date error message", dateError, pom.getBookHotelPage().getDateError());
		Assert.assertEquals("Verify the card cvv error message", cvvError, pom.getBookHotelPage().getCvvError());

	}

	@When("User enter upi details {string} and click submit")
	public void userEnterUpiDetailsAndClickSubmit(String upi) {
		pom.getBookHotelPage().userEnterUpiDetails(upi);
	}

	@When("User click upi")
	public void userClickUpi() {
		pom.getBookHotelPage().clickUpi();
	}

	@Then("User should verify after payment details error message {string}")
	public void user_should_verify_after_payment_details_error_message(String actualErrorMessage) {
		Assert.assertEquals("Verify the error message after click submit", actualErrorMessage,
				pom.getBookHotelPage().getUpiError());
	}


}
