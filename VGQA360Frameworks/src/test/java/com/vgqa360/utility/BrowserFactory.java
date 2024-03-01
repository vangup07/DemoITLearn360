package com.vgqa360.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	public static WebDriver startAppliaction(WebDriver driver,String browserName,String url)
	{
	if (browserName.equals("chrome"))
	{
       System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}
	else if(browserName.equals("Firefox"))
	{
		System.setProperty("webdriver.gecko.driver","C:\\Program Files\\geckodriver.exe"); 
		 driver = new FirefoxDriver();
		 
	}
	
	 else if (browserName.equals("Edge"))
	 {
		 System.setProperty("webdriver.edge.driver", "C://EdgeDriver.exe");
		 driver = new EdgeDriver();
		 
	 }
	driver.manage().window().maximize();
	driver.get(url);
	
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		return driver;
	}

	public static WebDriver startAppliaction(WebDriver driver, String browser, Object stagingUrl) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void quitBrowser(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}
}
