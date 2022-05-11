package piit.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LocatorXpath {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C:\\Users\\olkin\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.navigate().to("https://www.amazon.com");
	driver.manage().window().maximize();
		
	WebElement searchtofield= driver.findElement(By.xpath("//input[@aria-label='Search']"));
	searchtofield.sendKeys("desktop");
			
	WebElement searchtoclick= driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/form/div/div/span/input"));
	searchtoclick.click();
	
	WebElement searchlinkname= driver.findElement(By.xpath("//a[text()='New Releases'][1])");
	searchlinkname.click();
	
	
	
	
	
	
	
	
	}

}
