package piit.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
					
			System.setProperty("webdriver.chrome.driver","C:\\Users\\olkin\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.navigate().to("https://jqueryui.com/");
			driver.manage().window().maximize();
			WebElement droppable=driver.findElement(By.linkText("Droppable"));
			droppable.click();
			driver.switchTo().frame(0);
			WebElement ElementToDrag=driver.findElement(By.id("draggable"));
			WebElement DropToHere=driver.findElement(By.id("droppable"));
			Actions ob=new Actions(driver);
			ob.dragAndDrop(ElementToDrag, DropToHere).build().perform();
			driver.switchTo().parentFrame();
			WebElement Sorting=driver.findElement(By.linkText("Sortable"));
			Sorting.click();
			
			
			

	}

}
