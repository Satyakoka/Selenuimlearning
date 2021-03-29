package SelenuimSessions;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class gmailproperties {
	 static WebDriver driver;


	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("/Users/ksv/Desktop/SeleniumWS/JavaTraining/Selenuimlearning/src/SelenuimSessions/systemgmail.properties");
		prop.load(fis);
		String url =prop.getProperty("URL");//assigning to string and then printing
		System.out.println(url);
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		
		
		if (browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "/Users/ksv/Downloads/chromedriver");
			 driver =new ChromeDriver();
			 }
			else if(browserName.equals("FF"))
			{
				System.setProperty("webdriver.chrome.driver", "/Users/ksv/Downloads/geckodriver");
				 driver =new FirefoxDriver();
				 }
		
				driver.get(url);
				driver.findElement(By.xpath(prop.getProperty("Firstname_xpath"))).sendKeys(prop.getProperty("Firstname"));
				
				driver.findElement(By.xpath(prop.getProperty("Lastname_xpath"))).sendKeys(prop.getProperty("Lastname"));
				driver.findElement(By.xpath(prop.getProperty("Username_xpath"))).sendKeys(prop.getProperty("Username"));
				
				
				driver.findElement(By.xpath(prop.getProperty("Password_xpath"))).sendKeys(prop.getProperty("Password"));
				driver.findElement(By.xpath(prop.getProperty("Confirm_xpath"))).sendKeys(prop.getProperty("Confirm"));
				driver.findElement(By.xpath(prop.getProperty("Showpassword_xpath"))).click();
				driver.findElement(By.className(prop.getProperty("Next_ClassName"))).click();
				driver.findElement(By.xpath(prop.getProperty("Phonenumber_xpath"))).sendKeys(prop.getProperty("Phonenumber"));
				
			}
		

	}



