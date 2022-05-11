package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage {
	WebDriver driver;
	@FindBy(name="email") WebElement Id;
	@FindBy(name="did_submit") WebElement Searchbuttonclick;
	@FindBy(xpath= "//*[contains(text(),'Please enter your email')]") WebElement Question;
	
	
	
	public ForgotPasswordPage(WebDriver driver) {
		this.driver=driver;
	PageFactory.initElements(driver, this);
	
	}
public void IdsSendKeys() {
	Id.sendKeys("Anna@gmail.com");
}
public void SearchButtonClick() {
	Searchbuttonclick.click();
	


}
public String QuestionOfText() {
String Questions=Question.getText();
return Questions;

}
}
