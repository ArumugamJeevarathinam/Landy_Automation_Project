package com.Landy.Pages;

import java.awt.List;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Landy.base.TestBase;

public class New_ReStd_Endorsements_Accordion_Page extends TestBase {

	

	@FindBy(xpath = " /html[1]/body[1]/ngx-app[1]/ngx-pages[1]/ngx-one-column-layout[1]/nb-layout[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nb-layout-column[1]/ngx-underwriter[1]/div[1]/nb-card[1]/nb-tabset[1]/nb-tab[1]/div[1]/nb-stepper[1]/div[2]/div[1]/div[2]/div[1]/nb-accordion[1]/nb-accordion-item[8]/nb-accordion-item-header[1]/span[1]]")	 
	WebElement Endros_Accordion_Tab;
	
	@FindBy(xpath = "//nb-accordion-item-body/div[1]/div[1]/ngx-endosements[1]/div[1]/div[1]/p[1]/button[2]")	 
	WebElement Endros_Accordion_SaveAndClose;
	
	@FindBy(xpath = "//nb-card-body/div[1]/div[6]/p[1]/button[3]")
	WebElement Cybr_Modal_SaveBtn;
	
	@FindBy(xpath = "//nb-accordion-item-body/div[1]/div[1]/ngx-endosements[1]/div[1]/div[1]/p[1]/button[2]")
	WebElement Endros_SaveandClose;
	
	@FindBy(xpath = "//body/ngx-app[1]/ngx-pages[1]/ngx-one-column-layout[1]/nb-layout[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nb-layout-column[1]/ngx-underwriter[1]/div[1]/nb-card[1]/nb-tabset[1]/nb-tab[1]/div[1]/nb-stepper[1]/div[2]/div[1]/div[2]/div[2]/div[2]/button[1]/span[1]")
	WebElement RateBtn;
	//body/ngx-app[1]/ngx-pages[1]/ngx-one-column-layout[1]/nb-layout[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nb-layout-column[1]/ngx-underwriter[1]/div[1]/nb-card[1]/nb-tabset[1]/nb-tab[1]/div[1]/nb-stepper[1]/div[2]/div[1]/div[2]/div[2]/div[2]/button[1]/span[1]
	
	//body[1]/ngx-app[1]/ngx-pages[1]/ngx-one-column-layout[1]/nb-layout[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nb-layout-column[1]/ngx-underwriter[1]/div[1]/nb-card[1]/nb-tabset[1]/nb-tab[1]/div[1]/nb-stepper[1]/div[2]/div[1]/div[2]/div[1]/nb-accordion[1]/nb-accordion-item[8]/nb-accordion-item-body[1]/div[1]/div[1]/ngx-endosements[1]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/span
	
	public New_ReStd_Endorsements_Accordion_Page() throws IOException
	{
		 PageFactory.initElements(driver, this);
	}
	
	public void validate_Endros_Accordion_Tab()
	{
 		 JavascriptExecutor js = (JavascriptExecutor) driver;
// 	    // js.executeScript("window.scrollBy(0,1000)", "");
 	 js.executeScript("arguments[0].scrollIntoView();", Endros_Accordion_Tab);
		 
           
		
		Actions action = new Actions(driver);
		action.moveToElement(Endros_Accordion_Tab).build().perform();
		action.click();
		
		//Endros_Accordion_Tab.click();
	}
	
	
	public void validate_Cyber_Form()
	{
		
		
		 java.util.List<WebElement> AllOptional_Endros_Data=driver.findElements(By.xpath("//body[1]/ngx-app[1]/ngx-pages[1]/ngx-one-column-layout[1]/nb-layout[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nb-layout-column[1]/ngx-underwriter[1]/div[1]/nb-card[1]/nb-tabset[1]/nb-tab[1]/div[1]/nb-stepper[1]/div[2]/div[1]/div[2]/div[1]/nb-accordion[1]/nb-accordion-item[8]/nb-accordion-item-body[1]/div[1]/div[1]/ngx-endosements[1]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td"));
		 System.out.println("The avalible data is : "+AllOptional_Endros_Data.size());
		 
		 for(int i=0;i<AllOptional_Endros_Data.size();i++)
		 {
			 String Optional_Endros=AllOptional_Endros_Data.get(i).getText();
			 if(Optional_Endros.equalsIgnoreCase("D43449 (08/19) Cyber Extension"))
			 {
				 driver.findElement(By.xpath("//body[1]/ngx-app[1]/ngx-pages[1]/ngx-one-column-layout[1]/nb-layout[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nb-layout-column[1]/ngx-underwriter[1]/div[1]/nb-card[1]/nb-tabset[1]/nb-tab[1]/div[1]/nb-stepper[1]/div[2]/div[1]/div[2]/div[1]/nb-accordion[1]/nb-accordion-item[8]/nb-accordion-item-body[1]/div[1]/div[1]/ngx-endosements[1]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/i[1]")).click();
				 break;
			 }
			
		 }
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 Cybr_Modal_SaveBtn.click();
	}
	
	public void validate_Endros_Accordion_saveBtn()
	{
		Endros_Accordion_SaveAndClose.click();
	}
	
	public void rate()
	{
		RateBtn.click();
	}
	 
}
