package bestbuy_pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bestbuy_base.BestBuy_base_class;

public class Bestbuy_donate_page extends BestBuy_base_class{
	
	public Bestbuy_donate_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);		
	}
	public Bestbuy_donate_page Assertofdonate() {
		Assert(driver.getTitle(), "St. Jude Children's Research Hospital - Best Buy");
		return this;
	}
	

	@FindBy(xpath = "(//span[text()='More'])[1]")
	WebElement clickmenubutton;
	public Bestbuy_donate_page donate_moreclick() {
		action(clickmenubutton);
		return this;
	}
	@FindBy(xpath = "(//a[text()='Best Buy Outlet'])[2]")
	WebElement clickbutton;
	public Bestbuy_outlet_page outletclick() {
		action(clickbutton);
		return new Bestbuy_outlet_page(driver);
	}



}
