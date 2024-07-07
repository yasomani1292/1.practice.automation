package utils;

import java.time.Duration;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class DriverUtils {

	WebDriver driver;

	public WebDriver openBrowser() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		sleep(10);
		return driver;
	}

	public DriverUtils launchURL() {
		driver.get("https://www.abhibus.com/");
		return this;
	}

	public DriverUtils setText(WebElement e, String input) {
		waitForElementToBeClickable(e);
		e.clear();
		e.sendKeys(input);
		return this;
	}

	public DriverUtils click(WebElement e) {
		e.click();
		return this;
	}

	public DriverUtils waitForElementToBeClickable(WebElement e) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(15))
				.pollingEvery(Duration.ofSeconds(1))
				.ignoring(StaleElementReferenceException.class)
				.ignoring(ElementClickInterceptedException.class);
		wait.until(ExpectedConditions.elementToBeClickable(e));
		return this;
	}
	

	public boolean isDispalyed(WebElement e) {
		return e.isDisplayed();
	}

	public void closeBrowser() {
		driver.quit();

	}

	public void sleep(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
