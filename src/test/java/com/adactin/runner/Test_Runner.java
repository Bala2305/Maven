package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseclass.Base_Class;




@RunWith(io.cucumber.junit.Cucumber.class)

@io.cucumber.junit.CucumberOptions(features = "src//test//java//com//adactin//feature", glue = "com.adactin.stepdefinition", 
monochrome = true, dryRun = false, tags = ("@tag1"), 
plugin = {"html:target/Reports/report.html", "json:target/Reports/jasonreport.json",
		
})
 

public class Test_Runner {

	public static WebDriver driver;
	
	
	@BeforeClass
	public static void set_Up() {

		driver = Base_Class.openBrowser("chrome");
		
	}
	
	
	
	
	@AfterClass
	public static void close_Off() {

	driver.close();	
	
	}
	
	
	
	
	
	
}
