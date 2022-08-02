package com.Landy.Pages;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
 

import com.Landy.base.TestBase;
 

public class new_GCI_accordion_Page extends TestBase{

	
	
	@FindBy(xpath = " //label[contains(text(),'State')]/parent::div/child::select")	 
	WebElement NB_State_DropdownSelect;
	
	@FindBy(xpath = "//label[contains(text(),'Line of Business')]/parent::div//child::select[@id='state']")	 
	WebElement NB_LOB_Dropdown_Select;
	
	
	@FindBy(xpath = "//div[@class='col-sm-12']//form//child::div//child::div[@class='mat-form-field-infix']//input")	 
	WebElement pickProducer;
	
	@FindBy(xpath = "//input[@placeholder='Pick a Firm Name']")	 
	WebElement pickFirmName;
	
	 
	public @FindBy(xpath = " //p[@class='text-right']/child::button[1]")	 
	WebElement alertbtnYes;
	
	
	public @FindBy(xpath = " //p[@class='text-right']/child::button[2]") 
	WebElement alertbtnNO;
	
	@FindBy(xpath = "//div[@class='col-sm-6']//*[contains(text(),'Search Location')]/following-sibling::input")	 
	WebElement searchLocation;
	
    @FindBy(xpath = "//div[@class='cdk-overlay-pane']")	 
	WebElement mordenAler;
	
	@FindBy(xpath = "//*[@id='address1']")
	WebElement Address1;
	
	@FindBy(xpath = "//*[@id='ipCode']")
	WebElement Zip;
	 
	@FindBy(xpath = "//*[@id='state']")
	WebElement state;
	
	@FindBy(xpath = "//label[contains(text(),'County')]/parent::div/child::div//input")
	WebElement countyname;
	
	@FindBy(xpath = "//*[@placeholder='First Name']")
	WebElement firstname;
	
	@FindBy(xpath = "//*[@placeholder='Last Name']")
	WebElement lastname;
	
	@FindBy(xpath = "//*[@placeholder='Email Address']")
	WebElement email;
	
	
	@FindBy(xpath = "//input[@placeholder='Phone']")
	WebElement phoneNumb;
	
	@FindBy(xpath = "//label[contains(text(),'App Source')]/parent::div/child::select")
	WebElement appSource;
	
	public @FindBy(xpath = "//table[@class='table table-borderless table-sm tmp ng-star-inserted']//tr[2]//a/span")	 
	WebElement selectdSate;
	
	@FindBy(xpath = "//label[contains(text(),'Effective Date')]/parent::div//div//input")
	WebElement effectiveDate;
	
	@FindBy(xpath = "//label[contains(text(),'Expiration Date')]/parent::div//div//input")
	WebElement expirationDate;
	
	@FindBy(xpath = "//div[@class='col-sm-3 ng-star-inserted']//label[contains(text(),'Retroactive Date ')]//select")
	WebElement retroDataDrodown;
	
	@FindBy(xpath = "//label[contains(text(),'Date of Establishment')]/parent::div//div//input")
	WebElement establishmentDate;
	
	@FindBy(xpath = "//label[contains(text(),'Application Received Date')]/parent::div//div//input")
	WebElement appReceivedDate;
	
	@FindBy(xpath = " //button[contains(text(),' Save & Continue ')]")
	WebElement saveAndcontinueBtn;
	
	
	public new_GCI_accordion_Page() throws IOException
	{
		PageFactory.initElements(driver, this);
		 
	}
	
	public String Select_State(String state)
	{
		Select select = new Select(driver.findElement(By.xpath("//label[contains(text(),'State')]/parent::div/child::select")));
		//Select state = new Select(NB_State_DropdownSelect);
		select.selectByVisibleText(state);
		return state;
		

	}
	
	public void Select_LOB(int lob )
	{
		
//		Actions action = new Actions(driver);
     	WebElement drop_down =driver.findElement(By.xpath("//label[contains(text(),'Line of Business')]/parent::div//child::select[@id='state']"));
//		action.moveToElement(drop_down).build().perform();
//	    action.click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[contains(text(),'Line of Business')]/parent::div//child::select[@id='state']"))).click();
		
	    Select select = new Select(drop_down);
	     
	    //select.selectByVisibleText("Real Estate Standard");
		 select.selectByIndex(lob);
		//select.selectByVisibleText("Real Estate Standard");
		drop_down.sendKeys(Keys.ENTER);
		
	
	}
	
//	public   void createNewContact(String address1, String zip,String countyname,String ftName,String ltName,String mail)
//	{
//		
//		Addressline1.sendKeys(address1); 
//		Zipcode.sendKeys(zip);
//		county.sendKeys(countyname);
//		firstname.sendKeys(ftName);
//		lastname.sendKeys(ltName);
//		email.sendKeys(mail);
//		
//	}
	
