package SelenuimSessions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DrawBorders {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "/Users/ksv/Downloads/chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("/Users/ksv/Desktop/sdet manual testing/border.jpg"));
		//drawBorder(loginBtn,driver);//please look ito this statement this program doesnt work
		//SCENARIO 4: GENERATING ALERT MESSAGE
		genearteAlert(driver,"There is an isuue in the login page");
	
		
	}
	public static void drawBorder(WebElement element,WebDriver driver) {//METHOD FOR DRAWING BORDER
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='3px solid red'", element);
		
		
	}
	public static void genearteAlert(WebDriver driver ,String message) {//METHOD FOR GENERATING ALERT
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("alert ('"+message+"')");
		
	}

}
