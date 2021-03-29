package SelenuimSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigatingconcepts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/ksv/Downloads/chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//  we are using the below methods in stead of THREAD(bcoz it has disadv 
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);//SELENUIM waits for 40 sec for the page to load
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);//Selenium  waits for 20 sec for the elements to load and display
		driver.get("https://www.google.com/");
		//        TO NAVIGATE FROM ONE URL TO OTHER WE USE navigate().to();
		driver.navigate().to("https://www.amazon.com/");//goto amazon page
        driver.navigate().back();//goes to google back
    	Thread.sleep(2000);//wait
    	driver.navigate().forward();//again goto amazon
    	Thread.sleep(2000);
    	driver.navigate().back();//comes back to google
    	driver.navigate().refresh();//Refreshes the google page
	
		

	}

}
