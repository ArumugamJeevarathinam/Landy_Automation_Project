package com.Landy.Pages;



import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Landy.base.TestBase;

public class NB_RealEstate_ClaimPage extends TestBase {

	
	 

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
	
	//    //div[@class='col-sm-6']//*[contains(text(),'Search Location')]/following-sibling::input
	
	@FindBy(xpath = "//div[@class='col-sm-6']//*[contains(text(),'Search Location')]/following-sibling::input")
	WebElement searchLocation;
	
	public @FindBy(xpath = "//div[@class='cdk-overlay-pane']")
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
	
	@FindBy(xpath = "	//button[contains(text(),'save & Close')]")
	WebElement saveAndCloseBtn;
	
	@FindBy(xpath = "//span[contains(text(),'Application Details')]")
	WebElement App_DetailAccordion;
	
	//span[contains(text(),'Application Details')]
	
	//...................App Details accordion Page
	
	@FindBy(xpath = " //span[contains(text(),'Application Details')]")	 
	WebElement AppDetail_accordionBtn;
	
	
	@FindBy(xpath = "//label[contains(text(),'Full Time Professionals')]/parent::div//input")	 
	WebElement TypeofFirm;
	
	@FindBy(xpath = "//label[contains(text(),'Full Time Professionals')]/parent::div//input")	 
	WebElement FullTimeProff;
	
	@FindBy(xpath = "//label[contains(text(),'Part Time Professionals')]/parent::div//input")	 
	WebElement PartTimeProff;
	
	@FindBy(xpath = "//label[contains(text(),'FT Admin')]/parent::div//input")	 
	WebElement FTAdmin;
	
	@FindBy(xpath = "//label[contains(text(),'PT Admin')]/parent::div//input")	 
	WebElement PTAdmin;
	
	@FindBy(xpath = "//label[contains(text(),'Home Warranty')]/parent::div//select")	 
	WebElement HomeWarrantyDrop;
	

	@FindBy(xpath = "//label[contains(text(),'Professional Designation')]/parent::div//select")	 
	WebElement ProfessionalDesigDrop;
	

	
	

	
	 
	
	public NB_RealEstate_ClaimPage() throws IOException 
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
   
   public String Select_lob(String lob)
  	{
  		Select select = new Select(driver.findElement(By.xpath("//label[contains(text(),'State')]/parent::div/child::select")));
  		//Select state = new Select(NB_State_DropdownSelect);
  		select.selectByVisibleText(lob);
  		return lob;
  		

  	}
   
   public String  Select_LOB(String lob)
	{
	   Actions action = new Actions(driver);
		WebElement drop_down =driver.findElement(By.xpath("//label[contains(text(),'Line of Business')]/parent::div//child::select[@id='state']"));
		action.moveToElement(drop_down).build().perform();
	    action.click();
	
	    Select select = new Select(drop_down);
	     
	     select.selectByValue(lob);
		 //select.selectByIndex(lob);
		//select.selectByVisibleText("Real Estate Standard");
		drop_down.sendKeys(Keys.ENTER);
		 return lob;
		

	}
	
	
	
	public void SelectRE_Std( )
	{
		
		Actions action = new Actions(driver);
		WebElement drop_down =driver.findElement(By.xpath("//label[contains(text(),'Line of Business')]/parent::div//child::select[@id='state']"));
		action.moveToElement(drop_down).build().perform();
	    action.click();
	
	    Select select = new Select(drop_down);
	     
	    //select.selectByVisibleText("Real Estate Standard");
		 select.selectByIndex(1);
		//select.selectByVisibleText("Real Estate Standard");
		drop_down.sendKeys(Keys.ENTER);
	}
	
	 
 
	public void enterProducer(String Prodname) throws InterruptedException
	{
		
        pickProducer.click();
 	   	pickProducer.sendKeys(Prodname);
 	    Thread.sleep(5000);
 		pickProducer.clear();
     	pickProducer.sendKeys(Prodname);
     	Thread.sleep(5000);
    	pickProducer.sendKeys(Keys.ARROW_DOWN);
    	pickProducer.sendKeys(Keys.ENTER);
    	((JavascriptExecutor)driver).executeScript("scroll(0,1000)");
	
//		driver.findElement(By.xpath("//div[@class='col-sm-12']//form//child::div//child::div[@class='mat-form-field-infix']//input")).click();
//		driver.findElement(By.xpath("//div[@class='col-sm-12']//form//child::div//child::div[@class='mat-form-field-infix']//input")).sendKeys(Prodname);
//		pickProducer.sendKeys(Keys.ENTER);
	}
	
	
//	public void enterProducerFromExcel(String producer)
//	{
//		//WebDriverWait wait = new WebDriverWait(driver, 30);
//		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("Producer_Select")));
//		pickProducer.click();
//		pickProducer.sendKeys(producer);
//		
//		pickProducer.clear();
//		
//		WebDriverWait wait = new WebDriverWait(driver, 20);
//		wait.until(ExpectedConditions.elementToBeClickable(pickFirmName));
//		
//		pickProducer.sendKeys(producer); 
//		
//     	WebDriverWait wait1 = new WebDriverWait(driver, 30);
//		wait1.until(ExpectedConditions.elementToBeClickable(pickFirmName));
//	 
//		pickProducer.sendKeys(Keys.ARROW_DOWN);
//		pickProducer.sendKeys(Keys.ENTER);
//		
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
 		
