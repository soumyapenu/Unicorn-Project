package com.pages;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testbase.TestBase;

public class registrationPage extends TestBase {

	public registrationPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[contains(text(),'CLOSE')]")
	WebElement close;
	
	public void closeButton() {
		close.click();
	}
}
