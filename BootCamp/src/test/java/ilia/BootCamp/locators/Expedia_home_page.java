package ilia.BootCamp.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Expedia_home_page {
	public static WebDriver driver=null;
	
	@FindBy(id="tab-flight-tab-hp")
	WebElement flightsTab;
	
	@FindBy(xpath="//input[@data-tooltip-id='typeaheadDataPlain']")
	WebElement flyingFrom;
	
	@FindBy(xpath="//input[@data-gcw-field-type='destination']")
	WebElement flyingTo;
	
	@FindBy(id="flight-departing-hp-flight")
	WebElement departingTab;
	
	@FindBy(xpath="(//button[@data-day='25'])[2]")
	WebElement departingDate;
	
	@FindBy(id="flight-returning-hp-flight")
	WebElement returningTab;
	
	@FindBy(xpath="//button[@data-day='13']")
	WebElement returningDate;
	
	@FindBy(xpath="//button[@data-gcw-component='gcw-traveler-amount-select']")
	WebElement travelersAmountBtn;
	
	@FindBy(xpath="(//button[@class='uitk-step-input-button uitk-step-input-plus'])[1]")
	WebElement travelersAduldAdd;
	
	@FindBy(xpath="(//button[@class='uitk-step-input-button uitk-step-input-plus'])[2]")
	WebElement travelersChildAdd;
	
	@FindBy(xpath="(//select[@id='flight-age-select-1-hp-flight'])[1]")
	WebElement travelersChildAge;
	
	@FindBy (xpath="//button[@class='close btn-text']")
	WebElement travelersClose;
	
	@FindBy (xpath="(//button[@class='btn-primary btn-action gcw-submit'])[1]")
	WebElement searchButton;
	
	public Expedia_home_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void flightsTabClick() {
		flightsTab.click();
	}
	public void flyingFromNote(String flyFrom) {
		flyingFrom.sendKeys(flyFrom);
	}
	public void flyingToNote(String flyTo) {
		flyingTo.sendKeys(flyTo);
	}
	public void departingTabClick() {
		departingTab.click();
	}
	public void departingDateClick() {
		departingDate.click();
	}
	public void returningTabClick() {
		returningTab.click();
	}
	public void returningDateClick() {
		returningDate.click();
	}
	public void travelersAmntBtnClick() {
		travelersAmountBtn.click();
	}
	public void travelersAdultAddClick() {
		travelersAduldAdd.click();
	}
	public void travelersChildAddClick() {
		travelersChildAdd.click();
	}
	public void travelersChildSelectAge() {
		Select age=new Select(travelersChildAge);
		age.selectByVisibleText("3");
	}
	public void travelersCloseClick() {
		travelersClose.click();
	}
	public void searchButtonClick() {
		searchButton.click();
	}
	
	

}
