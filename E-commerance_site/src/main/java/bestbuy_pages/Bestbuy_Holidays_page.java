package bestbuy_pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bestbuy_base.BestBuy_base_class;

public class Bestbuy_Holidays_page extends BestBuy_base_class{
	
	public Bestbuy_Holidays_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);		
	}
	public Bestbuy_Holidays_page Assertofholidayspage() {
		Assert(driver.getTitle(), "Sales and Promotions at Best Buy: On Sale Electronics, Coupons and Promo Codes");
		return this;
	}
	

	@FindBy(xpath = "//a[text()='Top Deals']")
	WebElement clickbutton;
	public Bestbuy_Topdeals_page topdealsclick() {
		action(clickbutton);
		return new Bestbuy_Topdeals_page(driver);
	}

}
