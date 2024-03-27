package com.ITlearn.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browserfactory {
 
	
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
}
