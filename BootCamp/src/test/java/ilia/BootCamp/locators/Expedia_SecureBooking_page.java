package ilia.BootCamp.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Expedia_SecureBooking_page {
	
	public static WebDriver driver=null;
	
	@FindBy (id="firstname[0]")
	WebElement firstNameFill0;
	
	@FindBy (id="lastname[0]")
	WebElement lastNameFill0;
	
	@FindBy (id="phone-number[0]")
	WebElement phoneNumberFill0;
	
	@FindBy (id="gender_male[0]")
	WebElement genderMale0;
	
	@FindBy (id="date_of_birth_month0")
	WebElement birthMonth0;
	
	@FindBy (id="date_of_birth_day[0]")
	WebElement birthDay0;
	
	@FindBy (id="date_of_birth_year[0]")
	WebElement birthYear0;
	
	@FindBy (id="firstname[1]")
	WebElement firstNameFill1;
	
	@FindBy (id="lastname[1]")
	WebElement lastNameFill1;
	
//	@FindBy (id="phone-number[1]")
//	WebElement phoneNumberFill1;
	
	@FindBy (id="gender_female[1]")
	WebElement genderFemale1;
	
	@FindBy (id="date_of_birth_month1")
	WebElement birthMonth1;
	
	@FindBy (id="date_of_birth_day[1]")
	WebElement birthDay1;
	
	@FindBy (id="date_of_birth_year[1]")
	WebElement birthYear1;
	
	@FindBy (id="firstname[2]")
	WebElement firstNameFill2;
	
	@FindBy (id="lastname[2]")
	WebElement lastNameFill2;
	
//	@FindBy (id="phone-number[2]")
//	WebElement phoneNumberFill2;
	
	@FindBy (id="gender_male[2]")
	WebElement genderMale2;
	
	@FindBy (id="date_of_birth_month2")
	WebElement birthMonth2;
	
	@FindBy (id="date_of_birth_day[2]")
	WebElement birthDay2;
	
	@FindBy (id="date_of_birth_year[2]")
	WebElement birthYear2;
	
	@FindBy (xpath="//div[@class='one-plan-CTA']")
	WebElement yesEnsuranse;
	
		
	@FindBy (xpath="(//input[@name='password'])[2]")
	WebElement passwordFill;
	
	@FindBy (xpath="//input[@name='repeat_password']")
	WebElement passwordRepeatFill;
	
	public Expedia_SecureBooking_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//Passenger 1St Adult
	public void firstNameFill0Send(String fNameMale) {
		firstNameFill0.sendKeys(fNameMale);
	}
	public void lastNameFill0Send (String lNameMale) {
		lastNameFill0.sendKeys(lNameMale);
	}
	public void phoneNumberFill0Send  (String pNumberMale) {
		phoneNumberFill0.sendKeys(pNumberMale);
	}
	public void genderMale0Click() {
		genderMale0.click();
	}
	public void birthMonth0Select () {
		Select bMonth0=new Select (birthMonth0);
		bMonth0.selectByValue("10");
			}
	public void birthDay0Select() {
		Select bDay0=new Select(birthDay0);
		bDay0.selectByValue("31");
	}
	public void birthYear0Select () {
		Select bYear0=new Select(birthYear0);
		bYear0.selectByValue("1985");
	}
	//Passenger 2nd Adult 
	public void firstNameFill1Send(String fNameFemale) {
		firstNameFill1.sendKeys(fNameFemale);
	}
	public void lastNameFill1Send (String lNameFemale) {
		lastNameFill1.sendKeys(lNameFemale);
			}
	
	public void genderFemale1Click() {
		genderFemale1.click();
	}
	public void birthMonth1Select () {
		Select bMonth1=new Select (birthMonth1);
		bMonth1.selectByValue("01");
			}
	public void birthDay1Select() {
		Select bDay1=new Select(birthDay1);
		bDay1.selectByValue("20");
	}
	public void birthYear1Select () {
		Select bYear1=new Select(birthYear1);
		bYear1.selectByValue("1984");
	}
	//Passenger 3rd Child
	public void firstNameFill2Send(String fNameChild) {
		firstNameFill2.sendKeys(fNameChild);
	}
	public void lastNameFill2Send (String lNameChild) {
		lastNameFill2.sendKeys(lNameChild);
			}
	
	public void genderMale2Click() {
		genderMale2.click();
	}
	public void birthMonth2Select () {
		Select bMonth2=new Select (birthMonth2);
		bMonth2.selectByValue("02");
			}
	public void birthDay2Select() {
		Select bDay2=new Select(birthDay2);
		bDay2.selectByValue("18");
	}
	public void birthYear2Select () {
		Select bYear2=new Select(birthYear2);
		bYear2.selectByValue("2016");
	}
	public void yesEnsuranseClick() {
		yesEnsuranse.click();
	}
	public void passwordFillSend() {
		passwordFill.sendKeys("Password123[]");
		}
	public void passwordRepeatSend(){
		passwordRepeatFill.sendKeys("Password123[]");
	}
	

}
	
	
	


