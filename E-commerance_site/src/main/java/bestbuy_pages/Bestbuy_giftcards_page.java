package bestbuy_pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bestbuy_base.BestBuy_base_class;

public class Bestbuy_giftcards_page extends BestBuy_base_class{
	
	
	public Bestbuy_giftcards_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);		
	}
	public Bestbuy_giftcards_page Assertofgiftcards() {
		Assert(driver.getTitle(), "Gifts Cards and E-Gift Cards - Best Buy");
		return this;
	}
	

	@FindBy(xpath = "(//span[text()='More'])[1]")
	WebElement clickmenubutton;
	public Bestbuy_giftcards_page gift_moreclick() {
		action(clickmenubutton);
		return this;
	}
	@FindBy(xpath = "(//a[text()='Gift Ideas'])[2]")
	WebElement clickbutton;
	public Bestbuy_giftideas_page giftideasclick() {
		action(clickbutton);
		return new Bestbuy_giftideas_page(driver);
	}


}
