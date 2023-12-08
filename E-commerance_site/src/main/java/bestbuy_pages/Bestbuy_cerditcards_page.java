package bestbuy_pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bestbuy_base.BestBuy_base_class;

public class Bestbuy_cerditcards_page extends BestBuy_base_class {
	
	public Bestbuy_cerditcards_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);		
	}
	public Bestbuy_cerditcards_page Assertofcerditcards() {
		Assert(driver.getTitle(), "Best Buy Credit Card: Rewards & Financing");
		return this;
	}
	

	@FindBy(xpath = "(//span[text()='More'])[1]")
	WebElement clickmenubutton;
	public Bestbuy_cerditcards_page moreclick() {
		action(clickmenubutton);
		return this;
	}
	@FindBy(xpath = "(//a[text()='Gift Cards'])[2]")
	WebElement clickbutton;
	public Bestbuy_giftcards_page giftcardsclick() {
		action(clickbutton);
		return new Bestbuy_giftcards_page(driver);
	}


}
