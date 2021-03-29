package SelenuimSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AmazonTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/ksv/Downloads/chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fsign%2Fs%3Fk%3Dsign%2Bin%26ref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
driver.findElement(By.id("ap_email")).sendKeys("tejomayi.koka@gmail.com");
driver.findElement(By.id("continue")).click();
driver.findElement(By.id("ap_password")).sendKeys("saivihaan");
driver.findElement(By.id("signInSubmit")).click();
Thread.sleep(2000);
Actions action = new Actions(driver);
action.moveToElement(driver.findElement(By.xpath("//span[@class='nav-line-2 nav-long-width']"))).build().perform();
//driver.findElement(By.xpath("//span[contains(text(),'Sign Out')]")).click();


//Select select = new Select(driver.findElement(By.className("nav-line-2 nav-long-width")));
//select.selectByVisibleText("SignOut");

//driver.findElement(By.linkText("SignOut")).click();
	}

}
////span[@class='nav-line-2 nav-long-width']