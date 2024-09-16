package com.omrbranch.pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;


public class SelectHotelPage extends BaseClass {
	
	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
	}

	public static String firstHotelName;
	public static String firstHotelPrice;
	public static String lastHotelName;
	public static String lastHotelPrice;
	@FindBy(xpath = "//h5[text()='Select Hotel']")
	private WebElement textSelecHotel;
	@FindBy(xpath = "(//div[@class='col-md-5 hotel-suites'])[1]/h5")
	private WebElement textHotelName;
	@FindBy(xpath = "((//div[@class='prize'])/strong)[1]")
	private WebElement textPrize;
	@FindBy(xpath = "(//a[text()='Continue'])[1]")
	private WebElement btnContinue;
	@FindBy(xpath = "//label[@for='value_pltoh']")
	private WebElement radioBtnLowToHigh;
	@FindBy(xpath = "//label[@for='value_phtol']")
	private WebElement radioBtnHighToLow;
	@FindBy(xpath = "//label[@for='value_nasc']")
	private WebElement radioBtnNameAscending;
	@FindBy(xpath = "//label[@for='value_ndesc']")
	private WebElement radioBtnNameDescending;
	@FindBy(xpath = "//strong[@class='total-prize']")
	private List<WebElement> textAllHotelPrize;
	@FindBy(xpath = "(//div[@class='col-md-5 hotel-suites'])/h5")
	private List<WebElement> textAllHotelName;
	@FindBy(xpath = "//a[@id='room_type']")
	private WebElement textAllRoomType;
	@FindBy(xpath = "//a[text()='Continue']")
	private List<WebElement> btnLastContinue;

	public static String getFirstHotelName() {
		return firstHotelName;
	}

	public static String getFirstHotelPrice() {
		return firstHotelPrice;
	}

	public static String getLastHotelName() {
		return lastHotelName;
	}

	public static String getLastHotelPrice() {
		return lastHotelPrice;
	}

	public List<WebElement> getBtnLastContinue() {
		return btnLastContinue;
	}

	public WebElement getTextAllRoomType() {
		return textAllRoomType;
	}

	public List<WebElement> getTextAllHotelName() {
		return textAllHotelName;
	}

	public WebElement getRadioBtnLowToHigh() {
		return radioBtnLowToHigh;
	}

	public WebElement getRadioBtnHighToLow() {
		return radioBtnHighToLow;
	}

	public WebElement getRadioBtnNameAscending() {
		return radioBtnNameAscending;
	}

	public WebElement getRadioBtnNameDescending() {
		return radioBtnNameDescending;
	}

	public List<WebElement> getTextAllHotelPrize() {
		return textAllHotelPrize;
	}

	public WebElement getTextSelecHotel() {
		return textSelecHotel;
	}

	public WebElement getTextHotelName() {
		return textHotelName;
	}

	public WebElement getTextPrize() {
		return textPrize;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}

	public String expectedSelecHotelMessage() {
		return elementGetText(textSelecHotel);
	}

	public void clickLowToHigh() throws InterruptedException {
		elementClick(radioBtnLowToHigh);
		sleep();
	}

	public void clickHighToLow() throws InterruptedException {
		elementClick(radioBtnHighToLow);
		sleep();

	}

	public void clickNameAscending() throws InterruptedException {
		elementClick(radioBtnNameAscending);
		sleep();
	}

	public void clickNameDescending() throws InterruptedException {
		elementClick(radioBtnNameDescending);
		sleep();
	}

	public boolean verifyPriceLowToHigh() {
		List<Integer> dev = new ArrayList<>();
		for (int i = 0; i < textAllHotelPrize.size(); i++) {
			WebElement webElement = textAllHotelPrize.get(i);
			String text = webElement.getText();
			String substring = text.substring(2);
			String replace = substring.replace(",", "");
			int int1 = Integer.parseInt(replace);
			dev.add(int1);
		}
		List<Integer> qa = new ArrayList<>();
		qa.addAll(dev);
		Collections.sort(qa);
		return qa.equals(dev);

	}

	public boolean verifyPriceHighToLow() {

		List<Integer> dev = new ArrayList<>();
		for (int i = 0; i < textAllHotelPrize.size(); i++) {
			WebElement webElement = textAllHotelPrize.get(i);
			String text = webElement.getText();
			String substring = text.substring(2);
			String replace = substring.replace(",", "");
			int int1 = Integer.parseInt(replace);
			dev.add(int1);
		}
		List<Integer> qa = new ArrayList<>();
		qa.addAll(dev);
		Collections.sort(qa);
		Collections.reverse(qa);
		return qa.equals(dev);

	}

	public boolean verifyAscendingOrder() {
		List<String> dev = new ArrayList<>();
		for (WebElement name : textAllHotelName) {
			String text = name.getText();
			dev.add(text);
		}
		List<String> qa = new ArrayList<>();
		qa.addAll(dev);
		Collections.sort(qa);
		return qa.equals(dev);

	}

	public boolean verifyDescendingOrder() {
		List<String> dev = new ArrayList<>();
		for (WebElement name : textAllHotelName) {
			String text = name.getText();
			dev.add(text);
		}
		List<String> qa = new ArrayList<>();
		qa.addAll(dev);
		Collections.sort(qa);
		Collections.reverse(qa);
		return qa.equals(dev);

	}

	public boolean verifyThatAllListedHotelIsInSameRoomType(String roomType) {
		List<Boolean> b = new ArrayList<>();
		for (int i = 0; i < textAllHotelName.size(); i++) {
			WebElement webElement = textAllHotelName.get(i);
			String text = webElement.getText();
			boolean contains = text.contains(roomType);
			b.add(contains);
		}
		return b.contains(false);

	}

	public String verifyThatHeaderContainsroomType() {
		return elementGetText(textAllRoomType);
	}

	public String textFirstHotelName() {
		return firstHotelName = elementGetText(textHotelName);
	}

	public String textFirstHotelPrice() {
		return firstHotelPrice = elementGetText(textPrize);
	}

	public void clickFirstHotelContinue() {
		elementClick(btnContinue);
		alertaccept();
	}

	public String textLastHotelName() {
		WebElement webElement = textAllHotelName.get(textAllHotelName.size() - 1);
		return lastHotelName = elementGetText(webElement);
	}

	public String textLastHotelPrice() {
		WebElement webElement = textAllHotelPrize.get(textAllHotelPrize.size() - 1);
		return lastHotelPrice = elementGetText(webElement);
	}

	public void clickLastHotelContinue() {
		WebElement webElement = btnLastContinue.get(btnLastContinue.size() - 1);
		elementClick(webElement);
		alertaccept();
	}

}

