package SelenuimSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/ksv/Downloads/chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://ui.cogmento.com/");
		driver.findElement(By.name("email")).sendKeys("tejomayi.koka@gmail.com");
		driver.findElement(By.name("password")).sendKeys("S@nthosh2");
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		Thread.sleep(3000);
		//driver.switchTo().frame("mainpanel");
		//driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();//dynamically we are writing our own X-PATH

		//driver.findElement(arg0)
	}

}
