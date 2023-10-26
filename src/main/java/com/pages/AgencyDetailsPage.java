package com.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;


import com.testbase.TestBase;

public class AgencyDetailsPage extends TestBase{

	public AgencyDetailsPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@id='organizationName' and @placeholder='Enter Agency Name']")
    WebElement AgencyName;
	
	@FindBy(xpath="//input[@id='organizationAddress1' and @placeholder='Enter Agency Street Address']")
	WebElement AgencyAdress;
	
	@FindBy(xpath="//input[@id='city' and @placeholder='City']")
	WebElement city;

	@FindBy(xpath="//ng-select[@formcontrolname='state']/div[@class='ng-select-container']")
	WebElement statedropdown;
	
	@FindBy(xpath="//span[@ng-reflect-ng-item-label='AL']")
	WebElement state;
	
	@FindBy(id="zip")
	WebElement code;
	
	
			
	public void Enterdetails() {
		AgencyName.sendKeys("Yash");
		AgencyAdress.sendKeys("Yash Madhapur");
		city.sendKeys("Hyderabad");
		statedropdown.click();
		state.click();
	    code.sendKeys("50098");
	    
	    }
	
	@FindBy(xpath="//ng-select[@formcontrolname='businessTypes']/div[@class='ng-select-container']")
	WebElement businessType;
	
	@FindBys(@FindBy(xpath="//ng-dropdown-panel[@class='ng-dropdown-panel ng-select-multiple ng-star-inserted ng-select-bottom']//div//label"))
	List<WebElement> businesscheckbx;
	
	public void businessDropdwn() {
		businessType.click();
		for(int i=0; i<=1; i++) {
			String element=businesscheckbx.get(i).getText();
			System.out.println("Business type is=" +element);
			if(businesscheckbx.get(i).getText().contains("Builder")) {
				businesscheckbx.get(i).click();
				break;
			}
		}
		
	}
	
	@FindBy(xpath="//ng-select[@formcontrolname='transactionsType']//div[@class='ng-select-container']")
	WebElement dealType;
		
	@FindBys(@FindBy(xpath="//ng-dropdown-panel[@class='ng-dropdown-panel ng-select-multiple ng-star-inserted ng-select-bottom']//div//label"))
	List<WebElement> sellType;
	
	public void businessSell() {
		dealType.click();
		for(int i=0; i<=sellType.size(); i++) {
			if(sellType.get(i).getText().contains("Buy/Sell")) {
				sellType.get(i).click();
				break;
			}
		}
	}
	
	@FindBy(xpath="//ng-select[@formcontrolname='underwritersBusiness']//div[@class='ng-select-container']")
	WebElement businessLoc;
	
	@FindBys(@FindBy(xpath="//ng-dropdown-panel[@class='ng-dropdown-panel ng-select-multiple ng-star-inserted ng-select-top']//div//label"))
	List<WebElement> businessLocation;
	
	public void businessLocationTypes() {
		businessLoc.click();
		for (int i=0;i<=businessLocation.size(); i++) {
			if(businessLocation.get(i).getText().contains("New York")) {
				businessLocation.get(i).click();
				break;
			}		
		}
	}
	
	@FindBy(xpath="//ng-select[@formcontrolname='businessStates']//div[@class='ng-select-container']")
	WebElement businessCity;
	
	@FindBys(@FindBy(xpath="//ng-dropdown-panel[@class='ng-dropdown-panel ng-select-multiple ng-star-inserted ng-select-top']//div//label"))
	List<WebElement> busDrpdwn;
	
	public void businessCityDrpdwn() {
		businessCity.click();
		for (int i=0;i<=busDrpdwn.size(); i++) {
			String businessSel=busDrpdwn.get(i).getText();
			if(busDrpdwn.get(i).getText().contains("New Jersey")) {
				busDrpdwn.get(i).click();
				break;
			}		
		}
	}
	
	@FindBy(xpath="//ng-select[@formcontrolname='usersRange']//div[@class='ng-select-container']")
	WebElement EmpSal;
	
	@FindBys(@FindBy(xpath="//ng-dropdown-panel[@class='ng-dropdown-panel ng-star-inserted ng-select-bottom']//div"))
	List<WebElement> employerSal;

	
	public void totalEmployee() {
		EmpSal.click();
		for(int i=0;i<=employerSal.size();i++) {
			String List=employerSal.get(i).getText();
			if(employerSal.get(i).getText().contains("0-10")) {
				employerSal.get(i).click();
				break;
			}
		}
	}
	
   @FindBy(xpath="//button[contains(text(),'NEXT')]")
   WebElement nextBtn;
   public void nextButtonClk() {
	   nextBtn.click();
   }
   
   @FindBy(xpath="//div[contains(text(), 'Please enter your agency name')]")
   WebElement agencynameValidate;
   public boolean validateAgencyDetails() {
	   AgencyName.sendKeys(Keys.TAB);
	   boolean valAgencyname=agencynameValidate.isDisplayed();
	   System.out.println("Validation of Agencyname=" +valAgencyname);
	return valAgencyname;
	   }
   
   @FindBy(xpath="//div[contains(text(),'Please enter your agency address ')]")
   WebElement Agencyvalidate;
   public boolean validateAgencyAdress() {
	   AgencyAdress.sendKeys(Keys.TAB);
	   boolean valAgencyaddress=Agencyvalidate.isDisplayed();
	   System.out.println("Validation of agencyAddress=" +valAgencyaddress);
	return valAgencyaddress;   
   }
   
   @FindBy(xpath="//div[contains(text(),'Please enter city name.')]")
   WebElement validateCity;
   public boolean validateCitydetails() {
	   city.sendKeys(Keys.TAB);   
	   boolean valCity=validateCity.isDisplayed();
	   System.out.println("Validation of agencyCity=" +valCity);
	return valCity;
	   }
   
   @FindBy(xpath="//div[contains(text(),'Please enter zip.')]")
   WebElement valZip;
   public boolean validatepincode() {
	   code.sendKeys(Keys.TAB);
	   boolean zipcodevalidate=valZip.isDisplayed();
	   System.out.println("Validation of agencyCode=" +zipcodevalidate);
	return zipcodevalidate;
	   }
   
   public void validPincode() throws InterruptedException {
	  code.sendKeys("509");
	  Thread.sleep(2000);
	  code.clear();
	  code.sendKeys("567890");
	  Thread.sleep(2000);
	  code.clear();
	  Thread.sleep(2000);
	  code.sendKeys("ASDF");
	  Thread.sleep(2000);
	  code.clear();
	  Thread.sleep(2000);
	  code.sendKeys("!@#$");
	  Thread.sleep(2000);
	  code.clear();
	   }
   
   public boolean disableNext() {
	 boolean nextdis=nextBtn.isDisplayed();
	 System.out.println("next disabled button is=" +nextdis);
	return nextdis;
     }
    
}
