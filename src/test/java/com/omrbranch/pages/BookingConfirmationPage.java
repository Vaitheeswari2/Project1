package com.omrbranch.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;

public class BookingConfirmationPage extends BaseClass{
	public BookingConfirmationPage() {
		PageFactory.initElements(driver, this);
	}

	public static String orderID;
	public static String hotelNameInBookingConfirmationPage;
	@FindBy(xpath = "//h2[@name='booking-code']//strong")
	private WebElement orderId;
	@FindBy(xpath = "//h2[@name='booking-code']")
	private WebElement textBookingId;
	@FindBy(xpath = "//div[@class='seccess-box text-center']/p")
	private WebElement textSuccesMessage;
	@FindBy(xpath = "//a[@data-testid='username']")
	private WebElement btnWelcome;
	@FindBy(xpath = "//a[text()='My Account']")
	private WebElement btnMyAccount;
	@FindBy(xpath = "//div[@class='seccess-box text-center']/p")
	private WebElement textHotelName;
	@FindBy(xpath = "//h2[@name='booking-code']")
	private WebElement textBookingIsConfirmed;

	public WebElement getOrderId() {
		return orderId;
	}

	public WebElement getTextHotelName() {
		return textHotelName;
	}

	public WebElement getTextBookingIsConfirmed() {
		return textBookingIsConfirmed;
	}

	public WebElement getTextBookingId() {
		return textBookingId;
	}

	public WebElement getTextSuccesMessage() {
		return textSuccesMessage;
	}

	public WebElement getBtnWelcome() {
		return btnWelcome;
	}

	public WebElement getBtnMyAccount() {
		return btnMyAccount;
	}

	public String expectedBookingMessage() {
		String string = elementGetText(textBookingIsConfirmed);
		String[] split = string.split(" ");
		String res = "";
		for (int i = 1; i < split.length; i++) {
			res = res + split[i] + " ";
		}
		String trim = res.trim();
		return trim;

	}

	public String saveOrderId() {
		return orderID = elementGetText(orderId);
	}

	public String hotelNameInBookingPage() {
		return hotelNameInBookingConfirmationPage = elementGetText(textHotelName);
	}

	public String hotelNameInSelectPage() {
		return SelectHotelPage.firstHotelName;
	}

	public String hotelNameWithoutRoomType() {
		String firstHotelName = SelectHotelPage.firstHotelName;
		String[] split = firstHotelName.split(" ");
		String onlyHotelName = "";
		return onlyHotelName + split[0];

	}

	public boolean veriyTheSameHotelNameIsBooked() {
		return hotelNameInBookingPage().contains(hotelNameInSelectPage());
	}

	public void toMyAccountPage() {
		elementClick(btnWelcome);
		elementClick(btnMyAccount);
	}

}



