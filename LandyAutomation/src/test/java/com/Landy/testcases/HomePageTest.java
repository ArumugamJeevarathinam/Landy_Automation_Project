package com.Landy.testcases;

import static org.junit.Assert.assertArrayEquals;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Landy.Pages.HomePage;
import com.Landy.Pages.LoginPage;
import com.Landy.Pages.UnderwritingPage;
import com.Landy.base.TestBase;
import com.Landy.util.TestUtil;

 

public class HomePageTest  extends TestBase{
	
	
	LoginPage loginPage;
	HomePage homePage;
	UnderwritingPage underwriterpage;
	

	public HomePageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Test(priority = 1)
	public void setUp() throws IOException
	{
		initialization();
		underwriterpage = new UnderwritingPage();
		loginPage = new LoginPage();
		homePage =loginPage.Login(prop.getProperty("username"), prop.getProperty("password"));
	}
 
	@Test(priority = 2)
	public void verifyHomepageTitle()
	{
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		String homepagetitle= homePage.verifyHomepageTitle();
		Assert.assertEquals(homepagetitle, "Landy Insurance App");
		 
	}
	
	@Test(priority = 3)
	public void verifyuserNameTest()
	{
	boolean flag	= homePage.verifyCorrectUsername();
	Assert.assertTrue(flag);
	
 
	}
	@Test(priority = 4)
	public void verifyhomepageusernameTest()
	{
	String homeuser	=homePage.VerifyHomepageusername();
	System.out.println("The Logged in User name is "+homeuser);
	}
	
	
	@Test(priority = 5)
	public void ClickOnUnderWritingLink() throws IOException
	{
		underwriterpage= homePage.clickOnunderwriterLink();
	}
//	@AfterMethod
//	public void close()
//	{
//		driver.quit();
//	}

	
}
