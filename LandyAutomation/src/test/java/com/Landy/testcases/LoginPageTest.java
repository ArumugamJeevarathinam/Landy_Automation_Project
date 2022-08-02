package com.Landy.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Landy.Pages.HomePage;
import com.Landy.Pages.LoginPage;
import com.Landy.base.TestBase;

public class LoginPageTest extends TestBase {

	LoginPage loginPage;
	HomePage homepage;
	public LoginPageTest() throws IOException {
		super(); // call super class (Testbase) constructor
		// TODO Auto-generated constructor stub
	}
	
	@BeforeMethod
	public void setup() throws IOException
	{
		initialization();
		// create the obj of login page class
		//LoginPage loginPage = new LoginPage();
		 loginPage = new LoginPage();
		 
	}
	
	@Test (priority = 1)
	public void LoginPageTitleTest()
	{
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Landy Insurance App");
	}
	
	//@Test
//	public void LandyLogoImgTest()
//	{
//		 boolean flag = loginPage.validateLoginPageImg();
	    //Assert.assertTrue(flag);
//	}
	
	
@Test(priority = 2)
	public void LoginTest() throws IOException
	{
		homepage = loginPage.Login(prop.getProperty("username"),prop.getProperty("password"));
	}
//	@AfterMethod
//	public void closebrowser()
//	{
//		driver.quit();
//	}

 

}
