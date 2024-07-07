package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.BusListPage;
import pages.SearchPage;

public class SearchPageTest extends BaseTest {

	private WebDriver driver;
	private SearchPage searchPage;
	private BusListPage busListPage;

	@BeforeMethod
	public void setUp() {
		driver = openBrowser();
		launchURL();
		searchPage = new SearchPage(driver);
		busListPage = new BusListPage(driver);
	}

	@Test(dataProvider = "travelTestData")
	public void verifySearchBusDetails(String fromCity, String toCity) throws InterruptedException {
		searchPage.enterSearchBusDetails(fromCity, toCity).clickSearchBtn().isBusAvailabilityTextDisplayed();
		busListPage.isBusAvailabilityTextDisplayed();

	}

	@DataProvider(name = "travelTestData")
	public Object[][] getJourneyDetails() {
		Object[][] station = new Object[][] {{ "Bangalore", "Chennai" }};
		return station;
	}

	@AfterMethod
	public void clear() {
		closeBrowser();
	}
}
