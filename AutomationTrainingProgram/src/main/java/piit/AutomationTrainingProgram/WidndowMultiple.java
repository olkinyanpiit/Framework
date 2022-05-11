package piit.AutomationTrainingProgram;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.collect.Iterators;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class WidndowMultiple {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\olkin\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
		driver.manage().window().maximize();
		Actions ob=new Actions(driver);
		WebElement newreleaseslinks=driver.findElement(By.linkText("New Releases"));
		ob.keyDown(Keys.SHIFT).build().perform();
		newreleaseslinks.click();
		ob.keyUp(Keys.SHIFT).build().perform();
		driver.getWindowHandle();
		Set<String> windowhandles= driver.getWindowHandles();
		Iterator<String> iterators=windowhandles.iterator();
		String Parent= iterators.next();
		String Secondwindow= iterators.next();
		System.out.println("This is Parent Window="+Parent);
		System.out.println("This is Second Window="+Secondwindow);
		driver.switchTo().window(Secondwindow);
		WebElement Products=driver.findElement(By.linkText("Camera & Photo Products"));
		Thread.sleep(2000);
		Products.click();
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
