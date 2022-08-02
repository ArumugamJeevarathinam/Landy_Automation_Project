package com.Landy.Pages;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Landy.base.TestBase;

public class select_State_lob extends TestBase{

	
	@FindBy(xpath = " //label[contains(text(),'State')]/parent::div/child::select")
	 
	WebElement NB_State_DropdownSelect;
	
	@FindBy(xpath = "//label[contains(text(),'Line of Business')]/parent::div//child::select[@id='state']")
	 
	WebElement NB_LOB_Dropdown_Select;
	
	
	
	public select_State_lob() throws IOException 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Select_State(String state)
	{
		Select select = new Select(driver.findElement(By.xpath("//label[contains(text(),'State')]/parent::div/child::select")));
		//Select state = new Select(NB_State_DropdownSelect);
		select.selectByVisibleText(state);
		

	}
	
	public void Select_LineOfBusiness( int lobname)
	{
		
		Actions action = new Actions(driver);
		WebElement drop_down =driver.findElement(By.xpath("//label[contains(text(),'Line of Business')]/parent::div//child::select[@id='state']"));
		action.moveToElement(drop_down).build().perform();
	    action.click();
	
	    Select select = new Select(drop_down);
	     
	    //select.selectByVisibleText("Real Estate Standard");
		 select.selectByIndex(lobname);
		//select.selectByVisibleText("Real Estate Standard");
		drop_down.sendKeys(Keys.ENTER);
	}

}
