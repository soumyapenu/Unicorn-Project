package com.pages;

import java.io.IOException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.testbase.TestBase;

public class HomePage extends TestBase{

	public HomePage() throws IOException {
		super();
    PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@id='address']")
	WebElement address;
	
	@FindBy(xpath="//input[@id='fileNumber']")
	WebElement dealnumber;
	
	@FindBy(xpath="//input[@value='Purchase']")
	WebElement purchase;
	
	@FindBy(xpath="//input[@value='Cash']")
	WebElement cash;
	
	@FindBy(xpath="//button[contains(text(), 'CREATE NEW')]")
	WebElement createnew;
	
	public void newDealpage() {
		address.sendKeys("19-103 integer rd, stroudsburg, NY");
		dealnumber.sendKeys("658");
		purchase.isSelected();
		cash.isSelected();
		createnew.click();
	}
	
	@FindBy(xpath="//label[@class='br-btn-group btn']")
	WebElement sale;
	
	public void dealCase() throws InterruptedException {
		address.sendKeys("19-103 integer rd, stroudsburg, NY");
		dealnumber.sendKeys("658");
		Thread.sleep(5000);
		sale.click();
		Thread.sleep(5000);
		createnew.click();
	}
	
	@FindBy(xpath="//div[contains(text(), 'Please Enter Address ')]")
	WebElement validAddress;
	
	@FindBy(xpath="//div[contains(text(), ' Please Enter Deal Number')]")
	WebElement validDeal;
	
	public boolean validateProperties() {
		address.sendKeys(Keys.TAB);
		boolean validateAdd=validAddress.isDisplayed();
		System.out.println("Valid error msg is shown=" +validateAdd);
		return validateAdd;
		}
	
	public boolean validatePropDeal() {
		dealnumber.sendKeys(Keys.TAB);
		boolean validateDeal=validDeal.isDisplayed();
		System.out.println("Valid error msg is shown for Deal=" +validateDeal);
		return validateDeal;
		}
	
	public boolean disabledCreateNew() {
		boolean disabledSub= createnew.isEnabled();
		System.out.println("Submit button is disabled=" +disabledSub);
		return disabledSub;

	}
	
}
