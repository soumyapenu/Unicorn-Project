package com.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import com.testbase.TestBase;

public class CheckBoxPage extends TestBase{

	public CheckBoxPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//label[@class='d-flex align-items-center']")
	 WebElement checkbox1;
	
	 @FindBy(xpath="//div[@class='checkbox disabled']")
	 WebElement checkbox2;
	 
	 @FindBy(xpath="/html/body/app-root/app-layout/div/main/app-landing/div/app-map/div/div[1]/div/div[2]/label")
	 WebElement checkbox3;
	 
	 @FindBy(xpath="//a[contains(text(),'View larger map')]")
	 WebElement largerMap;
	 
	 @FindBy(tagName="iframe")
     WebElement frame;	 
	 public void clickonchckbox1() {
		 driver.manage().window().maximize();
		 checkbox1.click();
		 checkbox2.isDisplayed();
		 checkbox3.click();
		 checkbox2.isDisplayed();
		 driver.switchTo().frame(frame);
		 	 
		}
	 
	 public boolean validateMap() {
		 boolean largermapisPresent=largerMap.isDisplayed();
		 System.out.println("LarerMap is present=" +largermapisPresent);
		 return largermapisPresent;	
	 }
	 public void largermap() {
		 largerMap.click();
		}


}
