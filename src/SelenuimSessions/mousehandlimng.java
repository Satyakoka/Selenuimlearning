package SelenuimSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehandlimng {

	public static void main(String[] args) throws InterruptedException {//bcoz we used thread
		
		System.setProperty("webdriver.chrome.driver", "/Users/ksv/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//maximixe the screen
		driver.manage().deleteAllCookies();//delete the cookies
		driver.get("https://www.spicejet.com/");
		Actions action = new Actions(driver);//Actions class for all the mouse activities ,annd add the default Action API
		
		
		action.moveToElement(driver.findElement(By.linkText("ADD-ONS"))).build().perform();//moveto ele-build-perform are the steps for selecting
		
		Thread.sleep(5000);//if we wont give this the below statement doesnt work
		driver.findElement(By.linkText("SpiceMAX")).click();
		
		driver.findElement(By.id("ControlGroupRetrieveBookingView_BookingRetrieveInputRetrieveBookingView_ConfirmationNumber")).sendKeys("657654876");
		driver.findElement(By.id("ControlGroupRetrieveBookingView_BookingRetrieveInputRetrieveBookingView_CONTACTEMAIL1")).sendKeys("koka");
		driver.findElement(By.id("ControlGroupRetrieveBookingView_BookingRetrieveInputRetrieveBookingView_ButtonRetrieve")).click();
	}

}
