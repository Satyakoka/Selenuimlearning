package SelenuimSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/ksv/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//maximixe the screen
		driver.manage().deleteAllCookies();//delete the cookies
		driver.get("https://jqueryui.com/droppable/");
		Actions action =new Actions(driver);
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		action.clickAndHold(driver.findElement(By.xpath("//p[contains(text(),'Drag me to my target')]"))).moveToElement(driver.findElement(By.xpath("//div[@id='droppable']"))).build().perform();
		
		
	}

}
