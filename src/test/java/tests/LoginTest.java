package tests;

import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends TestBase {

	LoginPage object;


	@Test
	public void LoginTo() throws InterruptedException {

		object = new LoginPage(driver); 
		Thread.sleep(5000);
		object.Login("mostafaamin442@gmail.com"); 
		driver.navigate().back();
	} 



}


