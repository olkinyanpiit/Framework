package piit.AutomationTrainingProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;



public class ChromeBrowsersDriver {
	static WebDriver driver;
		
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\olkin\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		//thread.sleep(3000) is a 3 seconds waiting time between actions. 
		driver.navigate().forward();
		driver.navigate().refresh();
		String ur= driver.getCurrentUrl();
		System.out.println(ur);
		String windowhandle=driver.getWindowHandle();
		System.out.println(windowhandle);
		driver.quit();
		//or we can also use driver.close(); 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
