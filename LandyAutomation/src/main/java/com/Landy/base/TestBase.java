package com.Landy.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Landy.util.TestUtil;
import com.Landy.util.WebEventListener;

import dev.failsafe.event.EventListener;
 

public class TestBase 
 {
	
	// Initialized all the properties here
	
	public static WebDriver driver ;
	public static Properties prop;
	
	static EventFiringWebDriver e_driver;
	static WebEventListener eventListner;
	
	public TestBase() throws IOException
	{
		// Read the properties and initialed 
		prop  = new Properties();
		 FileInputStream ip = new FileInputStream("C:/Users/Admin/eclipse-workspace/LandyAutomation/src/main/java/com/Landy/config/config.properties");
		 prop.load(ip);
	}
	
	
	public static void initialization() throws IOException {
		// Read the properties 
		String BrowserName = prop.getProperty("browser");
		
		if(BrowserName.equals("chrome"))
		{
			// define the system propetries 
			 
			 System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/eclipse-workspace/LandyAutomation/chromDrive101/chromedriver.exe");
			  driver = new ChromeDriver(); // launch the browser
		}
		
		else if (BrowserName.equals("FireFox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:/Users/Admin/eclipse-workspace/LandyAutomation/Drivers/chromedriver.exe");
			driver  = new FirefoxDriver();
		}
		
		e_driver = new EventFiringWebDriver(driver);
		eventListner = new WebEventListener();
		e_driver.register(eventListner);
		driver=e_driver;
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		 
	 
		
		// Launch the url
		driver.get(prop.getProperty("url"));
	}
	
	public void scrolldown()
	{
		((JavascriptExecutor)driver).executeScript("scroll(0,600)");
	}


 }


