package bestbuy_pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bestbuy_base.BestBuy_base_class;



public class Bestbuy_outlet_page extends BestBuy_base_class{
	
	
	public Bestbuy_outlet_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);		
	}
	public Bestbuy_outlet_page Assertofoutlet() {
		Assert(driver.getTitle(), "Best Buy Outlet: Clearance Electronics Outlet Store – Best Buy");
		return this;
	}
	

	@FindBy(xpath = "(//span[text()='More'])[1]")
	WebElement clickmenubutton;
	public Bestbuy_outlet_page outlet_moreclick() {
		action(clickmenubutton);
		return this;
	}
	@FindBy(xpath = "(//a[text()='Best Buy Business'])[2]")
	WebElement clickbutton;
	public Bestbuy_business_page bussinessclick() {
		action(clickbutton);
		return new Bestbuy_business_page(driver);
	}

}