	public void enterFirmname(String Firmname) throws InterruptedException 
	{

	 	pickFirmName.click();
 		pickFirmName.sendKeys(Firmname);
 	    pickFirmName.clear();
 		pickFirmName.sendKeys(Firmname);
 		((JavascriptExecutor)driver).executeScript("scroll(0,1000)");
 		 //Thread.sleep(5000);
 	   pickFirmName.sendKeys(Keys.ARROW_DOWN);
 		pickFirmName.sendKeys(Keys.ENTER);
 		
 		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
 	   // Thread.sleep(5000);
 	   // if(!driver.findElements(By.xpath(" //div[@class='col-sm-6']//*[contains(text(),'Search Location')]/following-sibling::input")).isEmpty())
	 
  
 			if(alertbtnYes.isDisplayed())
 			 {
  					  	 alertbtnYes.click();
 				  	 
 				  	//WebDriverWait wait1= new WebDriverWait(driver,Duration.ofSeconds(10));
  	 			 }  else
  	 			 {
  	 				 pickFirmName.sendKeys(Firmname);
 					 pickFirmName.sendKeys(Keys.ENTER);
 					 scrolldown();
  	 			 }
 		 
 		  }
 					  	   
 		 
 	 

 	// searchLocation.clear();
 	   
// 	 WebElement LinkFirm = driver.findElement(By.xpath("//div[@id='cdk-overlay-3']//button[contains(text(),'No')]"));
// 	 
// 	 if(LinkFirm.isEnabled())
// 	 {
// 		LinkFirm.click();
// 	 }
// 	 else
// 	 {
// 		 System.out.println("No Firm Link Avalible");
// 	 }
 	 
 
 			
 
		
	public void CreateContat(String add1,String zip,String countyname1,String firstname1,String lastname1,String mailid)
	{
		
		Address1.clear();
		Address1.sendKeys(add1);
		
		Zip.clear();
		Zip.sendKeys(zip);
		
		countyname.clear();
		countyname.sendKeys(countyname1);
		
		firstname.clear();
		firstname.sendKeys(firstname1);
		
		lastname.clear();
		lastname.sendKeys(lastname1);
		
		email.clear();
		email.sendKeys(mailid);
	}
	
	
	
	public void selectAppsource(String applicationSource) throws IOException
	{
 
		Actions action = new Actions(driver);
		WebElement appsourceDrop = driver.findElement(By.xpath("//label[contains(text(),'App Source')]/parent::div/child::select"));
		action.moveToElement(appsourceDrop).build().perform();
		action.click();
		
		Select select = new Select(appsourceDrop);
		select.selectByVisibleText(applicationSource);
		appsourceDrop.sendKeys(Keys.ENTER);
		
//		Select selectapp = new Select(driver.findElement(By.xpath("//label[contains(text(),'App Source')]/parent::div/child::select")));
//		selectapp.selectByVisibleText(applicationSource);
//		
//		WebElement option = selectapp.getFirstSelectedOption();
//		String selectedAppSource=option.getText();
//		
//		SoftAssert softassert = new SoftAssert();
//		softassert.assertEquals( "Direct", selectedAppSource,"The Selected App Sourse is not match");
//		//Assert.assertEquals( "Direct", selectedAppSource,"The Selected App Sourse is not match");
//		
//		try {
//			if(selectapp.isMultiple())
//			{
//				System.out.println("The Appsource is allow Multi-Select");
//			}
//			
//			else { System.out.println("The App Source is not Multi-Select");}
//			 
//		 }catch(Exception e) {}
//		
//		List<WebElement> allAppSource=selectapp.getOptions();
//		System.out.println("Size of options : " + allAppSource.size());
//		
//		for(int i=0; i<  allAppSource.size();i++)
//		{
//			String AppSourceNames=allAppSource.get(i).getText();
//			System.out.println("The App-Source contains: " + AppSourceNames);
//			if(AppSourceNames.equals(applicationSource));
//			{
//				allAppSource.get(i).click();
//				break;
//			}
//		}
	}
	
	  
public void validateEffectiveDate(String setEffective)
{
	effectiveDate.click();
	effectiveDate.sendKeys(setEffective);
	
	String patchedEffective=effectiveDate.getTagName();
	System.out.println("Patched Effective Date " + patchedEffective);
	String effectiveYear=patchedEffective.substring(patchedEffective.lastIndexOf("-")+1);
	
	String patchedExpiration=expirationDate.getTagName();
	System.out.println("Patched Expiration Date " + patchedExpiration);
	String  expirationYearn=patchedExpiration.substring(patchedExpiration.lastIndexOf("-")+1);
	
	 
	}

public void validateRetroDate(String retrodate)
{
	//retroDataDrodown.click();
	Actions action = new Actions(driver);
	WebElement retroDrop = driver.findElement(By.xpath("//div[@class='col-sm-3 ng-star-inserted']//label[contains(text(),'Retroactive Date ')]//select"));
	action.moveToElement(retroDrop).build().perform();
	action.click();
	
	 
	Select selectRetro= new Select(retroDrop);
	selectRetro.selectByVisibleText(retrodate);
	retroDrop.sendKeys(Keys.ENTER);
//	
//	System.out.println("Selected App Source is "+selectRetro.getFirstSelectedOption());
//	
//	 List<WebElement> retrodateOptions=selectRetro.getOptions();
//	 WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.visibilityOfAllElements(retrodateOptions));
	
}

public Application_Details_Accordion_Page validateSaveBtn() throws IOException
{
	saveAndcontinueBtn.click();
	return new Application_Details_Accordion_Page();
	
	}
 
}
	