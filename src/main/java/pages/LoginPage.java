package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{

	public LoginPage (WebDriver driver) {

		super(driver); 

	}

	@FindBy(id="email")
	WebElement Email;

	@FindBy(xpath="//*[@id=\"form_submit\"]/i")
	WebElement pass;

	public void Login(String email) {

		Email.sendKeys(email); 
		pass.click(); 

	}
}
