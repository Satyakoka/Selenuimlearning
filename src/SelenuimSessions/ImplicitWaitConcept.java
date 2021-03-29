package SelenuimSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/ksv/Downloads/chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		//  we are using the below methods in stead of THREAD(bcoz it has disadv 
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);//SELENUIM waits for 40 sec for the page to load
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);//Selenium  waits for 20 sec for the elements to load and display
		
		
		
		

	}

}
