package com.Landy.Pages;


import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Landy.base.TestBase;

public class Application_Details_Accordion_Page extends TestBase
{

	
	@FindBy(xpath = "//span[contains(text(),'Application Details')]")	 
	WebElement AppDetail_Tab;
	  
	
	@FindBy(xpath = "//label[contains(text(),'Type Of Firm')]/parent::div//select")	 
	WebElement TypeofFirm;
	
	@FindBy(xpath = "//label[contains(text(),'Full Time Professionals')]/parent::div//input")	 
	WebElement FullTimeProff;
	
	@FindBy(xpath = "//label[contains(text(),'Part Time Professionals')]/parent::div//input")	 
	WebElement PartTimeProff;
	
	@FindBy(xpath = "//label[contains(text(),'FT Admin')]/parent::div//input")	 
	WebElement FTAdmin;
	
	@FindBy(xpath = "//label[contains(text(),'PT Admin')]/parent::div//input")	 
	WebElement PTAdmin;
	
	@FindBy(xpath = "//label[contains(text(),'Home Warranty')]/parent::div//select")	 
	WebElement HomeWarrantyDrop;
	

	@FindBy(xpath = "//label[contains(text(),'Professional Designation')]/parent::div//select")	 
	WebElement ProfessionalDesigDrop;
	
	
	@FindBy(xpath = "//nb-accordion-item-body/div[1]/div[1]/ngx-ai[1]/div[1]/div[1]/div[1]/p[1]/button[2]")	 
	WebElement saveBtn;
	
	public Application_Details_Accordion_Page() throws IOException {
		
		PageFactory.initElements(driver, this);
		 
	}
	
	//public void appDetails_Accordion()
	//{
		//AppDetail_accordionBtn.click();
	    
	//}
	
	 
	
	 public void validate_ApDetail_SaveBtn()
	 {
		 saveBtn.click();
	 }
	
 
	public void appDetails_Accordion_Tab()
	{
		
		 
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	     wait.until(ExpectedConditions.visibilityOf(AppDetail_Tab)).click();
	    
	}
	
	public String Validate_AppDetail_TypeOfFirm(String firmType)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement typeOfirm=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[contains(text(),'Type Of Firm')]/parent::div//select")));
		typeOfirm.click();
		
		Select typeFirmSelect = new Select(typeOfirm);
		typeFirmSelect.selectByValue(firmType);
		return firmType;
		 
	}
	
	public String  App_Detail_FTProfessionals(String ftinput)
	{
		FullTimeProff.sendKeys(ftinput);
		return ftinput;
	}
	
	
	public String  App_Detail_PTProfessionals( String ptinput)
	{
		PartTimeProff.sendKeys(ptinput);
		return ptinput;
	}
	
	public String  App_Detail_FTAdmin( String ftadmin)
	{
		FTAdmin.sendKeys(ftadmin);
		return ftadmin;
	}
	
	public String  App_Detail_PTAdmin( String ptadmin)
	{
		PTAdmin.sendKeys(ptadmin);
		return ptadmin;
	}
	
 
	
	public String Validate_AppDetail_HomeWarranty(String homewarr)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement homeWarranty=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[contains(text(),'Home Warranty')]/parent::div//select")));
		homeWarranty.click();
		Select typeFirmSelect = new Select(homeWarranty);
		typeFirmSelect.selectByValue(homewarr);
		return homewarr;
		 
	}
	
	public String Validate_AppDetail_ProffWarranty(String proffwarr)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement professWarranty=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[contains(text(),'Professional Designation')]/parent::div//select")));
		professWarranty.click();
		
		Select typeFirmSelect = new Select(professWarranty);
		typeFirmSelect.selectByValue(proffwarr);
		return proffwarr;
		 
	}
	 

}
