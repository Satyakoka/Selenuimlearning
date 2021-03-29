package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//TestNG Annotation is a piece of code which is inserted inside a program or business logic used to control 
//the flow of execution of test methods.


/*@Before Suite: setup system properties for chrome 
@BeforeTest :launch browser
@BeforeClass: login to the page
@Before Method: Enter the URL
@Test3 :google logo test
@Aftermethod:  logout from app
@Before Method: Enter the URL
@Test1: google title test
@Aftermethod:  logout from app
@Before Method: Enter the URL
@Test2:  Search Test
@Aftermethod:  logout from app
@AfterClass: close the browser
AfterTest:  delete the cookies
PASSED: googleLogoTest
PASSED: googleTitleTest
PASSED: sear
Note:in above results the pair would be(the tests can be executed in alphabetical order)
         //PAIR1
          * 
@Before Method: Enter the URL
@Test3 :google logo test
@Aftermethod:  logout from app
//         PAIR 2

 *@Before Method: Enter the URL
@Test1: google title test
           //PAIR 3
 */ //Before Method: Enter the URL
 //@Test2:  Search Test
// @Aftermethod:  logout from a

public class TestNgBasics {
	
	                      //PRECONDITION ANNOTATIONS====starting with before suite
	
	@BeforeSuite
public void setUp(){
		System.out.println(" @Before Suite: setup system properties for chrome ");
	
}
	@BeforeTest
	public void  launchBrowser() {
		System.out.println("@BeforeTest :launch browser");
		
	}
	@BeforeClass
	public void login() {
		System.out.println("@BeforeClass: login to the page");
	}
	@BeforeMethod
	public void  enterURL() {
		System.out.println("@Before Method: Enter the URL");
	}
	
	
	
	                       //TEST CASES (starts with @Test)
	@Test
	public void googleTitleTest() {
		System.out.println("@Test1:  google title test");
	}
	@Test
	public void searchTest() {
		System.out.println("@Test2:  Search Test");
	}
	@Test
	public void googleLogoTest() {
		System.out.println("@Test3 :google logo test");
		

                        //POST CONDITIONS(starts with @After)
	}
	@AfterMethod
	public void logOut() {
		System.out.println("@Aftermethod:  logout from app");
		
		}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("@AfterClass: close the browser");
	}
	@AfterTest
	public void deleteCookies() {
		System.out.println("AfterTest:  delete the cookies");
		
		
		
		
		
		
		
		
	}
	

}
