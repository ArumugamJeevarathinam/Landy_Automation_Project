package com.Landy.testcases;


import java.io.IOException;

import org.testng.annotations.Test;

import com.Landy.Pages.HomePage;
import com.Landy.Pages.LoginPage;
import com.Landy.Pages.UnderwritingPage;
import com.Landy.base.TestBase;

import junit.framework.Assert;

public class UnderwritingPageTest extends TestBase{
	
	
	 

	LoginPage loginPage;
	HomePage homePage;
	UnderwritingPage underwriterpage;
	 
	

	public UnderwritingPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test(priority =1)
	public void setUp() throws IOException
	{
		initialization();
		underwriterpage = new UnderwritingPage();
		loginPage = new LoginPage();
		homePage =loginPage.Login(prop.getProperty("username"), prop.getProperty("password"));
		underwriterpage= homePage.clickOnunderwriterLink();
	}
	
	@Test(priority =2)
	public void verifyUnderwriterpageLabelTest()
	{
	boolean	flag=underwriterpage.verifyUnderwriterpageLabel();
	Assert.assertTrue(flag);
	
	//Assert.assertTrue(underwriterpage.verifyUnderwriterpageLabel(), "Contact label is missing");
	}
	
	@Test(priority =3)
	public void CreateNewAppTest() throws IOException
	{
		underwriterpage.CreateNewApp();
		
		 
	}
}
