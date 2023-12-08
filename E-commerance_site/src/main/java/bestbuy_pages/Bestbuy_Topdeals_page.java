package bestbuy_pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bestbuy_base.BestBuy_base_class;

public class Bestbuy_Topdeals_page extends BestBuy_base_class {
	
	public Bestbuy_Topdeals_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);		
	}

	public Bestbuy_Topdeals_page Assertoftopdeals() {
		Assert(driver.getTitle(), "Top Deals and Featured Offers on Electronics - Best Buy");
		return this;
	}
	

	@FindBy(xpath = "//a[text()='Deal of the Day']")
	WebElement clickbutton;
	public Bestbuy_DealofDay_page dealofdayclick() {
		action(clickbutton);
		return new Bestbuy_DealofDay_page(driver);
	}

}
