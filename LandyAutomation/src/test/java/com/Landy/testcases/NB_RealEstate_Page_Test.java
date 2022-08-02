 package com.Landy.testcases;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Landy.Pages.Application_Details_Accordion_Page;
import com.Landy.Pages.HomePage;
import com.Landy.Pages.LoginPage;
import com.Landy.Pages.NB_RealEstate_ClaimPage;
import com.Landy.Pages.New_ReStd_Aop_accordion_Page;
import com.Landy.Pages.New_ReStd_Endorsements_Accordion_Page;
import com.Landy.Pages.New_ReStd_Ocs_Accordion_Page;
import com.Landy.Pages.New_ReStd_Quote_accordion_Page;
import com.Landy.Pages.UnderwritingPage;
import com.Landy.Pages.new_GCI_accordion_Page;
import com.Landy.base.TestBase;
import com.Landy.util.TestUtil;
 

public class NB_RealEstate_Page_Test extends TestBase {

//	@FindBy(xpath = " //label[contains(text(),'State')]/parent::div/child::select")
//	WebElement NB_State_DropdownSelect;
//	
//	@FindBy(xpath = "//label[contains(text(),'Line of Business')]/parent::div//child::select[@id='state']")
//	WebElement NB_LOB_Dropdown_Select;
//	
//	
//	@FindBy(xpath = "//div[@class='col-sm-12']//form//child::div//child::div[@class='mat-form-field-infix']//input")
//	WebElement pickProducer;
//	
//	@FindBy(xpath = "//input[@placeholder='Pick a Firm Name']")
//	WebElement pickFirmName;
//	
	 
	String ExcelSheetName = "Contacts";
	String xlFilepath="C:/Users/Admin/eclipse-workspace/LandyAutomation/src/main/java/testData/Landy_Data.xlsx";
	
	 
	LoginPage loginPage;
	HomePage homePage;
	UnderwritingPage underwriterpage;
	NB_RealEstate_ClaimPage NB_realEstate_claimPage;
	new_GCI_accordion_Page newgciAccorionPage;
	Application_Details_Accordion_Page AppDetail_Accordion_Page;
	New_ReStd_Aop_accordion_Page Aop_Accordion_Page;
	New_ReStd_Endorsements_Accordion_Page Endros_AccordionPage;
	New_ReStd_Ocs_Accordion_Page Ocs_Accordion_Page;
	New_ReStd_Quote_accordion_Page QuoteSelection_Accordion_Page;
 
	
	public  NB_RealEstate_Page_Test() throws IOException
	{
		super();
		PageFactory.initElements(driver, this);
	}
	@Test(priority = 1)
	public void setUp() throws IOException
	{
		initialization();
		loginPage = new LoginPage();
		homePage =loginPage.Login(prop.getProperty("username"), prop.getProperty("password"));
		underwriterpage = new UnderwritingPage();
		//underwriterpage= homePage.clickOnunderwriterLink();
		//newgciAccorionPage= new new_GCI_accordion_Page();
		//NB_realEstate_claimPage=underwriterpage.CreateNewApp();
		AppDetail_Accordion_Page = new Application_Details_Accordion_Page();
		Aop_Accordion_Page = new New_ReStd_Aop_accordion_Page();
		Endros_AccordionPage = new New_ReStd_Endorsements_Accordion_Page();
		Ocs_Accordion_Page = new New_ReStd_Ocs_Accordion_Page();
		QuoteSelection_Accordion_Page = new New_ReStd_Quote_accordion_Page();
		
	}
	
	 @Test(priority = 2)
	public void verifyuserNameTest()
	{
	boolean flag	= homePage.verifyCorrectUsername();
	Assert.assertTrue(flag);
	
 
	}
	 
	 @Test(priority = 3)
	public void verifyhomepageusernameTest()
	{
	String homeuser	=homePage.VerifyHomepageusername();
	System.out.println("The Logged in User name is "+homeuser);
	}
	
	 
	 @Test(priority = 4)
	public void ClickOnUnderWritingLink() throws IOException
	{
		underwriterpage= homePage.clickOnunderwriterLink();
	}
	
