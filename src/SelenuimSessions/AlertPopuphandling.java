package SelenuimSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopuphandling {

	public static void main(String[] args) throws InterruptedException {//throws need to be added when we are using thread.sleep in below code
		
		System.setProperty("webdriver.chrome.driver", "/Users/ksv/Downloads/chromedriver");
		WebDriver driver =new ChromeDriver(); //laUNCHING CHROMEDRIVER
		
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");//GETTING THE URL
	
	driver.findElement(By.name("proceed")).click();//SPYING THE SIGN IN BUTTON BY FINDING CLASSNAME
	  Thread.sleep(1000);// it adds the wait time for the screen 
	
	/*Here we need to perform two actions
	 * 1.need to switch the screens from main window to the popup window
	2.get the text of the popup
	3. Then click on ok button
	*/
	
	  Alert alert =driver.switchTo().alert();//switching the control from main screen to alert screen{ switchto()&alert() are def methods}We r creating
	  //an alert object ,Also add the Alert default API
	  
	  
      alert.getText();//getText() is a default method to get the text of alert
      
      System.out.println(alert.getText());
      
      alert.accept();//click on the ok button
   // alert.dismiss();//to click on cancel button
String text = alert.getText();
      
    
      
     
      
      if (text.equals("Please enter a valid user name")){
      System.out.println("correct");
      }
      else {
    	  System.out.println("wrongtext");
    	  }

      alert.accept();//click on the ok button
	}

}
