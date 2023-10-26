package com.pages;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import com.testbase.TestBase;

public class RemxPropertiesPage extends TestBase{

	public RemxPropertiesPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//ng-select[@formcontrolname='disclosureType']//div[@class='ng-select-container ng-has-value']")
	WebElement property;
	
	@FindBys(@FindBy(xpath="//ng-dropdown-panel[@class='ng-dropdown-panel ng-select-bottom']//div"))
	List<WebElement> resedentialplot;
	
	public void propertyType() throws InterruptedException {
		property.click();
		Thread.sleep(2000);
	for(int i=0; i<=resedentialplot.size(); i++) {
		String property=resedentialplot.get(i).getText();
		if(resedentialplot.get(i).getText().contains("Resendential Plot")) {
			resedentialplot.get(i).isSelected();
			break;
			}
	}
		}
	
	@FindBy(xpath="//ng-select[@formcontrolname='transactionType']//div[@class='ng-select-container ng-has-value']")
	WebElement transcition;
	
	@FindBys(@FindBy(xpath="//ng-dropdown-panel[@class='ng-dropdown-panel ng-select-bottom']//div"))
	List<WebElement> purchasedrp;
	
	public void transcitionType() throws InterruptedException {
		transcition.click();
		Thread.sleep(2000);
		
		for(int i=0; i<purchasedrp.size(); i++) {
			String transtype=purchasedrp.get(i).getText();
			if(purchasedrp.get(i).getText().contains("Purchase")) {
				purchasedrp.get(i).isSelected();
				break;
			}
		}
	}
	
	
	@FindBy(xpath="//label[@for='cashClosing']")
	WebElement cash;
	
	public void clickOnCash() {
		cash.isSelected();
	}

	@FindBy(xpath="//input[@id='salesPrice']")
	WebElement price;
	
	@FindBy(xpath="//label[@for='financeClosing']")
	WebElement cashfinclosing;
	
	@FindBy(xpath="//input[@id='loanAmount']")
	WebElement loanamount;
	
	@FindBy(xpath="//input[@id='closingDate']")
	WebElement closingdate;
	
	@FindBy(xpath="//input[@id='disbursementDate']")
	WebElement disbursementDate;
	
	public void salesLoanAmount() {
		//Actions actions=new Actions(driver);
		price.clear();
		price.sendKeys("8000");
//		price.sendKeys(Keys.chord(Keys.CONTROL, "8000"));

		cashfinclosing.click();
	}
	
	
	public void LoanAmount() {
		//Actions actions=new Actions(driver);
		loanamount.clear();
		loanamount.sendKeys("400");
		//loanamount.sendKeys(Keys.chord(Keys.CONTROL, "400"));
	}
	
	public void cashFinance() throws InterruptedException {

		closingdate.clear();
		closingdate.sendKeys("01-01-2022");
		Thread.sleep(2000);
		disbursementDate.clear();
		Thread.sleep(5000);
		disbursementDate.sendKeys("04-10-2022");
		Thread.sleep(2000);
		}
	
	/*@FindBy(xpath="//ng-select[@formcontrolname='financeInstitute']//div[@class='ng-select-container ng-has-value']")
	WebElement finance;
	
	@FindBys(@FindBy(xpath="//ng-dropdown-panel[@class='ng-dropdown-panel ng-select-bottom']//div"))
	List<WebElement> financelist;
	
	public void FinanceInstituteType() throws InterruptedException {
		//Thread.sleep(2000);
		finance.click();
		Thread.sleep(200);
	for(int i=0; i<=financelist.size();i++) {
		String financelisttype=financelist.get(i).getText();
		if(financelist.get(i).getText().contains("Morgan Stanley")) {
			financelist.get(i).isSelected();
		}
	}
	}*/
	
@FindBy(xpath="//input[@id='dealAgentName']")
WebElement dealAgent;

@FindBy(xpath="//input[@id='agencyOwnerName']")
WebElement Agentowner;

@FindBy(xpath="//input[@id='mobNumOfDealAgent']")
WebElement MobileNo;
	
@FindBy(xpath="//input[@id='agencyContactNumber']")
WebElement agencycontactNo;

public void contactDetails() throws InterruptedException {
	dealAgent.clear();
	Thread.sleep(2000);
	dealAgent.sendKeys("Jack");
	Agentowner.clear();
	Thread.sleep(2000);
	Agentowner.sendKeys("Daniel");
	
	MobileNo.sendKeys("8456790321");
	agencycontactNo.sendKeys("8678943210");
}

@FindBy(xpath="//ng-select[@formcontrolname='brieflegal']//div[@class='ng-select-container ng-has-value']")
WebElement propertytype;

@FindBys(@FindBy(xpath="//ng-dropdown-panel[@class='ng-dropdown-panel ng-select-bottom']//div"))
List<WebElement> financelisttype;

public void propertyDeatils() {
propertytype.click();
for(int i=0; i<financelisttype.size()-1;i++) {
	String financeproperty=financelisttype.get(i).getText();
	if(financelisttype.get(i).getText().contains("Jolly City")) {
		financelisttype.get(i).isSelected();
	}
}
}

  @FindBy(xpath="//textarea[@id='address']")
  WebElement propertyadds;

  @FindBy(xpath="//input[@id='city']")
  WebElement selectcity;
  
