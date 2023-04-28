package com.baseclass;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {

	public static WebDriver driver;

	public static WebDriver openBrowser(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "//Drivers//chromedriver.exe");

			driver = new ChromeDriver();

			driver.manage().window().maximize();


		}

		return driver;

	}

	public static void openUrl(String url) {

		driver.get(url);

	}

	public static void click(WebElement element) {

		element.click();

	}

	public static void sendInput(WebElement element, String input) {

		element.sendKeys(input);
	}

	public static void quit() {

		driver.quit();
	}
	

	public static void close() {

		driver.close();
	}
	
	public static void Navto(String url) {

		driver.navigate().to(url);
	}
	
	public static void Navback() {

		driver.navigate().back();
	}
	
	public static void Navfrwd() {

		driver.navigate().forward();
	}
	
	public static void Navrefresh() {

		driver.navigate().refresh();
	}
	
	
	public static void AcceptAlert() {

		Alert alert = driver.switchTo().alert();
		
		alert.accept();
	}
	
	
	public static void sDropDown(WebElement Format, String Input) {

		
		Select S1= new Select(Format);
		S1.selectByVisibleText(Input);
		
	}
	
	public static void takeScreenshot(WebDriver driver , String path) throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot)(driver);
		
		File sstype = ts.getScreenshotAs(OutputType.FILE);
		
	    File filepath = new File(path);
		
	    FileHandler.copy(sstype, filepath);
	}
	
}
