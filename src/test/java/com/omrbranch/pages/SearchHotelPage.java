package com.omrbranch.pages;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;

public class SearchHotelPage extends BaseClass {
	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(@class,'icoTwitter mr-2')]")
	private WebElement textWelcome;
	@FindBy(xpath = "(//select[@class='form-control selectpicker'])[1]")
	private WebElement ddnState;
	@FindBy(xpath = "//span[@class='select2-selection__placeholder']")
	private WebElement btnCity;
	@FindBy(xpath = "//li[text()='Coimbatore']")
	private WebElement btnCoimbatore;
	@FindBy(id = "city")
	private WebElement ddnCity;
	@FindBy(id = "room_type")
	private WebElement ddnRoomType;
	@FindBy(name = "check_in")
	private WebElement txtCheckIn;
	@FindBy(xpath = "//input[@name='check_out']")
	private WebElement txtCheckOut;
	@FindBy(xpath = "//select[@name='no_rooms']")
	private WebElement ddnNoOfRooms;
	@FindBy(xpath = "//select[@name='no_adults']")
	private WebElement ddnNoOfAdults;
	@FindBy(xpath = "//input[@name='no_child']")
	private WebElement txtNoOfChildren;
	@FindBy(id = "hotelsearch_iframe")
	private WebElement frameid;
	@FindBy(xpath = "//button[@id='searchBtn']")
	private WebElement btnSearch;
	@FindBy(id = "invalid-state")
	private WebElement textErrorState;
	@FindBy(id = "invalid-city")
	private WebElement textErrorCity;
	@FindBy(id = "invalid-check_in")
	private WebElement textErrorCheckIn;
	@FindBy(id = "invalid-check_out")
	private WebElement textErrorCheckOut;
	@FindBy(id = "invalid-no_rooms")
	private WebElement textErrorNoOfRooms;
	@FindBy(id = "invalid-no_adults")
	private WebElement textErrorNoOdAdults;
	@FindBy(xpath = "//input[@type='search']")
	private WebElement textCity;

	public WebElement getBtnCity() {
		return btnCity;
	}

	public WebElement getDdnCity() {
		return ddnCity;
	}

	public WebElement getTxtCityClick() {
		return textCity;
	}

	public WebElement getTextErrorState() {
		return textErrorState;
	}

	public WebElement getTextErrorCity() {
		return textErrorCity;
	}

	public WebElement getTextErrorCheckIn() {
		return textErrorCheckIn;
	}

	public WebElement getTextErrorCheckOut() {
		return textErrorCheckOut;
	}

	public WebElement getTextErrorNoOfRooms() {
		return textErrorNoOfRooms;
	}

	public WebElement getTextErrorNoOdAdults() {
		return textErrorNoOdAdults;
	}

	public WebElement getTextWelcome() {
		return textWelcome;
	}

	public WebElement getDdnState() {
		return ddnState;
	}

	public WebElement getBtnState() {
		return btnCity;
	}

	public WebElement getBtnCoimbatore() {
		return btnCoimbatore;
	}

	public WebElement getDdnRoomType() {
		return ddnRoomType;
	}

	public WebElement getTxtCheckIn() {
		return txtCheckIn;
	}

	public WebElement getTxtCheckOut() {
		return txtCheckOut;
	}

	public WebElement getDdnNoOfRooms() {
		return ddnNoOfRooms;
	}

	public WebElement getDdnNoOfAdults() {
		return ddnNoOfAdults;
	}

	public WebElement getTxtNoOfChildren() {
		return txtNoOfChildren;
	}

	public WebElement getFrameid() {
		return frameid;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	public String expectedWelcomeMessage() {
		String text = elementGetText(textWelcome);
		return text;
	}

	public void searchHotelWithAllFields(String state, String city, String roomType, String checkIn, String checkOut,
			String noOfRoom, String noOfAdult, String noOfChildren) throws AWTException, InterruptedException {

		searchHotelsCommonSteps(state, city, checkIn, checkOut, noOfRoom, noOfAdult);
		selectRoomType(roomType);
		elementSendKeys(txtNoOfChildren, noOfChildren);

	}

	public void searchHotelWithMandatoryFields(String state, String city, String checkIn, String checkOut,
			String noOfRoom, String noOfAdult) throws AWTException {
		searchHotelsCommonSteps(state, city, checkIn, checkOut, noOfRoom, noOfAdult);
	}

	public void searchHotelsCommonSteps(String state, String city, String checkIn, String checkOut, String noOfRoom,
			String noOfAdult) throws AWTException {
		elementDdnVisibleText(ddnState, state);
//		elementClick(btnCity);
//		elementSendKeysandEnter(textCity, city);
		elementDdnVisibleText(ddnCity, city);
		elementSendkeysJs(txtCheckIn, checkIn);
		elementSendkeysJs(txtCheckOut, checkOut);
		elementDdnVisibleText(ddnNoOfRooms, noOfRoom);
		elementDdnVisibleText(ddnNoOfAdults, noOfAdult);
	}

	public void clickSearchButton() {
		frameSwitchById(frameid);
		elementClick(btnSearch);
		switchToParentFrame();

	}

	public String stateError() {
		return elementGetText(textErrorState);
	}

	public String cityError() {
		return elementGetText(textErrorCity);
	}

	public String CheckInError() {
		return elementGetText(textErrorCheckIn);
	}

	public String checkOutError() {
		return elementGetText(textErrorCheckOut);
	}

	public String noOfRoomsError() {
		return elementGetText(textErrorNoOfRooms);
	}

	public String noOfAdultsError() {
		return elementGetText(textErrorNoOdAdults);
	}

	public void selectRoomType(String roomType) {
		String[] split = roomType.split("/");
		for (String s : split) {
			elementDdnVisibleText(ddnRoomType, s);
		}
	}

}