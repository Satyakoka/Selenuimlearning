package SelenuimSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.remote.RemoteWebDriver;

//import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;

//import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;


public class JavaScripExecutorConcept {

	public static void main(String[] args) {
		/*  ADVANTAGES OF JAVA SCRIPT EXECUTOR
		 * 1.java script exec boosts up the SE by its features for performane
		 * when html and DOM are not working and ide is complex then this helps
		 * if we want to HIGHLKIGHT ,S CROLL UP AND DOWN,SCREENSHOT WITH BORDER
		 * PONTING THE BUG WHICHBWE DO using paint in manual tetsing
		 * clicking on specific link and button
		
		*/
		
		System.setProperty("webdriver.chrome.driver", "/Users/ksv/Downloads/chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://ui.cogmento.com/");
		driver.findElement(By.name("email")).sendKeys("tejomayi.koka@gmail.com");
		driver.findElement(By.name("password")).sendKeys("S@nthosh2");
		//driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		
		
		         //SCENARIO 1 :we dont click on login button but we hightlight it(this feature is there in QTP(.highlight method(())
		WebElement loginBtn = driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']"));
		
		flash(loginBtn ,driver);
	}
		public static void flash(WebElement element ,WebDriver driver)
		{
			//JavaScriptExecutor js =((JavaScriptExecutor) driver);
			String bgcolor =element.getCssValue("backgroundcolor");
			for(int i=0;i<100;i++) 
			{
				changeColor("rgb(0,200,0)",element,driver);
				changeColor(bgcolor,element,driver);
			}
			}
		
		public static void changeColor(String color,WebElement element,WebDriver driver)
		{
		JavascriptExecutor js =(JavascriptExecutor) driver;	
			
		js.executeScript("arguments[0].style.backgroundColor ='"+color+"'",element);
		
		try
		{
		Thread.sleep(20);}
		catch(InterruptedException e) {
		
		}

      }		
}
