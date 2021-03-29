package SelenuimSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwaitcocept {




	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/ksv/Downloads/chromedriver");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	
	driver.get("https://www.facebook.com/");
	
	
	clickOn(driver, driver.findElement(By.cssSelector("#u_0_2")),20);//to click on create an account
	//clickOn(driver, driver.findElement(By.xpath("//button[@id='u_0_b']")), 40);//to click on login
	


	}

	   
	/*                   THIS IS CALLED SYNCHRONIZATION WAIT IN SELENUIM WHICH IS CALLED EXPLICIT WAIT
	 * EXPLICIT WAIT MEANS SELENUIM WAITS EXPLICITLY UNTIL A ELEMENT IS LOADED AND CLICKABLE(ex;need to wait until the login
	 * button is visible to click by passing the particular xpath and this works on ly for one element at a time
	 * We need to create a method for the explicit wait,so we are creating after the main method
	 * creating a CLICKON method and passing the elements in that(driver,locator,timeout)
	 * we are creating WebDriverWait object which is already a class available in selenuim,and takes 2 parementers (driver and time out)
	 * And also we mention STALE ELEMENT REFERENCE EXCEPTION  until the element is clickable*/
	
	public static void  clickOn(WebDriver driver,WebElement locator,int timeout) {
		new WebDriverWait(driver,timeout).ignoring(StaleElementReferenceException.class)
		.until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();
		
	}
	}