   @Test(priority = 5)
	public void Select_State_Test() throws IOException {
		
	   
	     // underwriterpage= homePage.clickOnunderwriterLink();
		
	    driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	 
	    NB_realEstate_claimPage= underwriterpage.CreateNewApp();
	    
		 NB_realEstate_claimPage.Select_State("FL");
		 // NB_realEstate_claimPage.Select_lob("Accountants Standard");
		 //NB_realEstate_claimPage.Select_LOB(1);
	 
 
		 
	}
   
   @Test(priority = 6) 
   public void select_lob_Test()
  {
	  NB_realEstate_claimPage.Select_LOB("Re_Std");
  }
     
    
 
   @Test(priority = 7)
   public void enterProducerTest() throws InterruptedException
   {
	   NB_realEstate_claimPage.enterProducer("HHL"); 
   }
  
 @Test(priority = 8)
  public void  enterFirmnameTest() throws InterruptedException
  {
	  NB_realEstate_claimPage.enterFirmname("Western & Southern Financial Group");
	// newgciAccorionPage.enterFirmname("The Norfolk & Dedham Group");
	 		 
 		  
		 
 }
 
 // @Test(priority =6)
  public void enterLocation()
  {
 	   
 	 NB_realEstate_claimPage.searchLocation("Alabama");
 	// WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
  }
  
  
  @Test(priority =9,dataProvider = "GCIinfoData")
  public void NewContactTest(String add,String zip_cust,String county_cust,String ftname_cust,String ltname_cust,String mail_Cust)
  {
	  //newgciAccorionPage.CreateContat("Express Way No-2873", "35005", "Orange", "John", "Smith", "smith@landy.com");
	 
	 // newgciAccorionPage.CreateContat(add, zip_cust, county_cust, ftname_cust, ltname_cust, mail_cust);
	  NB_realEstate_claimPage.CreateContat(add, zip_cust, county_cust, ftname_cust, ltname_cust,mail_Cust);
  }
  
  @DataProvider(name="GCIinfoData") 
  public Object[][] getLandyTestData() throws InvalidFormatException
  {
	  Object data[][]=TestUtil.getTestData(ExcelSheetName);
	  return data;
	  
  }
  
  @Test(priority = 10)
 public void enterAppSource()
 {
	 try {
		  
		 NB_realEstate_claimPage.selectAppsource("Direct");
		
	} catch (IOException e) {System.out.println("Not able to pick the App Source");}
		 
	
 }
  
  @Test(priority = 11)
  public void verifyEffectiveDateTest()
  {
	 // String effective = "06-27-2022";
	  NB_realEstate_claimPage.validateEffectiveDate(prop.getProperty("Effective Date"));
  }
  
  @Test(priority = 12)
  public void validateRetroDateTest()
  {
	  NB_realEstate_claimPage.validateRetroDate(prop.getProperty("RetroDate"));
  }
  
  
  @Test(priority = 13)
  public void saveBtnTest() throws IOException
  {
	  NB_realEstate_claimPage.validateSaveBtn();
  }
  
  //....................AppDetails Accordion Test Cases ................
  
  @Test(priority = 14)
  public void AppDetail_Tab_Test()
  {
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  AppDetail_Accordion_Page.appDetails_Accordion_Tab();
  }
  
  @Test(priority = 15)
  public void AppDetail_Accordion_FullTimeProff_Test()
  {
	  AppDetail_Accordion_Page.App_Detail_FTProfessionals(prop.getProperty("Full Time Professionals"));
  }
  
  @Test(priority = 16)
  public void AppDetail_Accordion_PartTimeProff_Test()
  {
	  AppDetail_Accordion_Page.App_Detail_PTProfessionals(prop.getProperty("Part Time Professionals "));
  }
  
  @Test(priority = 17)
  public void AppDetail_Accordion_TypeOfFirm_Test()
  {
	  AppDetail_Accordion_Page.Validate_AppDetail_TypeOfFirm(prop.getProperty("Type Of Firm"));
  }
  
  
  @Test(priority = 18)
  public void AppDetail_Accordion_saveBtn_Test()
  {
	  AppDetail_Accordion_Page.validate_ApDetail_SaveBtn();
  }
  
 
  // ..................Aop Accordion Test Cases......................
  
