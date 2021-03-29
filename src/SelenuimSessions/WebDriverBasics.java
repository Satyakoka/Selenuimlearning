package SelenuimSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to launch firefox
		//System.setProperty("webdriver.gecko.driver", "/Users/ksv/Downloads/geckodriver");
	   // WebDriver driver = new FirefoxDriver();
	   
	      
	    System.setProperty("webdriver.chrome.driver", "/Users/ksv/Downloads/chromedriver");
	    //  Chrome driver() is a class which is implementing the WEBDRIVER interface,and driver is the parent ref variable
	    //below step is the concept of polymorphism
	    WebDriver driver =new ChromeDriver();//launch chrome(i.e sim ilar to manual testing)
	    driver.get("http://www.macys.com");//Entering the URL automatically like we go manually in manual testing
	    
	    String  title=driver.getTitle();//.getTitle() returns a string,i.e functions concept
	    System.out.println(title);//(we are getting the title name i.e google
	    
	    System.out.println(driver.getCurrentUrl());//its a inbuilt method to see the current url
	    System.out.println(driver.getPageSource());
	    
	           //validation
	    
	    if (title.equals("facebook.com"))//checking the title whetther we are getting the same titla as expected(i.e we do it manually)
	    {
	    	System.out.println("correct");
	    	
	    }
	    else {
	    	System.out.println("incorrect");
	    }
	    driver.quit();//to close the browser after all the operations are performed
	}

}
//ABOVE ALL STEPS ARE THE TEST CASES including validation point i.e the steps needed to follow to test the page