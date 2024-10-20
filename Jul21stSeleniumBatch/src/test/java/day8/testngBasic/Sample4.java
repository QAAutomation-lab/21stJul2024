package day8.testngBasic;

import org.testng.annotations.Test;

public class Sample4 {
	
	@Test(enabled=true, priority=1,description="This is my 2nd Test case")
	public void testCase2() {
		System.out.println("Hello, I am TC2...");
	}
	@Test(enabled=true,priority=2,invocationCount = 5)
	public void testCase1() {
		System.out.println("Hello, I am TC1...");
	}
	@Test(enabled=false)
	public void testCase3() {
		System.out.println("Hello, I am TC3...");
	}
	@Test(enabled=true, priority=3)
	public void testCase4() {
		System.out.println("Hello, I am TC4...");
		int num=10/0;
	}
	@Test(enabled=true, dependsOnMethods = "testCase4")
	public void testCase5() {
		System.out.println("Hello, I am TC5...");
	}
	@Test(enabled=true, priority=4, expectedExceptions = ArithmeticException.class)
	public void testCase6() {
		System.out.println("Hello, I am TC6...");
		int num=10/0;
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

	argument:
		enabled: by default true
		priority: by default '0'
*/