  @Test(priority = 19)
  public void validate_Aop_Tab_Test()
  {
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  Aop_Accordion_Page.validate_Aop_Tab();
  }
  
  @Test(priority = 20)
  public void  Aop_Resi_Gross_Test()
  {
	  Aop_Accordion_Page.validate_Resi_SaleLeasing_Gross(prop.getProperty("Residential-Sales & Leasing"));
	  Aop_Accordion_Page.validate_Resi_SaleLeasing_Total_Trns(prop.getProperty("Total No of Transaction"));
  }
  
  @Test(priority = 21)
  public void validate_Aop_SaveBtn_Test()
  {
	 // Aop_Accordion_Page.validate_Aop_SaveBtn(); 
	  
	  //  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	   Aop_Accordion_Page.validate_Aop_SaveBtn(); 
  }
  
  
  //...........OCS Accordion Test Cases..............
  
  
//  @Test(priority = 22)
//  public void validate_Ocs_Tab_Test()
//  {
//	  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//	  Ocs_Accordion_Page.validate_Ocs_Accordion_Tab();
//  }
  
  
  @Test(priority = 23)
  public void validate_EPLI_Test()
  {
	  Ocs_Accordion_Page.vaildate_Ocs_EPLI(prop.getProperty("EPLIvalue"));
  }
  
  
//  @Test(priority = 24)
//  public void validate_EPLIRero_Test()
//  {
//	  Ocs_Accordion_Page.validate_EpliRetroDate("Unlimited");
//  }
  
  @Test(priority = 25)
  public void validate_Cyber_Test()
  {
	  Ocs_Accordion_Page.vaildate_Ocs_Cyber(prop.getProperty("CyberValue"));
  }
  
  
  @Test(priority = 26)
  public void validate_Ocs_SaveBtn_Test()
  {
	  Ocs_Accordion_Page.validate_Ocs_SaveBtn();
  }
  
  //.....................Quote Selection Accordion Test Cases .......................
  
	 @Test(priority = 28)
	 public void Access_QuoteAccordion_Tab_Test()
	 {
		 QuoteSelection_Accordion_Page.validate_Quoteccordion_Tab();
	 }
	 
//	 @Test(priority = 29)
//	 public void validate_SelectAll_Limit_Test()
//	 {
//		 QuoteSelection_Accordion_Page.Validate_SelectAll_Limit();
//	 }
//	 
//	 @Test(priority = 29)
//	 public void Access_QuoteAccordion_Limit_Test()
//	 {
//		 QuoteSelection_Accordion_Page.validate_Limit();
//		 
//	 }
	 
	 @Test(priority = 30)
	 public void Access_QuoteAccordion_Deductible_Test()
	 {
	 
		 QuoteSelection_Accordion_Page.validate_Deductible();
		  
	 }
//	 
//	 @Test(priority = 31)
//	 public void Access_QuoteAccordion_Limit_Type_Test()
//	 { 
//		 QuoteSelection_Accordion_Page.validate_limit_Type();
//		  
//	 }
//	 
	 @Test(priority = 32)
	 public void Access_QuoteAccordion_Deductible_Type_Test()
	 {
		  
		 QuoteSelection_Accordion_Page.validate_SelectAll_Deductible_Type();
		
	 }
	 
	 @Test(priority = 33)
	 public void savebn()
	 {
		 QuoteSelection_Accordion_Page.validate_Quote_SaveBtn();
	 }
	 
	  
	 //..............Endorsement accordion test cases..............
	 
//	 @Test(priority = 37)
//	 public void Endros_Accordian_Tab_Test()
//	 {
// 		 JavascriptExecutor js = (JavascriptExecutor) driver;
// 		 js.executeScript("window.scrollBy(0,1000)", "");
//		 
//		 Endros_AccordionPage.validate_Endros_Accordion_Tab();
//	 }
	 
	 @Test(priority = 34)
	 public void endros_Accordion_SaveBtn_Test()
	 {
		 Endros_AccordionPage.validate_Endros_Accordion_saveBtn();
	 }
	 
	 @Test(priority = 35)
	 public void rate_Test()
	 {
		 Endros_AccordionPage.rate();
	 }
	 
  
  
 
}
