package bestbuy_pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bestbuy_base.BestBuy_base_class;

public class Bestbuy_sells_page extends BestBuy_base_class{
	
	
	public Bestbuy_sells_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);		
	}
	public Bestbuy_sells_page Assertofsells() {
		Assert(driver.getTitle(), "Yes, Best Buy Sells That – Best Buy");
		return this;
	}
	

	@FindBy(xpath = "(//span[text()='More'])[1]")
	WebElement clickmenubutton;
	public Bestbuy_sells_page sells_moreclick() {
		action(clickmenubutton);
		return this;
	}
	@FindBy(xpath = "(//a[text()='Donate to St. Jude'])[2]")
	WebElement clickbutton;
	public Bestbuy_donate_page donateclick() {
		action(clickbutton);
		return new Bestbuy_donate_page(driver);
	}


}
