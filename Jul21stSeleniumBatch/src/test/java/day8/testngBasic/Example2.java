package day8.testngBasic;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.SeleniumUtil;

public class Example2 extends SeleniumUtil {
  @Test
  public void testActitimeLoginWithoutAssert() {
	  setUp("chrome", "https://online.actitime.com/ibm/login.do");
	  typeRequiredInput(driver.findElement(By.id("username")), "admin01");
	  typeRequiredInput(driver.findElement(By.name("pwd")), "admin01");
	  clickOnElement(driver.findElement(By.id("loginButton")));
	  String expectedTitle="actiTIME - Enter Time-Track";
	  String actualTitle=getAppTitle();
	  System.out.println("is login successful? "+actualTitle.equals(expectedTitle));
	  driver.close();
  }
  
  @Test
  public void testActitimeLoginWithAssert() {
	  setUp("chrome", "https://online.actitime.com/ibm/login.do");
	  typeRequiredInput(driver.findElement(By.id("username")), "admin01");
	  typeRequiredInput(driver.findElement(By.name("pwd")), "admin01");
	  clickOnElement(driver.findElement(By.id("loginButton")));
	  String expectedTitle="actiTIME - Enter Time-Track";
	  String actualTitle=getAppTitle();
	 // System.out.println("is login successful? "+actualTitle.equals(expectedTitle));
	 // Assert.assertEquals(actualTitle, expectedTitle);
	  Assert.assertEquals(actualTitle, expectedTitle,"Login failed due to page title changed or invalid user");
  }
  @Test
  public void testActitimeLoginWithAssert2() {
	  setUp("chrome", "https://online.actitime.com/ibm/login.do");
	  typeRequiredInput(driver.findElement(By.id("username")), "admin01");
	  typeRequiredInput(driver.findElement(By.name("pwd")), "admin01");
	  clickOnElement(driver.findElement(By.id("loginButton")));
	  String expectedTitle="actiTIME - Enter Time-Track";
	  String actualTitle=getAppTitle(expectedTitle);
	 // System.out.println("is login successful? "+actualTitle.equals(expectedTitle));
	 // Assert.assertEquals(actualTitle, expectedTitle);
	  Assert.assertEquals(actualTitle, expectedTitle,"Login failed due to page title changed or invalid user");
	  driver.close();
  }
  
  @Test
  public void testActitimeLoginUsernameField() {
	  setUp("chrome", "https://online.actitime.com/ibm/login.do");
	  boolean result=driver.findElement(By.id("username")).isDisplayed();
	//  Assert.assertTrue(result);
	  Assert.assertTrue(result,"Username input field not displayed");
	  driver.close();
  }
  
  @Test(timeOut = 10000)
  public void testActitimeCheckBox() {
	  setUp("chrome", "https://online.actitime.com/ibm/login.do");
	  boolean result=driver.findElement(By.name("remember")).isSelected();
	//  Assert.assertFalse(result);
	  Assert.assertFalse(result,"Either checkbox is not present or its already selected");
	  driver.close();
  }
}
/*
Assert.
		assertEquals(arg1, arg2);
		assertEquals(arg1, arg2,String msg);
		assertTrue(boolean cond); ---> return true is condition is pass else return false
		assertTrue(boolean cond,String msg);
		assertFalse(boolean cond);---> return false is condition is pass else return false
		assertFalse(boolean cond,String msg);


*/