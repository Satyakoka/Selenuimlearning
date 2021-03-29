package com.test;

import org.testng.annotations.Test;

public class TestNgFeatures {

	//feature1: dependsOnMethod("if a method is depending on another method we use this,if the method fails tha dependent method will be skipped)
	
	@Test
	public void launchBrowser() {
		 int i=12/0;
	}
	@Test(dependsOnMethods="launchBrowser")
	public void login() {
		System.out.println("This method is dependent on launchBrowser method");
	}
}
