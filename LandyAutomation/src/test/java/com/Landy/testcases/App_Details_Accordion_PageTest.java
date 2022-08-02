package com.Landy.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Landy.Pages.Application_Details_Accordion_Page;
import com.Landy.Pages.HomePage;
import com.Landy.Pages.LoginPage;
import com.Landy.Pages.NB_RealEstate_ClaimPage;
import com.Landy.Pages.UnderwritingPage;
import com.Landy.Pages.new_GCI_accordion_Page;
import com.Landy.base.TestBase;
import com.Landy.util.TestUtil;

public class App_Details_Accordion_PageTest extends TestBase {

	
	 
	LoginPage loginPage;
	HomePage homePage;
	UnderwritingPage underwriterpage;
	NB_RealEstate_ClaimPage NB_realEstate_claimPage;
	new_GCI_accordion_Page newgciAccorionPage;
	NB_RealEstate_Page_Test NB_RE_Std_Page_Test;
	
	Application_Details_Accordion_Page AppDetail_Accordion_Page;
	String sheetname = "AppDetailData";
	
	public App_Details_Accordion_PageTest() throws IOException
{
		super();
		 
	}
	
	@Test(priority = 1)
	public void setUp() throws IOException
	{
		initialization();
		underwriterpage = new UnderwritingPage();
		loginPage = new LoginPage();
		homePage =loginPage.Login(prop.getProperty("username"), prop.getProperty("password"));
		underwriterpage= homePage.clickOnunderwriterLink();
	 	NB_RE_Std_Page_Test = new NB_RealEstate_Page_Test();
		NB_realEstate_claimPage=underwriterpage.CreateNewApp();
	  
		
		
	}
	
	@Test(priority = 2)
	public void clickUnderWriting()
	{
		try {
			homePage.clickOnunderwriterLink();
			 NB_realEstate_claimPage= underwriterpage.CreateNewApp();
			 // driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
			//  driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
			  
//			  driver.manage().timeouts().pageLoadTimeout(4, TimeUnit.MILLISECONDS);
//			  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
//			 
//			    NB_realEstate_claimPage= underwriterpage.CreateNewApp();
			 
			 
			     
		} catch (IOException e) {
			 
			e.printStackTrace();
		}
	}
	
//	@Test(priority =3,dataProvider = "AppDetail_Data")
//	public void Validate_typeOfFirm_Test(String selectFirm,String ftimeCPA)
//	{
//		AppDetail_Accordion_Page.Validate_AppDetail_Accordion(selectFirm, ftimeCPA);
//		 
//	}

	
	 
//	@DataProvider(name="AppDetail_Data") 
//	  public Object[][] getLandyTestData() throws InvalidFormatException
//	  {
//		  Object data[][]=TestUtil.getTestData("sheetname");
//		  return data;
//		  
//	  }
}
	 
