package ilia.BootCamp.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeDepot_home_page {
	
	public static WebDriver driver=null;
	
	@FindBy (linkText="My Account")
	WebElement myAccountLink;
	
	@FindBy (linkText="Register")
	WebElement registerButton;
	
	@FindBy (xpath="(//input[@id='email_id'])[2]")
	WebElement emailField;
	
	@FindBy (id="registrationPassword")
	WebElement passwordField;
	
	@FindBy(id="showPasswordCheck")
	WebElement showPassword;
	
	@FindBy (id="zipcode")
	WebElement zipCodeField;
	
	@FindBy (id="phoneNumber")
	WebElement phoneNumberField;
	
	@FindBy (xpath="//div[@class='checkbox-btn body__m-top-large registerSetPwd']")
	WebElement phoneNumberVerifyCheck;
	
	@FindBy (id="accountRegister")
	WebElement accountRegisterButton;
	
	public HomeDepot_home_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void myAccountClick() {
		myAccountLink.click();		
	}
	public void registerClick() {
		registerButton.click();
	}
	public void emailFill(String email) {
		//driver.switchTo().alert();
		emailField.sendKeys(email);
	}
	public void passwordFill(String pass) {
		passwordField.sendKeys(pass);
	}
	public void showPasswordClick() {
		showPassword.click();
	}
	public void zipCodeFill(String zip) {
		zipCodeField.sendKeys(zip);
	}
	public void phoneNumberFil(String phone) {
		phoneNumberField.sendKeys(phone);
		}
	public void phoneNumberVerifyClick() {
		phoneNumberVerifyCheck.click();
	}
	public void accountRegisterBtnClick() {
		accountRegisterButton.click();
	}
	public void refreshPage() {
		driver.navigate().refresh();
	}
	
}
