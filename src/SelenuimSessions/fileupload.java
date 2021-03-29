package SelenuimSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileupload {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/ksv/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();//to launch chrome
		
		driver.get("https://html.com/input-type-file/");//to get the url
		
		driver.findElement(By.id("fileupload")).sendKeys( "/Users/ksv/Downloads/picture.jpg");//to upload the file from our system,as selenuim cant 
		//handle the desktop applications we need to give the path where the file exists
		
		
		
	}

}
