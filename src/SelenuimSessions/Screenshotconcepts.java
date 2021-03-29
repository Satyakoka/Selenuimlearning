package SelenuimSessions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.apache.commons.io.*;

public class Screenshotconcepts {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "/Users/ksv/Downloads/chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//  we are using the below methods in stead of THREAD(bcoz it has disadv 
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);//SELENUIM waits for 40 sec for the page to load
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);//Selenium  waits for 20 sec for the elements to load and display
		driver.get("https://www.google.com/");
		
		
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);//there is method called getScreenshotAs will give u on efile object ,but will topcasting into take screenshot class
		//Takes screenshot is an interface
		
		//System.out.println("Source file " + src);//src is a file obj
		//FileUtils.co
		FileUtils.copyFile(src,new File("/Users/ksv/Desktop/sdet manual testing/wish_page.jpg"));//src is a file obj, screenshot will be saved in the location we mentioned
		
		//FileUtils.copyFileToDirectory(src, new File("/Users/ksv/Desktop/sdet manual testing"));
		
		

	}

}