 public void validDetails() throws InterruptedException {
	 propertyadds.clear();
	 Thread.sleep(200);
	 propertyadds.sendKeys("Clarcks Berg, New Jersey");
	 selectcity.clear();
	 selectcity.sendKeys("New Jersey");
 }
 
 
 /*@FindBy(xpath="//ng-select[@formcontrolname='state' and @name='state']//div[@class='ng-select-container']")
 WebElement clickonstate;

 @FindBys(@FindBy(xpath="//ng-dropdown-panel[@class='ng-dropdown-panel ng-select-top']//div"))
 List<WebElement> state;


 public void ClickOnState() {
	 clickonstate.click();
 for(int i=0; i<=state.size();i++) {
 	String financeproperty=state.get(i).getText();
 	if(state.get(i).getText().contains("FL")) {
 		state.get(i).isSelected();
 	}
 }
 }*/

 @FindBy(xpath="//input[@formcontrolname='zip']")
 WebElement Zip;
 
 @FindBy(xpath="//input[@formcontrolname='county']")
 WebElement Country;
 
 @FindBy(xpath="//input[@formcontrolname='municipality']")
 WebElement municipality;
 
 @FindBy(xpath="//input[@formcontrolname='subdivision']")
 WebElement divison;
 
 @FindBy(xpath="//input[@formcontrolname='lot']")
 WebElement lot;
 
 @FindBy(xpath="//input[@formcontrolname='parcelId']")
 WebElement parcelid;
 
 public void propertyDetailsData() {
	 Zip.clear();
	 Zip.sendKeys("89076");
	 Country.clear();
	 Country.sendKeys("USA");
	 municipality.clear();
	 municipality.sendKeys("Rockville");
	 divison.clear();
	 divison.sendKeys("CA");
	 lot.clear();
	 lot.sendKeys("456");
	 parcelid.clear();
	 parcelid.sendKeys("67PI");	 
	 }
 
 
 @FindBy(xpath="//label[@for='file-input']")
 WebElement upload;
 
 @FindBy(xpath="/html/body/app-root/app-order-tracking/div/main/div/div/div[2]/div/app-quick-entry/div/div[2]/div/form/div[1]/div[6]/div[4]/div/input")
 WebElement upload_photo;
 
 public void uploadFile() {
	 //upload.click();
	 upload_photo.sendKeys("C:\\Users\\supriya.kommula\\Desktop\\area-pic-nic.jpg");
 }
 
 

@FindBy(xpath="//label[@for='buyerIndividual' and @class='form-check-label']")
WebElement individual;

public boolean clickonIndividualbtn() {
	boolean indbtn=individual.isDisplayed();
	System.out.println("Individual btn is selected=" +indbtn);
	return indbtn;
}

@FindBy(xpath="//label[@for='sellerOrganization']")
WebElement organization;

@FindBy(xpath="//input[@name='sellerFirstName']")
WebElement sellerfirst_name;

@FindBy(xpath="//input[@name='sellerMiddleName']")
WebElement sellermiddle_name;

@FindBy(xpath="//input[@name='sellerLastName']")
WebElement sellerlast_name;

@FindBy(xpath="//input[@name='lenderName']")
WebElement lender_name;

@FindBy(xpath="//input[@name='loanNumber']")
WebElement loan_number;

//@FindBy(xpath="//input[@class='btn btn-primary mb-3 submit-btn primary-btn']")
@FindBy(xpath="//div[@class='d-flex justify-content-center mt-5']")
WebElement clickon_submit;

public void clickonorgBtn() {
	organization.click();
	sellerfirst_name.clear();
	sellerfirst_name.sendKeys("Jane");
	sellermiddle_name.sendKeys("Jackson");
	sellerlast_name.clear();
	sellerlast_name.sendKeys("Wellinghton");
	lender_name.clear();
	lender_name.sendKeys("Jane Deo");
	loan_number.clear();
	loan_number.sendKeys("7869");
	
}

public void Testcase() {
	clickon_submit.click();
}
 
 
 @FindBy(xpath="//span[contains(text(), 'Map')]")
 WebElement map;
 
 public void ClickOnMap() {
	 map.click();
	 Set<String> S1=driver.getWindowHandles();
	 Iterator<String> Test=S1.iterator(); 
	 String parent= Test.next();
	 String child=Test.next();
	 driver.switchTo().window(child);
	 }

  
 
 @FindBy(xpath="//input[@formcontrolname='loanAmount']")
 WebElement lonmount;
 
 public boolean validRegisteruser() {
	 boolean loanamountdisabled=lonmount.isEnabled(); 
	 System.out.println("Loan amount is disabled=" +loanamountdisabled);
	 return loanamountdisabled;
	 }
 
 
 @FindBy(xpath="//input[@id='mobNumOfDealAgent']")
 WebElement agentMblno;
 
 @FindBy(xpath="//div[contains(text(), 'Please enter valid mobile number.')]")
 WebElement validMblno;
 
 
 public boolean dealAgentMblNo() {
	 agentMblno.clear();
	 agentMblno.sendKeys("8976543567832660");	
	 boolean validatemblno=validMblno.isDisplayed();
	 System.out.println("Validate message is showing=" +validatemblno);
	 return validatemblno;
	 }
 
 public boolean dealAgentMblNo2() throws InterruptedException {
	 Thread.sleep(2000);
	 agentMblno.clear();
	 agentMblno.sendKeys("8769543219876520");
	 boolean validatemblno1=validMblno.isDisplayed();
	 System.out.println("Validate message is showing for secondtime=" +validatemblno1);
	return validatemblno1;
	 }
 
 @FindBy(xpath="//input[@class='btn btn-primary mb-3 submit-btn primary-btn']")
 WebElement submitDis;
 
 public boolean submitisDisabled() {
	 boolean submitdis=submitDis.isDisplayed();
	 System.out.println("Submit button is disabled=" +submitdis);
	return submitdis;
	 
 }
 
}
