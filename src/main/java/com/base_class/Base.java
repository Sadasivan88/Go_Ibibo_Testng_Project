package com.base_class;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static WebDriver driver;
	
	/**
	 * This will launch the browser
	 * @param browser
	 * @return WebDriver
	 */

	public static void launchBrowser(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		

	
	}

	public static void launchUrl(String url) {
		driver.manage().window().maximize();
		driver.get(url);
	}

	public static void getCurrentTitle() {
		String title = driver.getTitle();
		
	}

	public static String getText(WebElement element) {
		//explicityWait(element);
		String text = element.getText();
		return text;
	}
	public static boolean elementDisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		return displayed;

	}

	public static void senText(WebElement element, String text) {
		//explicitWait();
		element.sendKeys(text);	
	}
	

	public static void clickOnElement(WebElement element) throws InterruptedException {
       
		element.click();
	}

	public static void screenshot() {

		DateTimeFormatter dateFormatted = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		LocalDateTime date = LocalDateTime.now();
		String fileName = date.format(dateFormatted);
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			// File dest = new File(System.getProperty("user.dir") + "\\screenshots\\" +
			// fileName + ".png");
			File dest = new File(".\\screenshots\\" + fileName + ".png");

			FileHandler.copy(src, dest);
		} catch (Exception e) {
			e.printStackTrace();

		}
	}
	
	public static void screenshot(String fileName) {

		
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			// File dest = new File(System.getProperty("user.dir") + "\\screenshots\\" +
			// fileName + ".png");
			File dest = new File("C:\\Users\\admin\\eclipse-workspace\\selenium\\project\\ScreenShots\\" + fileName + ".png");

			FileHandler.copy(src, dest);
		} catch (Exception e) {
			e.printStackTrace();

		}
	}


	public static void mouseHover(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).build().perform();
	}

	public static void dragAndDrop(WebElement src, WebElement dest) {
		Actions a = new Actions(driver);
		a.dragAndDrop(src, dest).build().perform();
	}

	public static void confirmAlert(WebElement element, String condition) {

		Alert confirm_alert = driver.switchTo().alert();
		if (condition.equalsIgnoreCase("accept")) {
			confirm_alert.accept();
		} else if (condition.equalsIgnoreCase("dismiss")) {
			confirm_alert.dismiss();
		}

	}

	public static void selectFromDropDown(WebElement element, String option, String value) {

		Select s = new Select(element);
		if (option.equalsIgnoreCase("index")) {
			s.selectByIndex(Integer.parseInt(value));
		} else if (option.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		} else if (option.equalsIgnoreCase("visibleText")) {
			s.selectByVisibleText(value);
		}

	}

	public static void scrollUsingCoordinates(int width, int height) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(" + width + "," + height + ");");
	}
	
	public static void clickUsingJSE(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()",element);
	}

	public static void frameUsingIndex(int index) {
		driver.switchTo().frame(index);
	}

	public static void frameUsingName(String name) {
		driver.switchTo().frame(name);
	}

	public static void frameUsingElement(WebElement element) {
		driver.switchTo().frame(element);
	}

	public static void switchToDefault() {
		driver.switchTo().defaultContent();
	}
	
	
	public static void enterkey() throws AWTException {
		Robot robotobj = new Robot();
		robotobj.keyPress(KeyEvent.VK_ENTER);
		robotobj.keyRelease(KeyEvent.VK_ENTER);
		
		
	}
	
	public static String scannerMethod() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the otp here:");
		Integer otp=sc.nextInt();
		String otp1=otp.toString();
		return otp1;
	}
	
	 

	//public static void switchWindow(int index) {
		//Set<String> all_tab_id = driver.getWindowHandles();
		//List<String> tab_id_list = new LinkedList<>(all_tab_id);
		//driver.switchTo().window(tab_id_list.get(index));
	//}


	public static void implicitWait() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public static void explicitWait(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public static void exit() {
		driver.close();
	}
	public static void exit1() {
		driver.quit();
	}

}
