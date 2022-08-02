package com.Landy.Pages;

import java.awt.List;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Landy.base.TestBase;

public class New_ReStd_Quote_accordion_Page extends TestBase {
	
	@FindBy(xpath = "/html[1]/body[1]/ngx-app[1]/ngx-pages[1]/ngx-one-column-layout[1]"
			+ "/nb-layout[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nb-layout-column[1]/ngx-underwriter[1]"
			+ "/div[1]/nb-card[1]/nb-tabset[1]/nb-tab[1]/div[1]/nb-stepper[1]/div[2]/div[1]/div[2]/div[1]/nb-accordion[1]"
			+ "/nb-accordion-item[7]/nb-accordion-item-header[1]/span[1]")	 
	
	WebElement Quote_Selection_Accordion_Tab;
	
	
	@FindBy(xpath=("//nb-accordion-item-body/div[1]/div[1]/ngx-quote-selection[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[2]/ul[2]"))
	WebElement  limitDropList;
	//nb-accordion-item-body/div[1]/div[1]/ngx-quote-selection[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[2]/ul[2]
	@FindBy(xpath=("//span[contains(text(),'Quote Selection & Contingencies')]"))
	WebElement  Quote_Accordion_Tab;
	
	@FindBy(xpath = "//nb-accordion-item-body/div[1]/div[1]/ngx-quote-selection[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]")	 
	
	WebElement Select_Limit;
	
	@FindBy(xpath ="//nb-accordion-item-body/div[1]/div[1]/ngx-quote-selection[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[2]/ul[1]/li[1]/input") 
    WebElement SelectAll_Limit_CheckBox;
	
	
	@FindBy(xpath="//nb-accordion-item-body/div[1]/div[1]/ngx-quote-selection[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/parent::div//div[1]//div//span")
	WebElement AllLimitsOpions;
	
	@FindBy(xpath = "//nb-accordion-item-body/div[1]/div[1]/ngx-quote-selection[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]")	
	
	WebElement Select_Deductible;
	
	@FindBy(xpath = "//nb-accordion-item-body/div[1]/div[1]/ngx-quote-selection[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ng-multiselect-dropdown[1] ")	 
	WebElement Limit_Type;
	  
	@FindBy(xpath="//nb-accordion-item-body/div[1]/div[1]/ngx-quote-selection[1]/div[1]/div[1]/div[1]/div[4]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]")
	
	WebElement Deductible_Type;
	
	@FindBy(xpath = "//nb-accordion-item-body/div[1]/div[1]/ngx-quote-selection[1]/div[1]/div[1]/p[1]/button[2]")	 
	WebElement QuoteSelection_SaveAndClose;
	
	
	@FindBy(xpath = "//nb-accordion-item-body/div[1]/div[1]/ngx-quote-selection[1]/div[1]/div[1]/p[1]/button[1]")	 
	WebElement QuoteSelection_SaveAndContinue;
	

	public New_ReStd_Quote_accordion_Page() throws IOException 
	{
		 PageFactory.initElements(driver, this);
	}
	
