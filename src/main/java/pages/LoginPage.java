package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class LoginPage extends PageBase{

	public LoginPage (WebDriver driver) {

		super(driver); 

	}

	@FindBy(id="FirstName")
	WebElement FirstName;

	@FindBy(id="LastName")
	WebElement LastName;
	
	@FindBy(id="Email")
	WebElement Email;
	
	@FindBy(id="ConfirmEmail")
	WebElement ConfirmEmail;
	
	@FindBy(id="Username")
	WebElement Username;
	
	@FindBy(id="Password")
	WebElement Password;
	
	@FindBy(id="ConfirmPassword")
	WebElement ConfirmPassword;
	
	@FindBy(id="Details_CompanyIndustryId")
	WebElement DetailsCompanyIndustryId;
	
	@FindBy(id="Details_NopCommerceIntendedUseText")
	WebElement Option;
	
	@FindBy(id="Details_CompanyRoleId")
	WebElement DetailsCompanyRoleId;
	
	@FindBy(id="Details_KindOfExistingStoreId")
	WebElement DetailsKindOfExistingStoreId;
	
	@FindBy(id="Details_CompanyBusinessModelId")
	WebElement DetailsCompanyBusinessModelId;
	
	@FindBy(id="Details_CompanySizeId")
	WebElement DetailsCompanySizeId;
	
	@FindBy(id="register-button")
	WebElement registerButton;
	
	
	
	

	public void Login(String firstname , String lastname , String email , String confirmemail , String username , String pass , String confirmpass , String option) throws InterruptedException {

		
		FirstName.sendKeys(firstname);
		Thread.sleep(1000);
		
		LastName.sendKeys(lastname);
		Thread.sleep(1000);

		Email.sendKeys(email);
		Thread.sleep(1000);

		ConfirmEmail.sendKeys(confirmemail);
		Thread.sleep(1000);

		Username.sendKeys(username);
		Thread.sleep(1000);

		Password.sendKeys(pass);
		Thread.sleep(1000);

		ConfirmPassword.sendKeys(confirmpass);
		Thread.sleep(1000);
		
		select = new Select(DetailsCompanyIndustryId);
        select.selectByIndex(1);
		Thread.sleep(1000);

		select = new Select(DetailsCompanyRoleId);
        select.selectByIndex(1);
		Thread.sleep(1000);
		
		select = new Select(DetailsKindOfExistingStoreId);
        select.selectByIndex(1);
		Thread.sleep(1000);
		
		select = new Select(DetailsCompanyBusinessModelId);
        select.selectByIndex(1);
		Thread.sleep(1000);
		
        select = new Select(DetailsCompanySizeId);
        select.selectByIndex(1);
        
        registerButton.click();

		
	
	}
}
