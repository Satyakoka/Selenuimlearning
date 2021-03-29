package SelenuimSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class safarilaunch {

	public static void main(String[] args) {
		
	/*NO NEED TO USE SYSTEM.SET PROPPERTY FOR LAUNCHING SAFARI BCOZ SAFARI DOESNT
		HAVE ANY EXECUTABLE FILE 
		But we need to allow or enable the remote automation option is safari===develop menu
		
		*/
		
		WebDriver driver = new SafariDriver();
		driver.get("http://www.amazon.com");
		System.out.println(driver.getTitle());
		driver.quit();

	}
}