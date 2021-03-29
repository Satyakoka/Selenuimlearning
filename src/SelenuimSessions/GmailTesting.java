package SelenuimSessions;

import java.util.Collections;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.htmlunit.HtmlUnitDriver;
//import org.openqa.selenium.safari.SafariDriver;

public class GmailTesting {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/ksv/Downloads/chromedriver");
		ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.setExperimentalOption("useAutomationExtension", false);
        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
        WebDriver driver =  new ChromeDriver(options);
        driver.get("https://accounts.google.com/signin");
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='identifierId']"))).sendKeys("tejomayi.koka@gmail.com");
        driver.findElement(By.id("identifierNext")).click();
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='password']"))).sendKeys("dkjhgw");
        driver.findElement(By.id("passwordNext")).click();
        System.out.println(driver.getTitle());
        /*
		WebDriver driver =new ChromeDriver();
		WebDriver driver= new HtmlUnitDriver();
		
		WebDriver driver = new SafariDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&osid=1&service=mail&ss=1&ltmpl=default&rm=false&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.navigate().to("http://mail.google.com");
		driver.get("https://accounts.google.com/signin/v2/identifier?passive=1209600&continue=https%3A%2F%2Faccounts.google.com%2F&followup=https%3A%2F%2Faccounts.google.com%2F&flowName=GlifWebSignIn&flowEntry=ServiceLoginest");
		driver.getTitle();
		System.out.println("the title before login:"+ driver.getTitle());
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.findElement(By.id("identifierId")).sendKeys("santuparimi86@gmail.com");
		driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.className("whsOnd zHQkBf")).sendKeys("shdjkshgdkfhj");
		driver.findElement(By.className("VfPpkd-RLmnJb")).click();
		Thread.sleep(3000);
		*/
	}
}
