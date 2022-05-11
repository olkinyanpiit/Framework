package piit.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.tracing.Span;

public class Homework {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\olkin\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.homedepot.com/");
		driver.manage().window().maximize();
		WebElement MyAccount=driver.findElement(By.id("headerMyAccount"));
		MyAccount.click();
		Thread.sleep(2000);
		WebElement Register=driver.findElement(By.xpath("//*[text()='Register']"));
		Register.click();
		WebElement PersonalAccount=driver.findElement(By.xpath("//*[text()='Select & Continue']"));
		PersonalAccount.click();
		Thread.sleep(2000);
		
		WebElement Email=driver.findElement(By.name("email"));
		Email.sendKeys("email@gmail.com");
		Thread.sleep(2000);
		
		WebElement Password=driver.findElement(By.name("password"));
		Password.sendKeys("Ab@123456");
		Thread.sleep(2000);
		
		WebElement Zipcode=driver.findElement(By.name("zipcode"));
		Zipcode.sendKeys("20814");
		Thread.sleep(2000);
		
		WebElement Phone=driver.findElement(By.name("phone"));
		Phone.sendKeys("123-456-7890");
		Thread.sleep(2000);
		
		WebElement Keepmesignedin=driver.findElement(By.cssSelector("Label[for='kmsi-checkbox']"));
		Keepmesignedin.click();
		Thread.sleep(2000);
		
		WebElement Verify=driver.findElement(By.cssSelector("Label[for='verify-phone-checkbox']"));
		Verify.click();
		Thread.sleep(2000);
		
		/*WebElement NotRobot=driver.findElement(By.id("rc-anchor-container"));
		NotRobot.click();
		Thread.sleep(2000);*/
		
		/*WebElement Submit=driver.findElement(By.xpath("//*[text()='registrationCreateAnAccountButton']"));
		Submit.click();*/
		
		WebElement Submit=driver.findElement(By.linkText("Create an Account"));
		Submit.click();
		
		
	
		
		
		
		
		

	}
	
}
