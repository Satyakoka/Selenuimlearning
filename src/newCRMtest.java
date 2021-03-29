import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class newCRMtest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/ksv/Downloads/chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://ui.cogmento.com");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("tejomayi.koka@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("S@nthosh2");
		
		
		driver.findElement(By.linkText("Sign Up")).click();
		//driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		


	}

}
