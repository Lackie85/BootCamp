package ilia.BootCamp.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Expedia_SB_cardInformation {
	public static WebDriver driver=null;
	
	@FindBy (xpath="//input[@data-tealeaf-error-id='9005']")
	WebElement cardHolderName;
	
	@FindBy (id="creditCardInput")
	WebElement cardNumber;
	
	@FindBy (xpath="//select[@name='creditCards[0].expiration_month']")
	WebElement cardExpMonth;
	
	@FindBy (xpath="//select[@name='creditCards[0].expiration_year']")
	WebElement cardExpYear;
	
	@FindBy (id="new_cc_security_code")
	WebElement cardSecureNumber;
	
	@FindBy (xpath="//input[@name='creditCards[0].street']")
	WebElement billingStreet;
	
	@FindBy (xpath="//input[@name='creditCards[0].city']")
	WebElement billingCity;
	
	@FindBy (xpath="//select[@name='creditCards[0].state']")
	WebElement billingState;
	
	@FindBy (xpath="//input[@name='creditCards[0].zipcode']")
	WebElement billingZip;
	
	@FindBy (xpath="(//input[@name='email'])[2]")
	WebElement emailFill;
	
	public Expedia_SB_cardInformation  (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void cardHolderNameSend (String chName) {
		cardHolderName.sendKeys(chName);
	}
	public void cardNumberSend(String cNumber) {
		cardNumber.sendKeys(cNumber);
	}
	public void cardExpMonthSelect () {
		Select expMon=new Select (cardExpMonth);
		expMon.selectByValue("11");
	}
	public void cardExpYearSelect() {
	Select expYear=new Select(cardExpYear);
	expYear.selectByValue("2023");
	}
	public void cardSecureNumberSend () {
		cardSecureNumber.sendKeys("123");
		}
	public void billingStreetSend() {
		billingStreet.sendKeys("123 Billing Street");
			}
	public void billingCitySend() {
		billingCity.sendKeys("BillingCity");
			
	}
	public void billingStateSelect() {
		Select state=new Select(billingState);
		state.selectByVisibleText("MA");
		}
	public void billingZipSend() {
		billingZip.sendKeys("12345");
	}
	public void emailFillSend() {
		emailFill.sendKeys("emailTest@test.com");
	}


}
