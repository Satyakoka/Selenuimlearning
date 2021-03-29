package com.test;

import org.testng.annotations.Test;

public class ExceptionTimeOut {
	//invocation time out is used when we have any infinite loop in our test cases and when we want to teminate after some time
	/*@Test(invocationTimeOut=2)
	
	public void infiniteloop(){
		int i=1;
		while(i==1) {
			System.out.println(i);
		}*/
	//}

@Test(expectedExceptions=NumberFormatException.class)
public void exceptionhandling() {
	String x ="200A";
	Integer.parseInt(x);
}
}