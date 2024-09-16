package com.omrbranch.pages;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;
public class BookHotelPage extends BaseClass {
	public BookHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@id='step1']")
	private WebElement scrollDown;
	@FindBy(xpath = "//input[@id='own']")
	private WebElement btnOwn;
	@FindBy(xpath = "//select[@id='user_title']")
	private WebElement ddnSaluation;
	@FindBy(xpath = "//input[@id='first_name']")
	private WebElement txtFirstName;
	@FindBy(xpath = "//input[@id='last_name']")
	private WebElement txtLastName;
	@FindBy(xpath = "//input[@id='user_phone']")
	private WebElement txtPhoneNumber;
	@FindBy(xpath = "//input[@id='user_email']")
	private WebElement txtEmail;
	@FindBy(xpath = "//input[@id='gst']")
	private WebElement btnGst;
	@FindBy(xpath = "//input[@id='gst_registration']")
	private WebElement txtRegistrationNumber;
	@FindBy(xpath = "//input[@id='company_name']")
	private WebElement txtCompanyName;
	@FindBy(xpath = "//input[@id='company_address']")
	private WebElement txtCompanyAddress;
	@FindBy(id = "smoking")
	private WebElement btnSmoking;
	@FindBy(xpath = "//textarea[@id='other_request']")
	private WebElement txtSpecialRequest;
	@FindBy(xpath = "//button[@id='step1next']")
	private WebElement btnNextInGuestDetailsPage;
	@FindBy(xpath = "//button[@id='step2next']")
	private WebElement btnNextInspecialRequestPage;
	@FindBy(xpath = "//div[@class='credit-card pm']")
	private WebElement btnCrediCard;
	@FindBy(xpath = "//select[@id='payment_type']")
	private WebElement ddnCard;
	@FindBy(xpath = "//select[@id='card_type']")
	private WebElement ddnCardType;
	@FindBy(xpath = "//input[@id='card_no']")
	private WebElement txtCardNo;
	@FindBy(xpath = "//input[@id='card_name']")
	private WebElement txtCaedName;
	@FindBy(xpath = "//select[@id='card_month']")
	private WebElement ddnCardMonth;
	@FindBy(id = "card_year")
	private WebElement ddnCardYear;
	@FindBy(xpath = "//input[@id='cvv']")
	private WebElement txtCvv;
	@FindBy(xpath = "//button[@id='submitBtn']")
	private WebElement btnSubmit;
	@FindBy(xpath = "//h2[contains(text(),'Book Hotel')]")
	private WebElement textBookHotel;
	@FindBy(id = "invalid-payment_type")
	private WebElement textCardTypeError;
	@FindBy(id = "invalid-card_type")
	private WebElement textCardError;
	@FindBy(id = "invalid-card_no")
	private WebElement textNumberError;
	@FindBy(id = "invalid-card_name")
	private WebElement textNameError;
	@FindBy(id = "invalid-card_month")
	private WebElement textDateeError;
	@FindBy(id = "invalid-cvv")
	private WebElement textCvveError;
	@FindBy(xpath = "//div[@class='upi pm']")
	private WebElement btnUpi;
	@FindBy(id = "upi_id")
	private WebElement txtUpi;
	@FindBy(id = "invalid-upi")
	private WebElement textErrorUpi;

	public WebElement getTextErrorUpi() {
		return textErrorUpi;
	}

	public WebElement getTxtUpi() {
		return txtUpi;
	}

	public WebElement getTextCardTypeError() {
		return textCardTypeError;
	}

	public WebElement getTextCardError() {
		return textCardError;
	}

	public WebElement getTextNumberError() {
		return textNumberError;
	}

	public WebElement getTextNameError() {
		return textNameError;
	}

	public WebElement getTextDateeError() {
		return textDateeError;
	}

	public WebElement getTextCvveError() {
		return textCvveError;
	}

	public WebElement getBtnUpi() {
		return btnUpi;
	}

	public WebElement getBtnNextInGuestDetailsPage() {
		return btnNextInGuestDetailsPage;
	}

	public WebElement getBtnNextInspecialRequestPage() {
		return btnNextInspecialRequestPage;
	}

	public WebElement getTextBookHotel() {
		return textBookHotel;
	}

	public WebElement getScrollDown() {
		return scrollDown;
	}

	public WebElement getBtnOwn() {
		return btnOwn;
	}

	public WebElement getDdnSaluation() {
		return ddnSaluation;
	}

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtPhoneNumber() {
		return txtPhoneNumber;
	}

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getBtnGst() {
		return btnGst;
	}

	public WebElement getTxtRegistrationNumber() {
		return txtRegistrationNumber;
	}

	public WebElement getTxtCompanyName() {
		return txtCompanyName;
	}

	public WebElement getTxtCompanyAddress() {
		return txtCompanyAddress;
	}

	public WebElement getBtnSmoking() {
		return btnSmoking;
	}

	public WebElement getTxtSpecialRequest() {
		return txtSpecialRequest;
	}

	public WebElement getBtnNext() {
		return btnNextInGuestDetailsPage;
	}

	public WebElement getBtnCrediCard() {
		return btnCrediCard;
	}

	public WebElement getDdnCard() {
		return ddnCard;
	}

	public WebElement getDdnCardType() {
		return ddnCardType;
	}

	public WebElement getTxtCardNo() {
		return txtCardNo;
	}

	public WebElement getTxtCaedName() {
		return txtCaedName;
	}

	public WebElement getDdnCardMonth() {
		return ddnCardMonth;
	}

	public WebElement getDdnCardYear() {
		return ddnCardYear;
	}

	public WebElement getTxtCvv() {
		return txtCvv;
	}

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}

	public String expectedBookHotel() {
		return elementGetText(textBookHotel);
	}

	public void addGuestDetails(String salutation, String firstName, String lastName, String mobileNo, String email) {
		pagescrolldown(scrollDown);
		elementClick(btnOwn);
		elementDdnVisibleText(ddnSaluation, salutation);
		elementSendKeys(txtFirstName, firstName);
		elementSendKeys(txtLastName, lastName);
		elementSendKeys(txtPhoneNumber, mobileNo);
		elementSendKeys(txtEmail, email);

	}

	public void addGstDetails(String registrationNo, String companyName, String companyAddress) {
		elementClick(btnGst);
		elementSendKeys(txtRegistrationNumber, registrationNo);
		elementSendKeys(txtCompanyName, companyName);
		elementSendKeys(txtCompanyAddress, companyAddress);
		elementClick(btnNextInGuestDetailsPage);

	}

	public void addSpecialRequest(String specialRequest) throws Exception {
		try {
			elementClick(btnSmoking);
			elementSendKeys(txtSpecialRequest, specialRequest);
			elementClick(btnNextInspecialRequestPage);
		} catch (Exception e) {
			elementClick(btnNextInGuestDetailsPage);
			elementClick(btnSmoking);
			elementSendKeys(txtSpecialRequest, specialRequest);
			elementClick(btnNextInspecialRequestPage);
		}
	}

	public void commonStepsInPaymentDetails(String card, String cardType, String cardNumber, String cardName,
			String month, String year, String cvv) {

		elementClick(btnCrediCard);
		elementDdnVisibleText(ddnCard, card);
		elementDdnVisibleText(ddnCardType, cardType);
		elementSendKeys(txtCardNo, cardNumber);
		elementSendKeys(txtCaedName, cardName);
		elementDdnVisibleText(ddnCardMonth, month);
		elementDdnVisibleText(ddnCardYear, year);
		elementSendKeys(txtCvv, cvv);
		elementClick(btnSubmit);

	}

	public void addPaymentDetailss(String card, String cardType, String cardNumber, String cardName, String month,
			String year, String cvv) {
		try {
			commonStepsInPaymentDetails(card, cardType, cardNumber, cardName, month, year, cvv);
		} catch (Exception e) {
			if (btnNextInspecialRequestPage.isDisplayed()) {
				elementClick(btnNextInspecialRequestPage);
				elementClick(btnCrediCard);
				commonStepsInPaymentDetails(card, cardType, cardNumber, cardName, month, year, cvv);

			} else {
				elementClick(btnNextInGuestDetailsPage);
				elementClick(btnNextInspecialRequestPage);
				elementClick(btnCrediCard);
				commonStepsInPaymentDetails(card, cardType, cardNumber, cardName, month, year, cvv);
			}

		}
	}

	public void addPaymentDetails(String card, io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> asMaps = dataTable.asMaps();
		Map<String, String> map = null;

		if (card.equals("Debit Card")) {

			map = asMaps.get(0);

		} else if (card.equals("Credit Card")) {

			map = asMaps.get(1);

		}
		String selectCard = map.get("Select Card");
		String cardNo = map.get("Card No");
		String cardName = map.get("Card Name");
		String month = map.get("Month");
		String year = map.get("Year");
		String cvv = map.get("CVV");
		addPaymentDetailss(card, selectCard, cardNo, cardName, month, year, cvv);

	}

	public void clickCreditCard() {
		elementClick(btnCrediCard);

	}

	public void clickSubmitWithoutAnyDetails() {

		elementClick(btnSubmit);
	}

	public String getCardTypeError() {
		return elementGetText(textCardTypeError);
	}

	public String getCardError() {
		return elementGetText(textCardError);
	}

	public String getCardNumberError() {
		return elementGetText(textNumberError);
	}

	public String getCardNameError() {
		return elementGetText(textNameError);
	}

	public String getDateError() {
		return elementGetText(textDateeError);
	}

	public String getCvvError() {
		return elementGetText(textCvveError);
	}

	public void userEnterUpiDetails(String upi) {
		try {
			elementClick(btnUpi);
			elementSendKeys(txtUpi, upi);
			elementClick(btnSubmit);
		} catch (Exception e) {
			if (btnNextInspecialRequestPage.isDisplayed()) {

				elementClick(btnNextInspecialRequestPage);
				elementClick(btnUpi);
				elementSendKeys(txtUpi, upi);
				elementClick(btnSubmit);
			} else {
				elementClick(btnNextInGuestDetailsPage);
				elementClick(btnNextInspecialRequestPage);
				elementClick(btnUpi);
				elementSendKeys(txtUpi, upi);
				elementClick(btnSubmit);
			}
		}
	}

	public void clickUpi() {
		elementClick(btnUpi);
	}

	public String getUpiError() {
		return elementGetText(textErrorUpi);
	}

}


