package bestbuy_pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bestbuy_base.BestBuy_base_class;

public class Bestbuy_Checkout_addcart_page extends BestBuy_base_class{
	
	public Bestbuy_Checkout_addcart_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public Bestbuy_Checkout_addcart_page Assertofcart() {
		Assert(driver.getTitle(), "Cart - Best Buy");
		return this;
	}
	
	@FindBy(xpath = "//button[text()='Checkout']")
	WebElement checkout;
	public Bestbuy_sigin_addcart_page checkoutbutton() {
		action(checkout);
		return new Bestbuy_sigin_addcart_page(driver);
	}

}
