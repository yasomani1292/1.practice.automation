package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BusListPage extends BasePage {

	public BusListPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	@FindBy(xpath="//div[@id='sorter-service-count']//span[@class='buses-availability']")
	private WebElement txtBusAvailbility;
	
	public void isBusAvailabilityTextDisplayed()
	{
		isDispalyed(txtBusAvailbility);
	}
}
