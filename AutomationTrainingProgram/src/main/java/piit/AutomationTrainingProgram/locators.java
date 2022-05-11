package piit.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\olkin\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
		driver.manage().window().maximize();
		WebElement searchfieldtxt= driver.findElement(By.name("field-keywords"));
		searchfieldtxt.sendKeys("Computer");
		WebElement Searchicon=	driver.findElement(By.id("nav-search-submit-button"));
		//save the locator into variable so we can reuse it again
		Searchicon.click();
		WebElement linktxt = driver.findElement(By.linkText("Registry"));
		linktxt.click();
		WebElement partiallinktxt= driver.findElement(By.partialLinkText("Today's"));
		partiallinktxt.click();
		
		
	
		
		
		
		
		
	}

}
