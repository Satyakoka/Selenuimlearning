package SelenuimSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class locatorsconcept {
	
	//THERE ARE TOTAL 8 LOCATORS IN SELENUIM

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/ksv/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Fpc%3Dtopnav-about-n-en&flowName=GlifWebSignIn&flowEntry=SignUp");
		//                                                            1.X-PATH(2nd priority if there is no heirarchy
		
// in below FINDELEMENT is a method available in the webdriver accessing through the ref variable driver
//in below BY is a class and XPATH is a method and SENDKEYS is also a method
		//oONLY RELATIVE XPATH SHOULD BE USED
		
		//driver.findElement(By.xpath("//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-dgl2Hf ksBjEc lKxP2d uRo0Xe TrZEUc']//div[@class='VfPpkd-RLmnJb']")).click();
		//driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("koka");	
		driver.findElement(By.id("firstName")).sendKeys("teja");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("koka");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tejakoka87");
		driver.findElement(By.xpath("//div[@id='confirm-passwd']//div[@class='aCsJod oJeWuf']//div[@class='aXBtI Wic03c']//div[@class='Xb9hP']//input[@type='password']")).sendKeys("S@nthosh10");
		driver.findElement(By.xpath("//div[@id='passwd']//div[@class='aCsJod oJeWuf']//div[@class='aXBtI Wic03c']//div[@class='Xb9hP']//input[@type='password']")).sendKeys("S@nthosh10");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		//driver.findElement(By.xpath("//div[@id='passwd']//div[@class='aCsJod oJeWuf']//div[@class='aXBtI Wic03c']//div[@class='Xb9hP']//input[@type='password']")).sendKeys("S@nthosh2");
		
		//                                                           2 .  ID(1st priority)
		
	
	
		
		                                    //                        3.NAME  (3rd priority)
		
		
		//driver.findElement(By.name("firstName")).sendKeys("jyo");
		//                                                        4.LINKs(when links are there)
		
		
		//driver.findElement(By.linkText("Sign in instead")).click();
		           //                                    5.partial link text(not use)
		
		//driver.findElement(By.partialLinkText("Sign in")).click();
		
		//...not recomended because the links path is interlinked with other links,if the linkls are
		//changed to diff place in ui then its a problem
		
		//                                 6.css Selector
		//if ID is there the css select will be #{id}(is the css selec)
		//if classname is there css selector would be {.classname}
		
		//driver.findElement(By.cssSelector("#firstName")).sendKeys("vihu");
		
		//           7.class name
		
		driver.findElement(By.className("VfPpkd-RLmnJb")).click();
		driver.switchTo().frame("iframe");
		//Select select = new Select(driver.findElement(By.xpath("//div[@class='e2CuFe eU809d']")));
		//select.selectByVisibleText("United states +1  ");
		//driver.findElement(By.className("Fy0Xbe SrKVbf")).click();
		//driver.findElement(By.cssSelector("#phoneNumberId")).sendKeys("+15855323523");
		System.out.println("Before number ++++");
		//WebElement ele = driver.findElement(By.xpath("//div[@class='rFrNMe RSJo4e N3Hzgf jjwyfe zKHdkd sdJrJc Tyc9J']"));
		//JavascriptExecutor jse = (JavascriptExecutor)driver;
		//jse.executeScript("arguments[0].click()", ele);
		//driver.findElement(By.cI("#phoneNumberId")).click();
		driver.findElement(By.className("whsOnd zHQkBf")).sendKeys("+15854852726");
		System.out.println(driver.getCurrentUrl());
		
		//driver.findElement(By.id("phoneNumberId")).sendKeys("5855323523");
		
		//just for gmail
		//driver.findElement(By.xpath("//input[@id='phoneNumberId']")).sendKeys("5855323523");
		//driver.findElement(By.xpath("//input[@id='code']")).sendKeys("G-766194");
		//driver.findElement(By.className("VfPpkd-RLmnJb")).click();//...this is not recomended bcoz clasnam can be duplicated
	}

}
