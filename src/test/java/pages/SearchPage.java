package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends BasePage {

	private Logger logger = Logger.getLogger(this.getClass());

	public SearchPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(xpath = "//input[@placeholder='From Station']")
	private WebElement txtFromStation;

	@FindBy(xpath = "//li[contains(@class,'auto-complete-list')]//div[text()='Bangalore']")
	private WebElement lstFromStation;

	@FindBy(xpath = "//input[@placeholder='To Station']")
	private WebElement txtToStation;

	@FindBy(xpath = "//*[name()='small' and text()='Tamil Nadu']/ancestor::div[contains(@class,'row')]//div[text()='Chennai']")
	private WebElement lstToStation;

	@FindBy(xpath = "//input[@placeholder='Onward Journey Date']")
	private WebElement txtCalenderField;

	@FindBy(xpath = "//div[@class='container date ']//span[@class=' selected']")
	private WebElement btnPresentDate;

	@FindBy(xpath = "//button[text()='Search']")
	private WebElement btnSearch;

	public SearchPage enterFromStation(String fromStation) {
		setText(txtFromStation, fromStation);
		return this;
	}

	public SearchPage enterToStation(String toStation) {
		setText(txtFromStation, toStation);
		return this;
	}

	public SearchPage selectPresentDate() {
		click(txtCalenderField);
		click(btnPresentDate);
		return this;
	}

	public SearchPage enterSearchBusDetails(String from, String to) {
		setText(txtFromStation, from);
		click(lstFromStation);
		setText(txtToStation, to);
		click(lstToStation);
		click(txtCalenderField);
		click(btnPresentDate);
		logger.info("Filled Search Bus details");
		return this;
	}

	public BusListPage clickSearchBtn() {
		click(btnSearch);
		return new BusListPage(driver);
	}

}
