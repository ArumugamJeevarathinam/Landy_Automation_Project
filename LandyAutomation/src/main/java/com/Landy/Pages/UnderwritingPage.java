package com.Landy.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Landy.base.TestBase;

public class UnderwritingPage extends TestBase {

	
	
	@FindBy(xpath = "//span[contains(text(),'Underwriting')]")
	 
	WebElement underwritingLabel;
	
	@FindBy(xpath = "//div[@class='col-sm-2']//button")
	 
	WebElement newApplicationBtn;
	

	@FindBy(xpath = "//input[@id='mat-input-2']")
	 
	WebElement EnterProducerBtn;
	
	
	
	public UnderwritingPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean verifyUnderwriterpageLabel()
	{
		return underwritingLabel.isDisplayed();
	}
	
 	public NB_RealEstate_ClaimPage CreateNewApp() throws IOException
 	{
 		Actions action = new Actions(driver);
 		action.moveToElement(newApplicationBtn).build().perform();
 		newApplicationBtn.click();
 		return new NB_RealEstate_ClaimPage();
 	}
	
	public select_State_lob CreateNewApp1() throws IOException
	{
		Actions action = new Actions(driver);
		action.moveToElement(newApplicationBtn).build().perform();
		newApplicationBtn.click();
		//return new NB_RealEstate_ClaimPage();
		return new select_State_lob();
	}
	
	
	
	

}
