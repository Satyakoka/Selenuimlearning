package SelenuimSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTableHandling {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "/Users/ksv/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("https://ui.cogmento.com/");
		driver.findElement(By.name("email")).sendKeys("tejomayi.koka@gmail.com");
		driver.findElement(By.name("password")).sendKeys("S@nthosh2");
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();
		//driver.findElement(By.xpath("////body/div[@id='ui']/div[@class='ui fluid container']/div[@class='ui fluid container']/div[@id='main-content']/div[contains(@class,'ui fluid container')]/div[@class='ui fluid container main-content']/div[@class='table-wrapper']/table[@class='ui celled sortable striped table custom-grid']/tbody/tr[@class='active']/td[1]")).click();
				
		//driver.findElement(By.xpath("//a[contains(text(),'David paul')]")).click();
		driver.findElement(By.partialLinkText("David pa")).click();
	}

}
//a[contains(text(),'David paul')]
////a[contains(text(),'David paul')]