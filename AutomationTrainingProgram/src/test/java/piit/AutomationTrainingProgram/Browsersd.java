package piit.AutomationTrainingProgram;

import org.testng.annotations.Test;

import M.common.Utility;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Browsersd extends Utility {

	
  @Test
  public void f() {
	  WebElement id=driver.findElement(By.name("email"));
	  id.sendKeys("Anna@piit");
	  WebElement password=driver.findElement(By.name("pass"));
	  password.sendKeys("Abc@123456");
	  WebElement loginbutton=driver.findElement(By.name("login"));
	  loginbutton.click();
  
  
  }

}
