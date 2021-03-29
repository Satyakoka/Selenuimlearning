package SelenuimSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HtmlUnitDriverConcept {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "/Users/ksv/Downloads/chromedriver");
		//WebDriver driver =new ChromeDriver();
		
		WebDriver driver= new HtmlUnitDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		driver.get("http://freecrm.com/");
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);//SELENUIM waits for 40 sec for the page to load
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 //new WebDriverWait(driver, 20).until(ExpectedConditions.titleContains("CR"));
	        System.out.println(driver.getTitle());
		
	System.out.println("the title before login:"+ driver.getTitle());
	
	driver.findElement(By.xpath("//span[contains(text(),'Log In')]")).click();
	
	System.out.println("dhDGMMshd");
	
driver.findElement(By.name("email")).sendKeys("tejomayi.koka@gmail.com");

//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("tejomayi.koka@gmail.com");

System.out.println("IS IT POSSIBLE");

driver.findElement(By.name("password")).sendKeys("S@nthosh2");
driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();



System.out.println("the title after login:"+ driver.getTitle());
	}

}
