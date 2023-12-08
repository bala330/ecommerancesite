package bestbuy_pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bestbuy_base.BestBuy_base_class;

public class Bestbuy_DealofDay_page extends BestBuy_base_class {
	
	
	public Bestbuy_DealofDay_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);		
	}

	public Bestbuy_DealofDay_page Assertofdealofday() {
		Assert(driver.getTitle(), "Deal of the Day: Electronics Deals - Best Buy");
		return this;
	}
	

	@FindBy(xpath = "(//a[text()='My Best Buy Memberships'])[1]")
	WebElement clickbutton;
	public Bestbuy_memberships_page membershipsofclick() {
		action(clickbutton);
		return new Bestbuy_memberships_page(driver);
	}


}
