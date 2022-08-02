package test;

import java.io.IOException;

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

public class datePicker_muk extends TestBase {
	
	
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
	wbtable webTABLE;

	public datePicker_muk() throws IOException {
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
		webTABLE = new wbtable();
		
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
			 webTABLE.search_Risk_from_tbl("STEW001");
		 }
		 
		 
//		 @Test(priority = 6)
//		 public void validate_risk_Btn_Test()
//		 {
//			 fetching_Risk.validate_risk_search_Btn();
//			  
//		 }
		 
		 @Test(priority = 6)
		 public void fetching_Risk_Test()
		 {
			 webTABLE.fetching_Risk();
			 
		 }

}