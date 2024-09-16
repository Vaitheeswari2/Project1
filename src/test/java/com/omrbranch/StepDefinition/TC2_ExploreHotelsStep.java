package com.omrbranch.StepDefinition;
import java.awt.AWTException;

import org.junit.Assert;

import com.omrbranch.PageManager.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class TC2_ExploreHotelsStep {
	PageObjectManager pom = new PageObjectManager();

	@When("User search hotel {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void userSearchHotelWithAllFields(String state, String city, String roomType, String checkIn,
			String checkOut, String noOfRoom, String noOfAdult, String noOfChildren)
			throws AWTException, InterruptedException {
		pom.getSearchHotelPage().searchHotelWithAllFields(state, city, roomType, checkIn, checkOut, noOfRoom, noOfAdult,
				noOfChildren);
		pom.getSearchHotelPage().clickSearchButton();

	}

	@Then("User should verify after search hotel success message {string}")
	public void verifySelecHotelMessage(String actualSelectHotelMessage) {
		Assert.assertEquals("Verify the success message after search hotel", actualSelectHotelMessage,
				pom.getSelectHotelPage().expectedSelecHotelMessage());
	}

	@When("User search hotel {string},{string},{string},{string},{string} and {string}")
	public void searchHotelOnlyWithMandatoryFields(String state, String city, String checkIn, String checkOut,
			String noOfRoom, String noOfAdult) throws AWTException {
		pom.getSearchHotelPage().searchHotelWithMandatoryFields(state, city, checkIn, checkOut, noOfRoom, noOfAdult);
		pom.getSearchHotelPage().clickSearchButton();
	}

	@Then("User click Search button")
	public void clickSearchButton() {
		pom.getSearchHotelPage().clickSearchButton();

	}

	@Then("User should verify after search hotel error message {string},{string},{string},{string},{string} and {string}")
	public void errorMessageVeri(String stateError, String cityError, String checkInError, String checkOutError,
			String noOfRoomsError, String noOfAdultsError) {
		Assert.assertEquals("Verify the state error message", stateError, pom.getSearchHotelPage().stateError());
		Assert.assertEquals("Verify the city error message", cityError, pom.getSearchHotelPage().cityError());
		Assert.assertEquals("Verify the check in date error message", checkInError,
				pom.getSearchHotelPage().CheckInError());
		Assert.assertEquals("Verify the check out error message", checkOutError,
				pom.getSearchHotelPage().checkOutError());
		Assert.assertEquals("Verify the no of rooms error message", noOfRoomsError,
				pom.getSearchHotelPage().noOfRoomsError());
		Assert.assertEquals("Verify the no of adults error message", noOfAdultsError,
				pom.getSearchHotelPage().noOfAdultsError());

	}

	@When("User click sort from low to high")
	public void clickLowToHigh() throws InterruptedException {
		pom.getSelectHotelPage().clickLowToHigh();
	}

	@Then("User should verify after sorting that price are listed from low to high")
	public void verifyTheSortedPriceAreLowToHigh() {
		Assert.assertTrue("Verify that sorted price are low to high", pom.getSelectHotelPage().verifyPriceLowToHigh());
	}

	@When("User click sort from high to low")
	public void clickHighToLow() throws InterruptedException {
		pom.getSelectHotelPage().clickHighToLow();
	}

	@Then("User should verify after sorting that price are listed from high to low")
	public void verifyTheSortedPriceAreHighToLow() {
		Assert.assertTrue("Verify that sorted price are low to high", pom.getSelectHotelPage().verifyPriceHighToLow());
	}

	@When("User click sort from Descending order")
	public void userClicKDescendingOrder() throws InterruptedException {
		pom.getSelectHotelPage().clickNameDescending();

	}

	@Then("User should verify after sorting that name in Descending order")
	public void veriftTheSortedNameAreDesscendingOrder() {
		Assert.assertTrue("Verify that sorted name are in Desscending order",
				pom.getSelectHotelPage().verifyDescendingOrder());

	}

	@When("User click sort from Ascending order")
	public void userClicKAscendingOrder() throws InterruptedException {
		pom.getSelectHotelPage().clickNameAscending();
	}

	@Then("User should verify after sorting that name in Ascending order")
	public void veriftTheSortedNameAreAscendingOrder() {
		Assert.assertTrue("Verify that sorted name are in Ascending order",
				pom.getSelectHotelPage().verifyAscendingOrder());
	}

	@Then("User should verify all hotel listed in the selected room type {string}")
	public void userVerifyThatAllHotelListedInSelectedRoomType(String roomType) {
		Assert.assertFalse("Verify that all listed hotel are in the same room type",
				pom.getSelectHotelPage().verifyThatAllListedHotelIsInSameRoomType(roomType));
	}

	@Then("User should verify the header contains {string}")
	public void userVerifyThatHeaderContainsRoomType(String roomType) {
		Assert.assertEquals("Verify the header contains room type", roomType,
				pom.getSelectHotelPage().verifyThatHeaderContainsroomType());

	}

}