 	    Thread.sleep(2000);
 	   // if(!driver.findElements(By.xpath(" //div[@class='col-sm-6']//*[contains(text(),'Search Location')]/following-sibling::input")).isEmpty())
	 try {
 		 
 		  for(int i=0;i<2;i++)
	
	  {
 			  //=alertbtnNO.isEnabled();
 			  
			 if(mordenAler.isDisplayed())
 			 {
				 try {
 					 alertbtnYes.click();
 				 } catch (NoSuchElementException e)  { System.out.println("No mordenalert avalible");}
			 }
			 
			// else
			// {
			//	 pickFirmName.sendKeys(Firmname);
			//	 pickFirmName.sendKeys(Keys.ENTER);
			//	 scrolldown();
			// }
 			 
 		  }
 					  	   
 		 
 	 } catch (NoSuchElementException e) {System.out.println("Morden alert element is not presene");}

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
 	 
 
 			
	}
	
	 
public void searchLocation(String loc)
{
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(searchLocation));
	searchLocation.clear();
	searchLocation.click();
	searchLocation.sendKeys(loc);
	searchLocation.sendKeys(Keys.ENTER);
	
	
	}
	
	
	public boolean isAlertPresent() {

	    boolean presentFlag = false;

	    try {

	         
	        Alert alert = driver.switchTo().alert();
	       
	        String text = alert.getText();
	        presentFlag = true;
	         
	        if(text.equals("Do you want to load this selected firm client information data?"))
     		 {
 	    			 System.out.println(text);
     		 }
 	    		 else
 	    		 {
 	    			 System.out.println("No alert found");
 	    		 }
	    		
 	    		  
	        alert.accept();
	       

	    } catch (NoAlertPresentException ex) {
	         
	        ex.printStackTrace();
	    }

	    return presentFlag;
	}
	
	
	
	
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
		
		//select[@name='typeOfFirmReId']
		 
		
		 
		Select selectRetro= new Select(retroDrop);
		selectRetro.selectByVisibleText(retrodate);
		retroDrop.sendKeys(Keys.ENTER);
	//	
//		System.out.println("Selected App Source is "+selectRetro.getFirstSelectedOption());
	//	
//		 List<WebElement> retrodateOptions=selectRetro.getOptions();
//		 WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait.until(ExpectedConditions.visibilityOfAllElements(retrodateOptions));
		
	}

//	public Application_Details_Accordion_Page validateSaveBtn() throws IOException
//	{
//		saveAndcontinueBtn.click();
//		return new Application_Details_Accordion_Page();
//		
//		}
	
	public void  validateSaveBtn() throws IOException
	{
		saveAndCloseBtn.click();
		//driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		//App_DetailAccordion.click();
		//return new Application_Details_Accordion_Page();
		 
		}
	
	// App Detail Accordion Page
	
	//.........................................................................................
	
	
	public void Validate_AppDetail_Accordion(String firmName)
	{
		Actions action = new Actions(driver);
		WebElement firmDrop = driver.findElement(By.xpath(" //select[@id='typeOfFirmReId']"));
		action.moveToElement(firmDrop).build().perform();
		action.click();
		
		Select typeSelect= new Select(firmDrop);
		typeSelect.selectByVisibleText(firmName);
		firmDrop.sendKeys(Keys.ENTER);
		
	}
	
	public void appDetails_Accordion()
	{
		AppDetail_accordionBtn.click();
	    
	}
	
	public String Validate_AppDetail_TypeOfFirm(String firmType)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement typeOfirm=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='typeOfFirmReId']")));
		typeOfirm.click();
		
		Select typeFirmSelect = new Select(typeOfirm);
		typeFirmSelect.selectByValue(firmType);
		return firmType;
		 
	}
	
	public String  App_Detail_FTProfessionals(String string)
	{
		FullTimeProff.sendKeys(string);
		return string;
	}
	
	
	public String  App_Detail_PTProfessionals( String ptProff)
	{
		PartTimeProff.sendKeys(ptProff);
		return ptProff;
	}
	
	public String  App_Detail_FTAdmin( String ftadmin)
	{
		FTAdmin.sendKeys(ftadmin);
		return ftadmin;
	}
	
	public String  App_Detail_PTAdmin( String ptadmin)
	{
		PTAdmin.sendKeys(ptadmin);
		return ptadmin;
	}
	
 
	
	public String Validate_AppDetail_HomeWarranty(String homewarr)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement homeWarranty=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[contains(text(),'Home Warranty')]/parent::div//select")));
		homeWarranty.click();
		Select typeFirmSelect = new Select(homeWarranty);
		typeFirmSelect.selectByValue(homewarr);
		return homewarr;
		 
	}
	
	public String Validate_AppDetail_ProffWarranty(String proffwarr)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement professWarranty=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[contains(text(),'Professional Designation')]/parent::div//select")));
		professWarranty.click();
		
		Select typeFirmSelect = new Select(professWarranty);
		typeFirmSelect.selectByValue(proffwarr);
		return proffwarr;
		 
	}
	 
}

