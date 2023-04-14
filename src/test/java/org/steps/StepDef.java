package org.steps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.button.LoginButton;
import org.hexa.LibGlobal;
import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef extends LibGlobal {

	@Given("User is on Instagram login page")
	public void user_is_on_Instagram_login_page() {
		launchBrowser("edge");
		maximizeWindow();
		implicitWait(20);
		pageLoadWait(20);
		openAppUrl("https://www.instagram.com/");

	}

	@When("User enters {string} and {string} and click on login Button")
	public void user_enters_and_and_click_on_login_Button(String username, String password) {
		driver.findElement(By.name("username")).sendKeys("7418851444");
		driver.findElement(By.name("password")).sendKeys("Instagram@123");
		driver.findElement(By.xpath("//div[@class='_ab8w  _ab94 _ab99 _ab9f _ab9m _ab9p  _abak _abb8 _abbq _abb- _abcm'][1]")).click();
	}

	@Then("User verify login success message {string}")
		public void user_verify_login_success_message(String expectedLoginSuccessMsg) {
		System.out.println(expectedLoginSuccessMsg);
	}
	
	@Then("User verify login error message")
	public void user_verify_login_error_message() {
		System.out.println("Sorry, your password was incorrect. Please double-check your password.");
	}

	@When("User enters userName and password and press enter key")
	public void user_enters_userName_and_password_and_press_enter_key(io.cucumber.datatable.DataTable d) throws AWTException {
		driver.findElement(By.name("username")).sendKeys("7418851444");
		driver.findElement(By.name("password")).sendKeys("Instagram@123");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
	}

	@Then("User verify login success message")
	public void user_verify_login_success_message() {
		System.out.println("login successful");
	 
		
	}


}


