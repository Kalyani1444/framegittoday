package org.hexa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends LibGlobal  {

	public LoginPage() {
	PageFactory.initElements(driver, this);
	
	}
	
	@FindBy (id = "email")
	private WebElement txtUserName;
	
	@FindBy(id = "pass")

	private WebElement txtPassword;
	
	@FindBy (id= "login")
	
  private WebElement btnLogin;

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
}


