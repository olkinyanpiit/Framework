package piit.AutomationTrainingProgram;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Execution {
  @Test//5
  public void f() {
	  System.out.println("This is test annotation");
  }
  @BeforeMethod//6
  public void beforeMethod() {
	  System.out.println("This is before method annotation");
  }

  @AfterMethod//7
  public void afterMethod() {
	  System.out.println("This is after method annotation");
  }
  @Test
  public void test2() {
	  System.out.println("This is test2");
  }
  
    

  @BeforeClass//3
  public void beforeClass() {
	  System.out.println("This is before class annotation");
  }

  @AfterClass//8
  public void afterClass() {
	  System.out.println("This is after class annotation");
  }

  @BeforeTest//2
  public void beforeTest() {
	  System.out.println("This is before Test annotation");
  }

  @AfterTest//9
  public void afterTest() {
	  System.out.println("This is after Test annotation");
  }

  @BeforeSuite//1
  public void beforeSuite() {
	  System.out.println("This is before Suite annotation");
  }

  @AfterSuite//10
  public void afterSuite() {
	  System.out.println("This is after Suite annotation");
  }

}