	public void validate_Quoteccordion_Tab()
	{
		Quote_Accordion_Tab.click();
	}
	public void  validate_Limit1()
	{

 		JavascriptExecutor js = (JavascriptExecutor)driver;
 		js.executeScript("window.scrollBy(0,1000)");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement limit=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//nb-accordion-item-body/div[1]/div[1]/ngx-quote-selection[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]")));
		limit.click();
		
		//driver.navigate().refresh();
		
// 		WebElement SelectAll_CheckBox=driver.findElement(By.xpath("//nb-accordion-item-body/div[1]/div[1]/ngx-quote-selection[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[2]/ul[1]/li[1]/input"));
// 		if(!SelectAll_CheckBox.isSelected())
// 		{
// 			js.executeScript("arguments[0].click();", SelectAll_CheckBox);
// 	}
		 
		////if(!driver.findElement(By.xpath("//nb-accordion-item-body/div[1]/div[1]/ngx-quote-selection[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[2]/ul[1]/li[1]/input")).isSelected());
		//{
		//	 driver.findElement(By.xpath("//nb-accordion-item-body/div[1]/div[1]/ngx-quote-selection[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[2]/ul[1]/li[1]/input")).click();
			//break;
	//	}
		 
		//java.util.List<WebElement> AllLimitOptions= driver.findElements(By.xpath("//nb-accordion-item-body/div[1]/div[1]/ngx-quote-selection[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/parent::div//div[1]//div//span"));
 		java.util.List<WebElement> AllLimitOptions= driver.findElements(By.xpath("//nb-accordion-item-body/div[1]/div[1]/ngx-quote-selection[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[2]/ul[2]"));
		int AlllimitsSize= AllLimitOptions.size();
		System.out.println("The avalible limits are : "+AlllimitsSize);
		
		for(int i=0;i<AlllimitsSize;i++)
		{
			String AllLimitOptions_Text= AllLimitOptions.get(i).getText();
			System.out.println("The Avalible limit options are : "+AllLimitOptions_Text);
			if(AllLimitOptions_Text.equalsIgnoreCase("$ 500,000 / $ 500,000"))
			{
				AllLimitOptions.get(i).getText();
				AllLimitOptions.get(i).click();
				
			}
		}
		
		
	}
	public void  validate_Limit()
	{

 		JavascriptExecutor js = (JavascriptExecutor)driver;
 		js.executeScript("window.scrollBy(0,1000)");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement limit=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//nb-accordion-item-body/div[1]/div[1]/ngx-quote-selection[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]")));
		limit.click();
		
		//driver.navigate().refresh();
		
// 		WebElement SelectAll_CheckBox=driver.findElement(By.xpath("//nb-accordion-item-body/div[1]/div[1]/ngx-quote-selection[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[2]/ul[1]/li[1]/input"));
// 		if(!SelectAll_CheckBox.isSelected())
// 		{
// 			js.executeScript("arguments[0].click();", SelectAll_CheckBox);
// 	}
		 
		////if(!driver.findElement(By.xpath("//nb-accordion-item-body/div[1]/div[1]/ngx-quote-selection[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[2]/ul[1]/li[1]/input")).isSelected());
		//{
		//	 driver.findElement(By.xpath("//nb-accordion-item-body/div[1]/div[1]/ngx-quote-selection[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[2]/ul[1]/li[1]/input")).click();
			//break;
	//	}
		 
		//java.util.List<WebElement> AllLimitOptions= driver.findElements(By.xpath("//nb-accordion-item-body/div[1]/div[1]/ngx-quote-selection[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/parent::div//div[1]//div//span"));
 		java.util.List<WebElement> AllLimitOptions= driver.findElements(By.xpath("//nb-accordion-item-body/div[1]/div[1]/ngx-quote-selection[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[2]/ul[2]"));
		int AlllimitsSize= AllLimitOptions.size();
		System.out.println("The avalible limits are : "+AlllimitsSize);
		
		for(int i=0;i<AlllimitsSize;i++)
		{
			//String AllLimitOptions_Text= AllLimitOptions.get(i).getText();
			String AllLimitOptions_Text= AllLimitOptions.get(i).getText();
			System.out.println("The Avalible limit options are : "+AllLimitOptions_Text);
			
			//if(AllLimitOptions_Text.equalsIgnoreCase("$ 500,000 / $ 500,000"))
			if(AllLimitOptions_Text.contains("$ 500,000 / $ 500,000"))
			{
				AllLimitOptions.get(i).click();
				break;
				
			}
			
		}
		
	}
	
	public void Validate_SelectAll_Limit()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
 		js.executeScript("window.scrollBy(0,1000)");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement limit=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//nb-accordion-item-body/div[1]/div[1]/ngx-quote-selection[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]")));
		limit.click();
		
		//driver.navigate().refresh();
		
