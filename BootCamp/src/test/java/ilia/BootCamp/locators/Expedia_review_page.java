package ilia.BootCamp.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Expedia_review_page {
	public static WebDriver driver=null;
	
	@FindBy (xpath="//button[@class='btn-primary btn-action bookButton']")
	WebElement continueBookingBtn;
	
	public Expedia_review_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void continueBookingBtnClick() {
		continueBookingBtn.click();
	}

}
