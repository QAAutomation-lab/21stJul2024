package day8.testngBasic;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Precondition {
  @Test
  public void testCase1() {
	  System.out.println("Login done");
  }
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("***************Test user created successfully******************");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("***************Test user deleted successfully******************");
	  
  }

}
