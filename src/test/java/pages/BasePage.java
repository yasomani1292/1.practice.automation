package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;

import freemarker.log.Logger;
import tests.BaseTest;
import utils.DriverUtils;

public class BasePage extends DriverUtils {

	WebDriver driver;
	
	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	@BeforeSuite
	public void beforesuite()
	{
		String currentDirectory = System.getProperty("user.dir");
		
	}
	
}
