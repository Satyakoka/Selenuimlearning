package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	
	
	//3 times the chrome will get launched and checks each method bcoz there are 3 test cases
	WebDriver driver;//we have written this bcoz we can use this driver objevct in all the methods
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "/Users/ksv/Downloads/chromedriver");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
	}
	@Test(priority=1,groups="Title")//priority mentions which test case should be executed first
	public void googleTitleTest() {
		System.out.println( driver.getTitle());
		
	}
	@Test(priority=2,groups="logo")//groups means if we have more testcases we can divide them into groups and see that result in the browser
	public void googleLogoTest() {
		boolean b =driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
		
	}
	@Test(priority=3,groups="link")
	public void googlelinkText() {
		  boolean b1 = driver.findElement(By.linkText("Gmail")).isDisplayed();
	}
	@Test(priority=4,groups="samples")
	public void sample() {
		System.out.println("This is a sample test");
	}
	@Test(priority=4,groups="samples")
	public void anotherSample() {
		System.out.println("This is a  also a sample test");
	}
	@AfterMethod
	public void  tearUp() {
		driver.quit();
		
	}

}
//so in this class there are 3 test cases ,@after and@before methods are not the testcases they are post and pre conditions
//Test cases are always independent


//NOTE: TO GET THE TESTCASES FILE

/*1.REFRESH THE TESTNG
 * 2.THEN A test-output FOLDER WILL GET CREATED
 * 3.GOTO index.html GOTO PROPERTIES AND COPY THE PATH AND PASTE IT IN THEBROWSER AS URL 
 * NOW SEND THAT REPORT TO MANAGER
 * 
 */


