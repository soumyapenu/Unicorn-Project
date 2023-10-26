package com.pages;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.testbase.TestBase;

public class LoginPage extends TestBase{

	public LoginPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@class='btn btn-lg btn-outline-secondary signUp_btn' and @type='submit']")
    WebElement SignIn;
	
	public void SigninClick() {
		SignIn.click();
	}
	
	
	
	
	
	@FindBy(xpath="//input[@id='inputUserName']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='inputPassword']")
	WebElement password;
	
	@FindBy(xpath="//button[contains(text(), 'SIGN IN')]")
	WebElement signin;
	
	public void clickonSignin() {
		username.sendKeys("test@test.com");
		password.sendKeys("test");
		signin.click();
	}
	
}
