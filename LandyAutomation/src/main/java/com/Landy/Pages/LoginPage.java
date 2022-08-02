package com.Landy.Pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Landy.base.TestBase;
import com.Landy.util.TestUtil;

public class LoginPage extends TestBase{

	

	// Defined the page factory or object repostory 
	
	@FindBy(xpath = "//input[@placeholder='Email']")
	 
	WebElement username ;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	 
	WebElement password ;
	
	@FindBy(xpath = "//button[@type='submit']")
	 
	WebElement loginbtn ; 
	
	
	@FindBy(xpath = "//*[text()= ' Forgot password? ']")
	@CacheLookup
	WebElement ForgotPass ;
	
	@FindBy(xpath = "//*[text()='Sign In to your account.']")
	@CacheLookup
	WebElement ValidateLoginPage ; 
	
	
	public LoginPage() throws IOException {
		super();
		
		// define all the elements with page factory to webdriver
		 //PageFactory.initElements(driver, LoginPage.class);
		 PageFactory.initElements(driver, this);
		  
		 
	}
	
	public String validateLoginPageTitle()
	{
		//this methos return string
		return driver.getTitle();
	}
	
//	public boolean  ValidateLandyImg()
//	{
//		return landyLogo.isDisplayed();
//	}
	
	public HomePage Login(String un,String pass ) throws IOException
	{
		username.sendKeys(un);
		password.sendKeys(pass);
		loginbtn.click();
//		 driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
//	     driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
//	     
	     
		
		return new HomePage();
	}
}
