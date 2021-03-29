package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgforDropDown {
	WebDriver driver;//we have written this bcoz we can use this driver objevct in all the methods
	@BeforeMethod
	
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "/Users/ksv/Downloads/chromedriver");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("https://www.txdmv.gov/");

}
	@Test
	public void texasTitleTest() {
		System.out.println( driver.getTitle());
			
		}
	//@Test
	//publ
		
	//@Test
	//public void dropDownTest() {
		//Select select = new Select(driver.findElement(By.id("gtranslate-dropdown-636554985")));
		//select.isMultiple();
	//}
	@AfterMethod
	public void tearUp() {
		driver.quit();
	}
	
}

	
