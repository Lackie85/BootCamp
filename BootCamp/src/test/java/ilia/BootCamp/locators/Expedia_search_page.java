package ilia.BootCamp.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Expedia_search_page {
	public static WebDriver driver=null;
	
	@FindBy (xpath="(//button[@class='btn-secondary btn-action t-select-btn'])[1]")
	WebElement selectTripButton;
	
	@FindBy (id="forcedChoiceNoThanks")
	WebElement noThanks;
	
	public Expedia_search_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void selectButtonClick() {
		selectTripButton.click();
	}
	public void noThanksClick() throws InterruptedException {
		noThanks.click();
	}
	

}