  		WebElement SelectAll_CheckBox=driver.findElement(By.xpath("//nb-accordion-item-body/div[1]/div[1]/ngx-quote-selection[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[2]/ul[1]/li[1]/input"));
  		if(!SelectAll_CheckBox.isSelected())
  		{
  			js.executeScript("arguments[0].click();", SelectAll_CheckBox);
  			
  	}
		
	}
	
	public void validate_Deductible()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement deductible=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//nb-accordion-item-body/div[1]/div[1]/ngx-quote-selection[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]")));
		deductible.click();
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", Select_Deductible);
		
 		js.executeScript("window.scrollBy(0,1000)");
 		
 	//WebElement SelectAll_CheckBox=driver.findElement(By.xpath("//nb-accordion-item-body/div[1]/div[1]/ngx-quote-selection[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[2]/ul[1]/li[1]/div[1]"));
    //    if(!SelectAll_CheckBox.isSelected())
    //   {
     //   	js.executeScript("arguments[0].click();", SelectAll_CheckBox);
    //    }
 		//	return setDeductible;
 		 WebElement searchDeductiblefield = driver.findElement(By.xpath(" //nb-accordion-item-body/div[1]/div[1]/ngx-quote-selection[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[2]/ul[1]/li[2]"));
 	 
        java.util.List<WebElement> AllDeductibleOptions =  driver.findElements(By.xpath("//nb-accordion-item-body/div[1]/div[1]/ngx-quote-selection[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[2]/ul[2]"));
       
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
      
		int AllDeductibleSize= AllDeductibleOptions.size();
		
		System.out.println("The avalible Deductible size are : "+AllDeductibleSize);
	 
		  for (int i=1;i<AllDeductibleSize;i++)
		  {
			  String DeductibleOption_Text=AllDeductibleOptions.get(i).getText();
			 
			  System.out.println("The avalible deductible options are   :"+DeductibleOption_Text);
			  if(DeductibleOption_Text.contains("$ 1,000"))
			  {
				  AllDeductibleOptions.get(i).click();
				  break;
			  }
		  }
		
	}
	
	public void validate_Deductible_SelectAll()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement deductible=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//nb-accordion-item-body/div[1]/div[1]/ngx-quote-selection[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]")));
		deductible.click();
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", Select_Deductible);
		
 		js.executeScript("window.scrollBy(0,1000)");
 		
 	//WebElement SelectAll_CheckBox=driver.findElement(By.xpath("//nb-accordion-item-body/div[1]/div[1]/ngx-quote-selection[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[2]/ul[1]/li[1]/div[1]"));
    //    if(!SelectAll_CheckBox.isSelected())
    //   {
     //   	js.executeScript("arguments[0].click();", SelectAll_CheckBox);
    //    }
	}
	
	public void validate_SelectAll_Deductible_Type()
	{
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//		WebElement deductible_Type=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("Deductible_Type")));
//		deductible_Type.click();
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", Deductible_Type);
		
		WebElement SelectAll_CheckBox=driver.findElement(By.xpath("//nb-accordion-item-body/div[1]/div[1]/ngx-quote-selection[1]/div[1]/div[1]/div[1]/div[4]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[2]/ul[1]/li[1]"));
		if(!SelectAll_CheckBox.isSelected())
        {
        	js.executeScript("arguments[0].click();", SelectAll_CheckBox);
        }
	}
	
	public void  validate_Deductible_Type()
	{

 		JavascriptExecutor js = (JavascriptExecutor)driver;
 		js.executeScript("window.scrollBy(0,1000)");
		
		js.executeScript("arguments[0].click();", Deductible_Type);
		
		 
		 
		//java.util.List<WebElement> AllLimitOptions= driver.findElements(By.xpath("//nb-accordion-item-body/div[1]/div[1]/ngx-quote-selection[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/parent::div//div[1]//div//span"));
 		java.util.List<WebElement> AllDeductible_Type_Options= driver.findElements(By.xpath("//nb-accordion-item-body/div[1]/div[1]/ngx-quote-selection[1]/div[1]/div[1]/div[1]/div[4]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[2]/ul[2]"));
		int AllDeductible_Type_Size= AllDeductible_Type_Options.size();
		System.out.println("The avalible limits are : "+AllDeductible_Type_Size);
		
		for(int i=0;i<AllDeductible_Type_Size;i++)
		{
			//String AllLimitOptions_Text= AllLimitOptions.get(i).getText();
			String All_Deductible_Type_Options_Text= AllDeductible_Type_Options.get(i).getText();
			System.out.println("The Avalible limit options are : "+All_Deductible_Type_Options_Text);
			
			//if(AllLimitOptions_Text.equalsIgnoreCase("$ 500,000 / $ 500,000"))
			if(All_Deductible_Type_Options_Text.contains("Loss Only"))
			{
				AllDeductible_Type_Options.get(i).click();
				break;
				
			}
			
		}
		
	}
	
	 
	public void validate_Quote_SaveBtn()
	{
		QuoteSelection_SaveAndContinue.click();
	}
	

}
