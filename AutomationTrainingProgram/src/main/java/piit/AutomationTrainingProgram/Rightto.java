package piit.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Rightto {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
							
			System.setProperty("webdriver.chrome.driver","C:\\Users\\olkin\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.navigate().to("https://deluxe-menu.com/popup-mode-sample.html");
			driver.manage().window().maximize();
			WebElement Picture=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td/div/table/tbody/tr/td/p/img"));
			//"//*[@style='cursor:pointer;']
			Actions ob=new Actions(driver);
			ob.contextClick(Picture);
			
	}

}
