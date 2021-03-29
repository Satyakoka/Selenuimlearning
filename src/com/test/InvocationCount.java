package com.test;

import org.testng.annotations.Test;

public class InvocationCount {
	@Test(invocationCount=10)//INVOCATION COUNT IS USED WHEN WE WANT TO RUN THE SAME TEST CASE AGAIN FOR NUMBER OF TIMES
	public void add() {
		int a =10;
		int b=20;
		int c=a+b;
		System.out.println("result is ="+c);
}
}