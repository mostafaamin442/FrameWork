package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public  WebDriver driver;

	@BeforeSuite
	public void StartDriver(@Optional("chrome") String browsername) {
		if (browsername.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else if (browsername.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		driver.navigate().to("https://www.nopcommerce.com/en/register?returnUrl=%2Fen%2Fdemo"); 
	}
}
