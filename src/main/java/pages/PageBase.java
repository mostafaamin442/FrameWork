package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageBase {
	
	public WebDriver driver;
	public Select select;
	
	public PageBase(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}


