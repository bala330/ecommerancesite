package bestbuy_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bestbuy_base.BestBuy_base_class;

public class Bestbuy_sigin_addcart_page extends BestBuy_base_class {
	public Bestbuy_sigin_addcart_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//button[text()='Continue as Guest']")
	WebElement guest;
	public Bestbuy_checkout_pages guestbutton() {
		action(guest);
		return  new Bestbuy_checkout_pages(driver);
	}
	

}
