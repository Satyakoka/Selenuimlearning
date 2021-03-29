package SelenuimSessions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Getproperties {
	 static WebDriver driver;

	public static void main(String[] args) throws IOException {//we need to add throws defaul after using FILEInputStream
		Properties prop =new Properties();//properties is the inbuilt class we are using it and creating a object prop and also import java.util.prop
		//In below we already have a FileInputStream class and we are creating an object fis and GIVING THE PATH WHERE WE HAVE SYSTEMPROPERTIES
		FileInputStream fis = new FileInputStream("/Users/ksv/Desktop/SeleniumWS/JavaTraining/Selenuimlearning/src/SelenuimSessions/system.properties");
	prop.load(fis);//LOAD is amethod used to load the system properties
	
	System.out.println(prop.getProperty("name"));//printing the name
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
			 driver =new FirefoxDriver();}
			driver.get(url);
		}
	

		
	
	}


