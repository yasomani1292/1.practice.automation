package tests;

import org.testng.annotations.BeforeSuite;

import utils.DriverUtils;

public class BaseTest extends DriverUtils {
	
	
	@BeforeSuite
	public void beforesuite()
	{
		String currentDirectory = System.getProperty("user.dir");
		
	}
	public static void main(String[] args) {
		String currentDirectory = System.getProperty("user.dir");
		String log4jFilePath = currentDirectory + "\\log4j.properties";
		System.out.println(currentDirectory + "\\log4j.properties");
	}
}
