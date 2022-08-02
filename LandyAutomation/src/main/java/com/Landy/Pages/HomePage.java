package com.Landy.Pages;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Landy.base.TestBase;
import com.Landy.util.TestUtil;

public class HomePage extends TestBase {
	
//	@FindBy(xpath = "//div[contains(text(),'jeeva')] ")
//	WebElement usernamelabel;
	
	@FindBy(xpath = "//div[@class='user-name ng-star-inserted'][contains(text(),'jeeva')]")
	WebElement usernamelabel;
	
	@FindBy(xpath = "//span[contains(text(),'Underwriting')] ")
	WebElement UWLinks;
	
	@FindBy(xpath = "//span[contains(text(),'Producer')] ")
	WebElement ProducerLinks;
	

	public HomePage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	public String  verifyHomepageTitle()
	{
		return driver.getTitle();
	}
	
	public String VerifyHomepageusername()
	{
 	    WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
 	   wait1.until(ExpectedConditions.visibilityOfAllElements(usernamelabel));
		
		String username =usernamelabel.getText();
		return username;
		
	}
	
	public boolean  verifyCorrectUsername()
	{
		return usernamelabel.isDisplayed();
		
	}
	public UnderwritingPage clickOnunderwriterLink() throws IOException 
	{
		
		 
		
		Actions action = new Actions(driver);
		action.moveToElement(UWLinks).build().perform();
		UWLinks.click();
		
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Underwriting')]"))).click();
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Underwriting')]"))).click();
//		
//		WebElement UWLink= driver.findElement(By.xpath("//span[contains(text(),'Underwriting')]"));
//		JavascriptExecutor js =(JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click();", UWLink);
		
		// method should return underwriter page object 
		return new UnderwritingPage();
	}
	
	public Producer_Page clickOnProducerLink() throws IOException 
	{
		ProducerLinks.click();
		// method should return underwriter page object 
		return new Producer_Page();
	}
	
	
	
	
}
