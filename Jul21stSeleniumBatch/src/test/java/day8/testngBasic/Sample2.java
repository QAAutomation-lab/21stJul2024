package day8.testngBasic;

import org.testng.annotations.Test;

public class Sample2 {
	
	@Test
	public void testCase2() {
		System.out.println("Hello, I am TC2...");
	}
	@Test
	public void testCase1() {
		System.out.println("Hello, I am TC1...");
	}
	@Test
	public void testCase3() {
		System.out.println("Hello, I am TC3...");
	}
}
/*
TestNG method will not have main()
	- execution will controlled by @Test method
	- @Test method should be public nonstatic with void return type
	
	- a testng class can have multiple @Test method in such cases, all Test method will be executed in alphabetical order
	- in java console
			Tests run - indicates how many @Test methods are triggered
			Total tests run - indicates total how many times @Test methods are triggered
			
*/