package bestbuy_pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bestbuy_base.BestBuy_base_class;

public class Bestbuy_checkout_pages extends BestBuy_base_class {
	
	public Bestbuy_checkout_pages(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//span[text()='Contact Information']")
	WebElement scrolldown;
	public Bestbuy_checkout_pages scrolldown_infromation() {
		javascript(scrolldown);
		return this;
	}
	@FindBy(xpath = "//input[@id='user.emailAddress']")
	WebElement username;
	public Bestbuy_checkout_pages Emailid(String name) {
		sendkeys(username, name);
		return this;
	}
	@FindBy(xpath = "//input[@id='user.phone']")
	WebElement phone;
	public Bestbuy_checkout_pages phonenumber(String name) {
		sendkeys(phone, name);
		return this;
	}
	@FindBy(xpath = "//input[@id='text-updates']")
	WebElement click;
    public Bestbuy_checkout_pages checkbox() {
    	click(click);
    	return this;
    }
    
    @FindBy(xpath = "//span[text()='Continue to Payment Information']")
    WebElement clickbutton;
    public Bestbuy_cardpayements_page clickcontinue() {
    	click(clickbutton);
    	return new Bestbuy_cardpayements_page(driver);
    }
    public Bestbuy_cardpayements_page closebrowser1() {
    	closebrowser();
    	return new Bestbuy_cardpayements_page(driver);
    }

}
