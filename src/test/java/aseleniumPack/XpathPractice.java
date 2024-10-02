package aseleniumPack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class XpathPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.actitime.com/");
		driver.findElement(By.linkText("Try Free")).click();
		System.out.println("done");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.urlToBe("https://www.actitime.com/free-online-trial"));
		
		driver.findElement(By.id("FirstName")).sendKeys("yaso");
		driver.findElement(By.id("LastName")).sendKeys("jklj");
		driver.findElement(By.id("Email")).sendKeys("dezinnia@dezlearn.com");
		driver.findElement(By.id("Company")).sendKeys("DE ZINNIA");
		
			
	}

}
