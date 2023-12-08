package bestbuy_pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import bestbuy_base.BestBuy_base_class;


public class Bestbuy_business_page extends BestBuy_base_class{
	
	public Bestbuy_business_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);		
	}
	public Bestbuy_business_page Assertofbusiness() {
		Assert(driver.getTitle(), "Best Buy for Business - Best Buy");
		return this;
	}
	


}
