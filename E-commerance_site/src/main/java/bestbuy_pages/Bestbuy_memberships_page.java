package bestbuy_pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bestbuy_base.BestBuy_base_class;

public class Bestbuy_memberships_page extends BestBuy_base_class{
	
	public Bestbuy_memberships_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);		
	}
	public Bestbuy_memberships_page Assertofmembership() {
		Assert(driver.getTitle(), "My Best Buy Memberships");
		return this;
	}
	
	@FindBy(xpath = "(//a[text()='Credit Cards'])[1]")
	WebElement clickbutton;
	public Bestbuy_cerditcards_page creditcardsclick() {
		action(clickbutton);
		return new Bestbuy_cerditcards_page(driver);
	}

}
