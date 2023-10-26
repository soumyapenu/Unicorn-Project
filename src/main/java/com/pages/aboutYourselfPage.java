package com.pages;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.testbase.TestBase;

public class aboutYourselfPage extends TestBase {

	public aboutYourselfPage() throws IOException {
		super();
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@id='firstName']")
	WebElement firstName;
	
	@FindBy(xpath="//div[contains(text(), 'Please enter first name')]")
	WebElement fisrtNameval;
	
	@FindBy(xpath="//input[@id='lastName']")
	WebElement lastName;
	
	@FindBy(xpath="//div[contains(text(), 'Please enter last name')]")
	WebElement lastNameval;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement email;
	
	@FindBy(xpath="//div[contains(text(), ' Please enter your email address.')]")
	WebElement emailval;
	
	@FindBy(xpath="//button[contains(text(),'SUBMIT')]")
	WebElement submit;
	
	public void aboutYourselfDetails() {
		firstName.sendKeys("xyz");
		lastName.sendKeys("xyz");
		email.sendKeys("xyz@gmail.com");
		submit.click();
	}
	
	public boolean ValidateTextmsg() {
		firstName.sendKeys(Keys.TAB);
		boolean validate=fisrtNameval.isDisplayed();
		System.out.println("Validate error1 is =" +validate);
		return validate;
		}
	
	public boolean lastNameValidate() {
		lastName.sendKeys(Keys.TAB);
		boolean validate2=lastNameval.isDisplayed();
		System.out.println("Validate error2 is =" +validate2);
		return validate2;
		}
	

	public boolean emailValidate() {
		email.sendKeys(Keys.TAB);
		boolean validate3=emailval.isDisplayed();
		System.out.println("Validate error3 is =" +validate3);
		return validate3;
		}
	
	public boolean submitDisabled() {
		boolean validate4=submit.isDisplayed();
		System.out.println("Validate error4 is =" +validate4);
		return validate4;
	}
}

