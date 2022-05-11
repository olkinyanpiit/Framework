package piit.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PizzaHutHW {


	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\olkin\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.pizzahut.com");
		driver.manage().window().maximize();
		WebElement Menue=driver.findElement(By.id("menu"));
		Menue.click();
		Thread.sleep(2000);
		WebElement Pizza=driver.findElement(By.linkText("Pizza"));
		Pizza.click();
		Thread.sleep(2000);
		WebElement PopularPizzas=driver.findElement(By.linkText("Popular Pizzas"));
		PopularPizzas.click();
		Thread.sleep(2000);
		WebElement CheesePizza=driver.findElement(By.linkText("Order Now"));
		CheesePizza.click();
		Thread.sleep(2000);
		WebElement Delivery=driver.findElement(By.xpath("//*[text()='Delivery']"));
		Delivery.click();
		Thread.sleep(2000);
		WebElement Address=driver.findElement(By.name("deliveryStreet"));
		Address.sendKeys("7622 Old Georgetown rd");
		Thread.sleep(2000);
		
		WebElement City=driver.findElement(By.name("deliveryCity"));
		City.sendKeys("Bethesda");
		Thread.sleep(2000);
		
		WebElement State=driver.findElement(By.name("deliveryState"));
		Select ob=new Select(State);
		ob.selectByVisibleText("MD");
		
		
		WebElement Zipcode=driver.findElement(By.name("deliveryZip"));
		Zipcode.sendKeys("20814");
		Thread.sleep(2000);
		
		WebElement FindStore=driver.findElement(By.linkText("Find A Store"));
		FindStore.click();
		
		
		
		
		
	}
}

