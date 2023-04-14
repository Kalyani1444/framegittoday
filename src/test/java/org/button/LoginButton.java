package org.button;

import org.hexa.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginButton extends LibGlobal {

	public LoginButton() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "username")

	private WebElement txtUserName;

	@FindBy(id = "password")

	private WebElement txtPassword;

	@FindBy(id = "login")

	private WebElement btnLogin;

	@FindBy(xpath = "//p[@role='alert']")
	private WebElement loginErrorMsg;

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public WebElement getLoginErrorMsg() {
		return loginErrorMsg;
	}

}

