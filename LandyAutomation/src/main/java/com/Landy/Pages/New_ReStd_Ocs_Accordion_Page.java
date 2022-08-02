package com.Landy.Pages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Landy.base.TestBase;


 

public class New_ReStd_Ocs_Accordion_Page extends TestBase {
	
	
	//@FindBy(xpath = "/html[1]/body[1]/ngx-app[1]/ngx-pages[1]/ngx-one-column-layout[1]/nb-layout[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nb-layout-column[1]/ngx-underwriter[1]/div[1]/nb-card[1]/nb-tabset[1]/nb-tab[1]/div[1]/nb-stepper[1]/div[2]/div[1]/div[2]/div[1]/nb-accordion[1]/nb-accordion-item[4]/nb-accordion-item-header[1]/span[1]")	 
	//WebElement Ocs_Accordion_Tab;
	
	
	@FindBy(xpath = "//span[contains(text(),'Quote Selection & Contingencies')]")	 
	WebElement Ocs_Accordion_Tab;
	
	@FindBy(xpath = " //select[@id='epli']")	 
	WebElement Ocs_EPLI;
	
	@FindBy(xpath = "//label[text()='EPLI Retroactive Date']/parent::div//input")	 
	WebElement Ocs_EPLI_Date;
	
	@FindBy(xpath = "//select[@id='cyber']")	 
	WebElement Ocs_Cyber;
	
	@FindBy(xpath = "//label[text()='Residential Real Property']/parent::div//select")	 
	WebElement Ocs_Res_Real_Prop;
	
	
	@FindBy(xpath = "//label[text()='Owned Residential Property']/parent::div//select")	 
	WebElement Ocs_Owned_Res_Real_Prop;
	
	@FindBy(xpath = "//nb-accordion-item-body/div[1]/div[1]/ngx-quote-selection[1]/div[1]/div[1]/p[1]/button[1]")	 
	WebElement Ocs_SaveandContinue;
	
	
	@FindBy(xpath = "//nb-accordion-item-body/div[1]/div[1]/ngx-quote-selection[1]/div[1]/div[1]/p[1]/button[2]")	 
	WebElement Ocs_SaveAndClose;
	
	
	public New_ReStd_Ocs_Accordion_Page() throws IOException 
	
	{
		PageFactory.initElements(driver, this);
	}
	
	public void validate_Ocs_Accordion_Tab()
	{
		Ocs_Accordion_Tab.click();
	}
	
	public String vaildate_Ocs_Cyber(String cyberOption)
	{
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement cyberDrop=driver.findElement(By.xpath("//select[@id='cyber']"));
		//cyberDrop.click();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", cyberDrop);
		Select cyberSelect =new Select(cyberDrop);
		cyberSelect.selectByValue(cyberOption);
		return cyberOption;
		
	}
	
	public String vaildate_Ocs_EPLI(String EPLIOption)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement epliDrop=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='epli']")));
		epliDrop.click();
		Select epliSelect =new Select(epliDrop);
		epliSelect.selectByValue(EPLIOption);
		return EPLIOption;
		
	}
	
	public void validate_EpliRetroDate(String epliRetroDate)
	{
		Actions action = new Actions(driver);
		WebElement epliRetro=driver.findElement(By.xpath("//label[text()='EPLI Retroactive Date']/parent::div//input"));
		action.moveToElement(epliRetro).build().perform();
		action.click();
		
		Select selectRetro = new Select(epliRetro);
		selectRetro.selectByVisibleText(epliRetroDate);
		epliRetro.sendKeys(Keys.ENTER);
	}
	
	public void validate_Ocs_SaveBtn()
	{
		Ocs_SaveandContinue.click();
	}

}
