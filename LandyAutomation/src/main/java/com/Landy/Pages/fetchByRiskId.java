package com.Landy.Pages;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Landy.base.TestBase;

public class fetchByRiskId extends TestBase{
	

	
	
	@FindBy(xpath = "//nb-card-body/table[1] ")
	WebElement UWTable; 
	
	@FindBy(xpath = "//nb-card-header/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement UWPage_Search; 
	
	@FindBy(xpath = "//button[@class='searchButton searchButton_blue']")
	WebElement UWPage_SearchBtn;
	
	@FindBy(xpath = "//table[@class='table  table-bordered table-sm table-striped  ']//thead//tr[2]//th[3]//input")
	WebElement feching_Claim_By_Risk;
	
	
	
	public fetchByRiskId() throws IOException 
	{
		 PageFactory.initElements(driver, this);
	}

	
	public void fetchingRiskID()
	{
		
	    	driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
 	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
 	        
		WebElement UW_Main_Table=driver.findElement(By.xpath("//nb-card-body/table[1]"));
		List<WebElement> Table_Rows=UW_Main_Table.findElements(By.tagName("tr"));
		
		for(int i=0;i<Table_Rows.size();i++)
		{
			List<WebElement> Table_Columns=Table_Rows.get(i).findElements(By.tagName("td"));
			System.out.println("Number of cell in Row"+i+"are " +Table_Columns.size());
			
			for(int j=0;j<Table_Columns.size();j++)
			{
				String CellText=Table_Columns.get(j).getText();
				 System.out.println("Cell Value Of row number "+i+" and column number "+j+" Is "+CellText);
			}
		}
		
	}
	
	public String  search_Claim_By_Risk(String risk)
	{
		UWPage_Search.sendKeys(risk);
		return risk;
	}
	
	public void validate_risk_search_Btn()
	{
		UWPage_SearchBtn.click();
		
	}
	
	public String search_Risk_from_tbl(String risk)
	{
		feching_Claim_By_Risk.sendKeys(risk);
		return risk;
	}
	
	public String fetching_Risk(String riskID) 
	{
		
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
         List<WebElement> AlltableData=driver.findElements(By.xpath("//table[@class='table  table-bordered table-sm table-striped  ']//td"));
         System.out.println("The avalible data is : "+AlltableData.size());
         
         for(int i=0;i<AlltableData.size();i++)
         {
        	 String DataName=AlltableData.get(i).getText();
        	 if(DataName.equalsIgnoreCase(riskID))
        	 {
        		 AlltableData.get(i).click();
        	 }
        	 else {System.out.println("Data is  not present");}
         }
         return riskID;
	    
	   
		 
		
	}
}
