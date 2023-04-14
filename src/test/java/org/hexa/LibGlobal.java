package org.hexa;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.*;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {


		public static WebDriver driver;
		
		public static  WebDriver launchBrowser(String browserName) {
		
			if(browserName.equals("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			}else if(browserName.equals("firefox")) {
		
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			}else if(browserName.equals("edge")) {
				WebDriverManager.edgedriver().setup();
				
				driver = new EdgeDriver();
			} else {
				System.out.println("invalid browser");
			}
				
			
			
			return driver;	
	}
				public void maximizeWindow() {
			
					driver.manage().window().maximize();
					
				}
				
			public  void openAppUrl(String url) {
				
				driver.get(url);
				}
			
	   public String getPageUrl() {
					String url = driver.getCurrentUrl();
					return url;
	}
		
	   public void enterValue(WebElement e, String data) {
			e.sendKeys(data);
			
			}
	   public void implicitWait(long seconds) {
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	
	}
			
	   
				public void elementClick(WebElement element) {
					element.click();
				}
				
				public Navigation navigate() {
	Navigation n = driver.navigate();
	return n;

			}
				public String getAttributeValue(WebElement e, String name) {
	String attribute = e.getAttribute(name);
	return attribute;
	}
				public boolean displayed(WebElement element) {
					
				boolean d = element.isDisplayed();
				return d;

			}
				
		
				public void refreshpage() {
	navigate().refresh();
				}
				
				public Alert switchToAlert() {

	Alert a1= driver.switchTo().alert();

	return a1;
		
	}			
				public void acceptAlert() {
	switchToAlert().accept();

	}			
				public void dismissAlert() {
					switchToAlert().dismiss();
				}
				
				public  void dragAndDrop(WebElement source, WebElement target) {
	Actions action = new Actions(driver);
	action.dragAndDrop(source,target).perform();

				}
				 
				public void selectOptionByText(WebElement element, String text) {

					Select s = new Select(element);
					
					s.selectByVisibleText(text);
				
					
				}
				
		
				public String getValue2DWithHeader(DataTable dataTable, int index, String key) {
					List<Map<String, String>> list = dataTable.asMaps();
					Map<String, String> map = list.get(index);
					String x = map.get(key);
					return x;
				}

				public void pressEnter() throws AWTException {
					Robot n = new Robot();

					n.keyPress(KeyEvent.VK_ENTER);
					n.keyRelease(KeyEvent.VK_ENTER);

				}
				public void selectByValue(WebElement element, String value) {

			Select a = new Select(element);
			a.selectByValue(value);
				}
				
				public void selectByIndex(WebElement element, int value) {
					Select s = new Select(element);
					s.selectByIndex(value);
					}
				
				
				public void enterValue(WebElement e, String data, int rownum, int cellnum) {
					
					e.sendKeys(data);
				}

	public void maximizewindow() {
		
		driver.manage().window().maximize();


	}

	public void dismisAlert() {
		switchToAlert().dismiss();
	}
		
	public void closeBrowser() {
	closeBrowser();

	}



	//select

	public void selectOptionsByText(WebElement element, String text) {

		Select s = new Select(element);
		s.selectByVisibleText(text);
		}

		


	public void refreshPage() {

		navigate().refresh();
		
					
					
				}
	
	public static WebElement locatorsByxpath(String data) {
		WebElement element = driver.findElement(By.xpath(data));
		return element;
	}

	public static WebElement locatorsByid(String data) {
		WebElement element = driver.findElement(By.id(data));
		return element;
	}

	public static List<WebElement> elementsByxpath(String data) {
		List<WebElement> list = driver.findElements(By.xpath(data));
		return list;
	}

	public static List<WebElement> elementsByid(String data) {
		List<WebElement> list = driver.findElements(By.id(data));
		return list;
	}

	public static List<WebElement> elementsByTagnmae(String data) {
		List<WebElement> findElements = driver.findElements(By.tagName(data));
		return findElements;
	}

	public static void enterText(WebElement element, String text) {
		element.sendKeys(text);
	}

	public static void click(WebElement element) {
		element.click();
	}

	public static String text(WebElement element) {
		return element.getText();

	}

	public static String getattribute(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;
	}

	public static void print(String data) {
		System.out.println(data);
	}
	// Navigate

	public static void navigateUrl(String text) {
		driver.navigate().to(text);
	}

	public static void navigateForward() {
		driver.navigate().forward();
	}

	public static void navigateBackward() {
		driver.navigate().back();
	}

	public static void navigateRefresh() {
		driver.navigate().refresh();
	}



//	}
	public static void ScreenShot(String filename) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File as = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(as, new File("C:\\Users\\admin\\Desktop\\DATA FILES" + filename + ".png"));
	}
//	


	// frames
	public static void framenumber(int frameno) {
		driver.switchTo().frame(frameno);

	}

	public static void framename(String framename) {
		driver.switchTo().frame(framename);

	}

	public static void frameElements(WebElement framenelement) {
		driver.switchTo().frame(framenelement);

	}

	public static void defultframes() {
		driver.switchTo().defaultContent();

	}

	public static void parentframes() {
		driver.switchTo().parentFrame();
	}
	
	public void pageLoadWait(long seconds) {
driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(seconds));

	}
	
	public byte[] takeScreenshot() {
TakesScreenshot screen =(TakesScreenshot)driver;
byte[] as = screen.getScreenshotAs(OutputType.BYTES);
return as;
	}
	
	public void deleteCookies() {
driver.manage().deleteAllCookies();
	}
				}


