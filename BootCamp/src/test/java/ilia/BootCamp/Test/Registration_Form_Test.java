package ilia.BootCamp.Test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import ilia.BootCamp.locators.HomeDepot_home_page;


public class Registration_Form_Test {
	public static WebDriver driver=null;
	
	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "F:\\Java Testing\\EclipseWorkspace\\New Selenium\\ChromeDriver\\chromedriver.exe");

	}
	@BeforeMethod
	public void beforeMethod() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	}
	@Test
	@Parameters ({"url", "email", "pass", "zip","phone"})
	public void test(String url, String email,
			String pass, String zip, String phone)  throws InterruptedException, IOException  {
		driver.get(url);
		HomeDepot_home_page make = new HomeDepot_home_page(driver);
		
		make.myAccountClick();
		Thread.sleep(300);
		Screenshot("0");
		make.registerClick();
		Thread.sleep(300);
		Screenshot("1");
		make.emailFill(email);
		make.passwordFill(pass);
		make.showPasswordClick();
		make.zipCodeFill(zip);
		make.phoneNumberFil(phone);
		make.phoneNumberVerifyClick();
		Screenshot("2");
		Thread.sleep(300);
		make.accountRegisterBtnClick();
		Thread.sleep(2500);
		Screenshot("3");
		make.refreshPage();
		Thread.sleep(2500);
		Screenshot("4");
		
	}
	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
	
	public static void Screenshot(String number) throws IOException {
		String directory="F:\\Java Testing\\Screenshot\\";
		
		File dirName=new File(directory+driver.getTitle()+" - "+number+".png");
		File sourcefile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				
		FileUtils.copyFile(sourcefile, dirName);
		Reporter.log("<br><img src='"+dirName+"'height='380' width='400'/><br>");
	}
	
}
