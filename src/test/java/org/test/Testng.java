package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testng {
	@Test

	private void browserTest() throws InterruptedException {

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(option);

		driver.get("https://adactinhotelapp.com/");

		driver.findElement(By.id("username")).sendKeys("vignesh0140");
		driver.findElement(By.id("password")).sendKeys("vignesh0140");
		WebElement login = driver.findElement(By.id("login"));
		Thread.sleep(4000);
		login.click();

	}

	@Test
		
		private void browserTest2() throws InterruptedException {
			
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--remote-allow-origins=*");
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver(option);
			
		driver.get("https://adactinhotelapp.com/");

		driver.findElement(By.id("username")).sendKeys("vignesh0140");
		driver.findElement(By.id("password")).sendKeys("vignesh0140");
		WebElement login = driver.findElement(By.id("login"));
		Thread.sleep(4000);
		login.click();
	}
	
}
