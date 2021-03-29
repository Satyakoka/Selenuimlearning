package SelenuimSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickByUsingJS {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/ksv/Downloads/chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://ui.cogmento.com/");
		driver.findElement(By.name("email")).sendKeys("tejomayi.koka@gmail.com");
		driver.findElement(By.name("password")).sendKeys("S@nthosh2");//JUST passing the wrong pwd to test
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		
		
		        
		WebElement loginBtn = driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']"));
		clickElementByJS(loginBtn,driver );//for click with js,we are passing the values in main method
		
		
		//driver.navigate().refresh();//REFRESH THE SCREEN USING SELENIUM

		 //refreshBrowserByJS(driver);// refresh using js
		 System.out.println(getTitleByJs(driver));// getting title using java script
		 System.out.println(getPageInnerText(driver));//to get the innertext
		 //driver.getPageSource();
		 //scrollPageDown(driver);//for scroll page
		WebElement forgotPwdLink = driver.findElement(By.xpath("//a[contains(text(),'Forgot your password?')]"));
		
		scrollIntoView( forgotPwdLink ,driver);
	}//                  4. SCENARIO FOR CLICK THE BUTTON USING JAVASCRIPT       
	    
	//we can use this click by js when sometimes our xpath of the button doesnt work or when we get stale element exception
	//bcoz JAVASCRIPT EXECUTOR  CLICK HIT THE JS LIBRARY IN HTML CODE IN LIBRARY DIRECTLY
	
	public static void clickElementByJS(WebElement element ,WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
		
	}
	//                    5.SCENARIO FOR REFRESING THE PAGE USING JAVA SCRIPT
	public static void refreshBrowserByJS(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("history.go(0)");//go o means the first history
		
	}
	//                   6. SCENARIO FOR GETTING THE TITLE USING JAVA SCRIPT
	public static String getTitleByJs(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 String title  =js.executeScript("return document.title;").toString();
		 return title;
		
	}
	                   //7.SCENARIO FOR GETTING THE PAGE INNER TEXT USING JS
	public  static String getPageInnerText(WebDriver driver)throws NullPointerException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 String pagetext =js.executeScript("return document.documentElement.innerText;").toString();
				 return pagetext;}
				 //all the above are DOM commands
				 /*The Document Object Model (DOM) is a programming interface for HTML and XML documents. It represents the page so that programs can change the document structure, 
				  * style, and content. ... 
				  * The DOM is an object-oriented representation of the web page, which can be modified with a scripting language such as JavaScript*/
				  
				       //8.SCENARIO FOR SCROLLING DOWN THE PAGE FROM TOP TO BOTTOM
				 public static void scrollPageDown(WebDriver driver){
				    	JavascriptExecutor js = ((JavascriptExecutor) driver);
				    	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
				 }
				 //9 SCROLL INTO VIEW(IF WE ARE IN A PAGE WE NEED TO SCROLL DOWN UNTILL WE REACH THAT ELEMENT(fb page till we want to reach our post)
				 
				 public static void scrollIntoView(WebElement element, WebDriver driver){
				    	JavascriptExecutor js = ((JavascriptExecutor) driver);
				    	js.executeScript("arguments[0].scrollIntoView(true);", element);
				    }
				    
				 
				 
				 
				 
	}
	


