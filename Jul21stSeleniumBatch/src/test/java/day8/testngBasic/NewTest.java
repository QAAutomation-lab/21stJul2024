package day8.testngBasic;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
  @Test
  public void testcase1() {
	  System.out.println("Created PIM");
  }
  @Test
  public void testcase2() {
	  System.out.println("Update PIM");
  }
  @Test
  public void testcase3() {
	  System.out.println("Delete PIM");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("BeforeMethod- Login successfully...");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("AfterMethod- logout successfully...");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("BeforeClass- Open browser");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("AfterClass- close broeser");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("BeforeTest- Get user details");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("AfterTest- Distroy all created users");
  }
}
/*
S - BeforeSuite/AfterSuite
T - BeforeTest/AfterTest
C - BeforeClass/AfterClass
M - BeforeMethod/AfterMethod
*/