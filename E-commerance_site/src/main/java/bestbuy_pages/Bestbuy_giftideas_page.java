package bestbuy_pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bestbuy_base.BestBuy_base_class;

public class Bestbuy_giftideas_page extends BestBuy_base_class {
	
	public Bestbuy_giftideas_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);		
	}
	public Bestbuy_giftideas_page Assertofgiftideas() {
		Assert(driver.getTitle(), "Gift Ideas 2023: Best Gifts to Give This Year - Best Buy");
		return this;
	}
	

	@FindBy(xpath = "(//span[text()='More'])[1]")
	WebElement clickmenubutton;
	public Bestbuy_giftideas_page gift_ideas_moreclick() {
		action(clickmenubutton);
		return this;
	}
	@FindBy(xpath = "(//a[text()='Yes, Best Buy Sells That'])[2]")
	WebElement clickbutton;
	public Bestbuy_sells_page sellsclick() {
		action(clickbutton);
		return new Bestbuy_sells_page(driver);
	}


}
