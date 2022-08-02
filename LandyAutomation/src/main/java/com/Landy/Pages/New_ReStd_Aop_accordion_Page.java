package com.Landy.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Landy.base.TestBase;

public class New_ReStd_Aop_accordion_Page extends TestBase{
	
	
	
	
	@FindBy(xpath = "//span[contains(text(),'Areas of Practice')]")	 
	WebElement Aop_Tab;
	
	@FindBy(xpath = "/html[1]/body[1]/ngx-app[1]/ngx-pages[1]/ngx-one-column-layout[1]/nb-layout[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nb-layout-column[1]/ngx-underwriter[1]/div[1]/nb-card[1]/nb-tabset[1]/nb-tab[1]/div[1]/nb-stepper[1]/div[2]/div[1]/div[2]/div[1]/nb-accordion[1]/nb-accordion-item[3]/nb-accordion-item-body[1]/div[1]/div[1]/ngx-rev-trans[1]/div[1]/div[1]/div[1]/table[1]/tr[3]/td[2]/input[1]")	 
	WebElement Aop_Resi_SalesAndLeasing;
	
	@FindBy(xpath = "/html[1]/body[1]/ngx-app[1]/ngx-pages[1]/ngx-one-column-layout[1]/nb-layout[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nb-layout-column[1]/ngx-underwriter[1]/div[1]/nb-card[1]/nb-tabset[1]/nb-tab[1]/div[1]/nb-stepper[1]/div[2]/div[1]/div[2]/div[1]/nb-accordion[1]/nb-accordion-item[3]/nb-accordion-item-body[1]/div[1]/div[1]/ngx-rev-trans[1]/div[1]/div[1]/div[1]/table[1]/tr[3]/td[3]/input[1]")	 
	WebElement Aop_Resi_SalesAndLeaing_NoOfTrans;
	
	@FindBy(xpath = "//nb-accordion-item-body/div[1]/div[1]/ngx-rev-trans[1]/div[1]/div[1]/div[1]/p[1]/button[2]")	 
	WebElement Aop_SaveandClose;
	
	
	@FindBy(xpath = "//nb-accordion-item-body/div[1]/div[1]/ngx-rev-trans[1]/div[1]/div[1]/div[1]/p[1]/button[1]")	 
	WebElement Aop_SaveandContinue;

	@FindBy(xpath = "/html[1]/body[1]/ngx-app[1]/ngx-pages[1]/ngx-one-column-layout[1]/nb-layout[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nb-layout-column[1]/ngx-underwriter[1]/div[1]/nb-card[1]/nb-tabset[1]/nb-tab[1]/div[1]/nb-stepper[1]/div[2]/div[1]/div[2]/div[1]/nb-accordion[1]/nb-accordion-item[3]/nb-accordion-item-body[1]/div[1]/div[1]/ngx-rev-trans[1]/div[1]/div[1]/div[1]/table[2]/tr[2]/td[2]/input[1]")	 
	WebElement Aop_Comm_SalesAndLeasing;
	
	@FindBy(xpath = "/html[1]/body[1]/ngx-app[1]/ngx-pages[1]/ngx-one-column-layout[1]/nb-layout[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nb-layout-column[1]/ngx-underwriter[1]/div[1]/nb-card[1]/nb-tabset[1]/nb-tab[1]/div[1]/nb-stepper[1]/div[2]/div[1]/div[2]/div[1]/nb-accordion[1]/nb-accordion-item[3]/nb-accordion-item-body[1]/div[1]/div[1]/ngx-rev-trans[1]/div[1]/div[1]/div[1]/table[2]/tr[2]/td[3]/input[1]")	 
	WebElement Aop_Comm_SalesAndLeaing_NoOfTrans;
	
	
	public New_ReStd_Aop_accordion_Page() throws IOException 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void validate_Aop_Tab()
	{
		Aop_Tab.click();
	}
	public String validate_Resi_SaleLeasing_Gross(String grossInput)
	{
		Aop_Resi_SalesAndLeasing.click();
		Aop_Resi_SalesAndLeasing.sendKeys(grossInput);
		return grossInput;
	}
	
	public String validate_Resi_SaleLeasing_Total_Trns(String transInput)
	{
		Aop_Resi_SalesAndLeaing_NoOfTrans.click();
		Aop_Resi_SalesAndLeaing_NoOfTrans.sendKeys(transInput);
		return transInput;
	}
	
	public void validate_Aop_SaveBtn()
	{
		Aop_SaveandContinue.click();
	}

}
