package day8.testngBasic;

import org.testng.annotations.Test;

import utilities.SeleniumUtil;

public class Example1 extends SeleniumUtil {
	
	@Test
	public void testGoogle() {
		setUp("chrome", "https://www.google.com");
		driver.close();
	}
}
