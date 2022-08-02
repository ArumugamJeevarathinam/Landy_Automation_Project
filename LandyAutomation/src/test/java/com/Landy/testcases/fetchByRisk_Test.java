package com.Landy.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
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
import com.Landy.Pages.fetchByRiskId;
import com.Landy.Pages.new_GCI_accordion_Page;
import com.Landy.base.TestBase;

import test.wbtable;

public class fetchByRisk_Test extends TestBase {
	
	
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
	fetchByRiskId fetching_Risk;
	

	public fetchByRisk_Test() throws IOException {
		super();
		 
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
		fetching_Risk= new fetchByRiskId();
		
		
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
		 public void validate_search_Claim_ByRisk_Test()
		 {
			fetching_Risk.search_Risk_from_tbl("TRAV002");
			 
			// fetching_Risk.search_Risk_from_tbl(prop.getProperty("RiskID"));
			 
		 }
		 
		 
		 @Test(priority = 6)
		 public void fetching_Risk_Test()
		 {
			 fetching_Risk.fetching_Risk("TRAV002");
			 
		 }
		 
		   

		 @Test(priority = 7)
		 public void Access_QuoteAccordion_Tab_Test()
		 {
			 QuoteSelection_Accordion_Page.validate_Quoteccordion_Tab();
		 }
		 
//		 @Test(priority = 8)
//		 public void validate_SelectAll_Limit_Test()
//		 {
//			 QuoteSelection_Accordion_Page.Validate_SelectAll_Limit();
//		 }
//  		 @Test(priority = 9)
// 	 public void Access_QuoteAccordion_Limit_Test()
// 		 {
// 	 QuoteSelection_Accordion_Page.validate_Limit();
// 	 
//  		 
//  }
  		 
  		@Test(priority = 10)
  		 public void validate_Deductible_SelectAll_Test()
  		 {
  			QuoteSelection_Accordion_Page.validate_Deductible_SelectAll();
  		 }
		 
  		
  		@Test(priority = 11)
  		public void validate_Deductible_type_Test()
  		{
  			QuoteSelection_Accordion_Page.validate_Deductible_Type();
  		}
//		 @Test(priority = 10)
//		 public void Access_QuoteAccordion_Deductible_Test()
//		 {
//		 
//			 QuoteSelection_Accordion_Page.validate_Deductible();
//			  
//		 }
		 
//		 @Test(priority = 11)
//		 public void Access_QuoteAccordion_Limit_Type_Test()
//		 { 
//			 QuoteSelection_Accordion_Page.validate_limit_Type();
//			  
//		 }
		 
//		 @Test(priority = 12)
//		 public void Access_QuoteAccordion_Deductible_Type_Test()
//		 {
//			  
//			 QuoteSelection_Accordion_Page.validate_Deductible_Type();
//			
//		 }
		 
//		 @Test(priority = 13)
//		 public void savebn()
//		 {
//			 QuoteSelection_Accordion_Page.validate_Quote_SaveBtn();
//		 }
		 

}
