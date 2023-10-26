package com.testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
 
public static Properties prop;
public static WebDriver driver;

	public TestBase() throws IOException {
		try {
		prop=new Properties();
		FileInputStream ip=new FileInputStream("C:\\Users\\supriya.kommula\\eclipse-workspace\\.metadata\\UniCornProj\\src\\main\\resources\\config.properties");
		prop.load(ip); }
		catch(FileNotFoundException e) {
			e.printStackTrace(); }
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void InitializeProp() {
		String browserName= prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\supriya.kommula\\chromedriver_win32 (2)\\chromedriver.exe");
		driver=new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(500, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
	
		driver.navigate().to(prop.getProperty("url"));
	}
}
