package com.testcases;


import java.io.IOException;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.pages.AgencyDetailsPage;
import com.pages.CheckBoxPage;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.RemxPropertiesPage;
import com.pages.aboutYourselfPage;
import com.pages.registrationPage;
import com.testbase.TestBase;

public class UniCornTest extends TestBase {
LoginPage login;
AgencyDetailsPage AGDetails;
aboutYourselfPage abYours;
registrationPage rgpage;
HomePage homepage;
RemxPropertiesPage remixproperty;
CheckBoxPage CkBoxPage;
	
public UniCornTest() throws IOException {
 super();
 }

@BeforeMethod	
 public void SetUp() throws IOException {
	 InitializeProp();
	 login=new LoginPage();
	 AGDetails=new AgencyDetailsPage();
	 abYours=new aboutYourselfPage();
	 homepage=new HomePage();
	 remixproperty=new RemxPropertiesPage();
	 CkBoxPage=new CheckBoxPage();
			 }

/*@Test(priority = 1)
public void Testcase() throws IOException, InterruptedException {
	login.SigninClick();
	AGDetails.Enterdetails();
	AGDetails.businessDropdwn();
	AGDetails.businessSell();
	AGDetails.businessLocationTypes();
	AGDetails.businessCityDrpdwn();
	JavascriptExecutor js = (JavascriptExecutor)driver;  
	js.executeScript("scrollBy(0, 4500)");  
	AGDetails.totalEmployee();
	AGDetails.nextButtonClk();
	abYours.aboutYourselfDetails();
	rgpage=new registrationPage();
	Thread.sleep(200);
	rgpage.closeButton();
}

@Test(priority = 2)
public void  TestCase2() {
	login.SigninClick();
	AGDetails.Enterdetails();
	AGDetails.businessDropdwn();
	AGDetails.businessSell();
	AGDetails.businessLocationTypes();
	AGDetails.businessCityDrpdwn();
	JavascriptExecutor js = (JavascriptExecutor)driver;  
	js.executeScript("scrollBy(0, 4500)");  
	AGDetails.totalEmployee();
	AGDetails.nextButtonClk();
	
	boolean expected=abYours.ValidateTextmsg();
	boolean actual=true;
	Assert.assertEquals(actual, expected);
	
	boolean expected1=abYours.lastNameValidate();
	boolean actual1=true;
	Assert.assertEquals(actual1, expected1);
	
	boolean expected2=abYours.emailValidate();
	boolean actual2=true;
	Assert.assertEquals(actual2, expected2);
	
	boolean expected3=abYours.submitDisabled();
	boolean actual3=true;
	Assert.assertEquals(actual3, expected3);
	
}

@Test(priority = 3)
public void pincodeValidate() throws InterruptedException {
	login.SigninClick();
	boolean expected=AGDetails.validateAgencyDetails();
	boolean actual=true;
	Assert.assertEquals(actual, expected);
	
	boolean expected1=AGDetails.validateAgencyAdress();
	boolean actual1=true;
	Assert.assertEquals(actual1, expected1);
	
	boolean expected2=AGDetails.validateCitydetails();
	boolean actual2=true;
	Assert.assertEquals(actual2, expected2);
	
	boolean expected3=AGDetails.validatepincode();
	boolean actual3=true;
	Assert.assertEquals(actual3, expected3);
	
	AGDetails.validPincode();
	
	boolean expected4=AGDetails.disableNext();
	boolean actual4=true;
	Assert.assertEquals(actual4, expected4);
	}*/

@Test(priority=4)
public void dealDetailsSec() throws InterruptedException {
login.clickonSignin();
homepage.newDealpage();
remixproperty.propertyType();
remixproperty.transcitionType();
remixproperty.clickOnCash();
remixproperty.salesLoanAmount();
Thread.sleep(2000);
remixproperty.LoanAmount();
remixproperty.cashFinance();
//remixproperty.FinanceInstituteType();
remixproperty.contactDetails();
JavascriptExecutor js = (JavascriptExecutor)driver;  
js.executeScript("scrollBy(0, 500)");  
remixproperty.propertyDeatils();
remixproperty.validDetails();
//remixproperty.ClickOnState();
remixproperty.propertyDetailsData();
remixproperty.uploadFile();

JavascriptExecutor js1 = (JavascriptExecutor)driver;  
js1.executeScript("scrollBy(0, 4000)"); 

boolean expectedres=remixproperty.clickonIndividualbtn();
boolean actualres=true;
Assert.assertEquals(actualres, expectedres);
//driver.get("https://trainee-web-app.azurewebsites.net/orders/a25e0948-17a7-4546-b2ed-4269dfaa31e8/file-setup/order-entry?address=19-103%20integer%20rd,%20stroudsburg,%20NY&fileNumber=658&cashClosing=Cash&transactionType=Purchase&id=a25e0948-17a7-4546-b2ed-4269dfaa31e8&orderGuid=a25e0948-17a7-4546-b2ed-4269dfaa31e8");
remixproperty.clickonorgBtn();
remixproperty.Testcase();


}

/*@Test(priority=5)
public void dealDetails() throws InterruptedException {
login.clickonSignin();
homepage.newDealpage();
remixproperty.ClickOnMap();
CkBoxPage.clickonchckbox1();
boolean expected1=CkBoxPage.validateMap();
boolean actual1=true;
Assert.assertEquals(actual1, expected1);
CkBoxPage.largermap();
}


@Test(priority=6)
public void registeruser() throws InterruptedException {
login.clickonSignin();
Thread.sleep(2000);
homepage.newDealpage();

boolean expected1=remixproperty.validRegisteruser();
boolean actual1=true;
Assert.assertEquals(actual1, expected1);
Thread.sleep(2000);

remixproperty.dealAgentMblNo();
Thread.sleep(2000);

remixproperty.dealAgentMblNo2();
JavascriptExecutor js = (JavascriptExecutor)driver;  
js.executeScript("scrollBy(0, 4500)");

boolean expected4=remixproperty.submitisDisabled();
boolean actual4=true;
Assert.assertEquals(actual4, expected4);
}

@Test(priority=7)
public void newDeal() throws InterruptedException {
	login.clickonSignin();
	Thread.sleep(2000);
	homepage.dealCase();
	}

@Test(priority=8)
public void newDeal2() {
	login.clickonSignin();
	
	homepage.validateProperties();
	
	homepage.validatePropDeal();
	
	boolean expected=homepage.disabledCreateNew();
	boolean actual=false;
	Assert.assertEquals(actual, expected);
	}

@AfterMethod
public void closebrowser() {
	driver.quit();
}*/

}