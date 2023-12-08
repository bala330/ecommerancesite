package bestbuy_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import bestbuy_base.BestBuy_base_class;

public class Bestbuy_cardpayements_page  extends BestBuy_base_class{
	
	public Bestbuy_cardpayements_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='number']")
	WebElement number;
	public Bestbuy_cardpayements_page crediat_debit_cards(String name) {
		try {
			sendkeys(number, name);

		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return this;	
	}
	@FindBy(xpath = "//select[@id='expMonth']")
	WebElement month;
	public Bestbuy_cardpayements_page expmonth() {
		try {
			Select s=new Select(month);
			s.selectByValue("02");
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		return this;
	}
	@FindBy(xpath = "//select[@id='expYear']")
	WebElement year;
	public Bestbuy_cardpayements_page expyear() {
		try {
			Select s=new Select(year);
			s.selectByVisibleText("2027");
		}catch (Exception e) {
			
		}
		
		
		return this;
	}
	@FindBy(xpath = "//input[@id='cvv']")
	WebElement cvv;
	public Bestbuy_cardpayements_page cvvnumber(String name) {
		try {
			sendkeys(cvv, name);
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		return this;
	}
	@FindBy(xpath = "//input[@id='first-name']")
	WebElement name1;
	public Bestbuy_cardpayements_page firstname(String name) {
		try {
			sendkeys(name1, name);
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		return this;
	}
	@FindBy(xpath = "//input[@id='last-name']")
	WebElement name2;
	public Bestbuy_cardpayements_page lastname(String name) {
		try {
			sendkeys(name2, name);
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		return this;
	}
	@FindBy(xpath="//input[@id='address-input']")
	WebElement address;
	public Bestbuy_cardpayements_page address(String name) {
		try {
			sendkeys(address, name);
		}catch (Exception e) {
			// TODO: handle exception
		}

		
			
		return this;
	}
	@FindBy(xpath = "//input[@id='city']")
	WebElement city;
	public Bestbuy_cardpayements_page city(String name) {
		try {
			sendkeys(city, name);
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		return this;
	}
	@FindBy(xpath = "postalCode")
	WebElement pincode;
	public Bestbuy_cardpayements_page postalcode(String name) {
		try {
			sendkeys(pincode, name);
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		return this;
	}
	@FindBy(xpath = "//span[text()='Choose a donation amount:']")
    WebElement scrolldown;
	public Bestbuy_cardpayements_page scrolldown_payements() {
		try {
			javascript(scrolldown);
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		return this;
	}
		@FindBy(xpath = "//span[text()='Place Your Order']")
		WebElement order;
		public Bestbuy_cardpayements_page place_order() {
			try {
				action(order);
			}catch (Exception e) {
				// TODO: handle exception
			}

			
			
			return this;
		
	}

}
