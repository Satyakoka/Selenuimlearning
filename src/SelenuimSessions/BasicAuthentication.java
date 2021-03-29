package SelenuimSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuthentication {

	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/ksv/Downloads/chromedriver");
	WebDriver driver =  new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	//This is used when the window popus are authenticated and element cannot be inspected
	//then we need to give the un and pwd like this(un:pwd@test.com
	driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	//We are inspecting the message and checking it by css selector by intializing to a string named PageMessage 
	 String PageMessage =driver.findElement(By.cssSelector("body:nth-child(2) div.row:nth-child(2) div.large-12.columns:nth-child(2) div.example > p:nth-child(2)")).getText();
	
	 System.out.println("PageMessage");//we are printing this to confirm whether we got the message or not
	

	}

	
}
