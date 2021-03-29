package SelenuimSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibiltyTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/ksv/Downloads/chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://register.freecrm.com/register/");
		
		//ISDISPALYED method is applicable for all elements
	boolean b1=	driver.findElement(By.name("action")).isDisplayed();
	System.out.println(b1);
	
	//ISENABLEd method ()
	 boolean b2= driver.findElement(By.name("action")).isEnabled();
	 System.out.println(b2);
	 
	 //ISSELECTED()METHOD(only applicable for radiobutton,checkbox and dropdown)
	 
	
	 boolean b3 = driver.findElement(By.name("action")).isSelected();
	 System.out.println(b3);
	 
	 //SELECT I AGREE CHECKBOX THEN SEE WHETHER THE SIGNUP IS ENABLED OR NOT
	driver.findElement(By.name("terms")).click();

	 boolean b4= driver.findElement(By.name("action")).isEnabled();
	 System.out.println(b4);
	 
	 
	 //DESELECT THE CHECKBOX
	 
	 
	 driver.findElement(By.name("terms")).click();

	 boolean b5 =driver.findElement(By.name("action")).isSelected();
	 System.out.println(b5);
	 
	
	
		
	}

}
