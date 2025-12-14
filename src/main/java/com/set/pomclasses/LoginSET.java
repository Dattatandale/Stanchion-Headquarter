package com.set.pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.set.actionclass.Action;
import com.set.baseclass.baseclass;

public class LoginSET extends baseclass {

	@FindBy(xpath = "//td[text()='Name']")
	private WebElement usernametext;
	@FindBy(xpath = "//td[text()='Password']")
	private WebElement passwordtext;
	@FindBy(xpath = "//input[@name='ipusername']")
	private WebElement username;
	@FindBy(xpath = "//input[@name='ippassword']")
	private WebElement password;
	@FindBy(xpath = "//input[contains(@src,'/multistore/gifs/but')]")
	private WebElement LogInBtnLogo;

	public LoginSET(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public String usernametext() {
		String usernam = Action.getText(usernametext);
		return usernam;
	}

	public String passwordtext() {
		String passwor = Action.getText(passwordtext);
		return passwor;
	}

	public boolean btnenabled() {
		boolean result = Action.isEnabled(driver, LogInBtnLogo);
		return result;
	}

	public HomePageSET ClickToLogin() {
		Action.sendKey(username, prop.getProperty("username").toString());
		Action.sendKey(password, prop.getProperty("password").toString());
		LogInBtnLogo.click();
		return new HomePageSET(driver);
	}

}
