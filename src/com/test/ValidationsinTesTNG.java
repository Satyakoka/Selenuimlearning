package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValidationsinTesTNG {
	WebDriver driver;//we have written this bcoz we can use this driver objevct in all the methods
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "/Users/ksv/Downloads/chromedriver");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
	}
	//for validating we use ASSERTION(we have a class Assert and assertEquals method)
	@Test
	public void googleTitleTest() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "Google1234","This is not expected title");//here am validating by giving the wrong title
		
}
	@Test
	public void googleLogoTest() {
		boolean b =driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
		//Assert.assertEquals(b, driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed(),"This is expected logo");
		//Assert.assertEquals(b, driver.findElement(By.xpath("//img[@id='hplogo66']")).isDisplayed(),"This is expected logo");
		Assert.assertFalse(b);
}}