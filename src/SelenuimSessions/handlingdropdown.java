package SelenuimSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class handlingdropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/ksv/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.txdmv.gov/");
		
		driver.getTitle();
		System.out.println(driver.getTitle());
		//HOW TO HANDLE DROP BOX
		//1.we handle it by SELECT class which is default in selenium ,so import from se
		//2.create an object for the select class
		//3.In the object we need to pass the webelement,to perform action
		//4.
Select select = new Select(driver.findElement(By.id("gtranslate-dropdown-636554985")));
select.selectByVisibleText("Spanish");
	}

}
