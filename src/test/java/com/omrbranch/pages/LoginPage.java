package com.omrbranch.pages;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;


public class LoginPage extends BaseClass {
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "email")
	private WebElement txtUserName;
	@FindBy(id = "pass")
	private WebElement txtPassword;
	@FindBy(xpath = "(//button[@type='submit'])[1]")
	private WebElement btnLogin;
	@FindBy(id = "errorMessage")
	private WebElement textErrorMessage;
	public WebElement getTextErrorMessage() {
		return textErrorMessage;
	}
	public WebElement getTxtUserName() {
		return txtUserName;
	}
	public WebElement getTxtPassword() {
		return txtPassword;
	}
	public WebElement getBtnLogin() {
		return btnLogin;
	}
	public void login(String userName,String password) {
		elementSendKeys(txtUserName,userName);
		elementSendKeys(txtPassword, password);
		elementClick(btnLogin);
	}
	public void loginWithEnter(String userName,String password) throws AWTException {
		elementSendKeys(txtUserName,userName);
		elementSendKeys(txtPassword, password);
		enetrKey();
		
	}
	
	public String actualErrorMessage() {
		return elementGetText(textErrorMessage);
	}

}
