package bestbuy_pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v113.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bestbuy_base.BestBuy_base_class;

public class Bestbuy_Home_page extends BestBuy_base_class {
	
	@FindBy(xpath = "//a[text()='Create Account']")
	WebElement clickcreateaccount1;
	
	

	public Bestbuy_Home_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);		
	}
	@FindBy(xpath = "//span[contains(text(),'Account')]")
	WebElement clickaccount;
	public Bestbuy_Home_page account() {
		javascript_click(clickaccount);
		return this;
	}
	public Bestbuy_signup_page createaccount() {
		action(clickcreateaccount1);
		return new Bestbuy_signup_page(driver);		
	}
	@FindBy(xpath = "//a[contains(text(),'Sign In')]")
	WebElement clicksigin;
	public Bestbuy_login_page clicksigin() {
		action(clicksigin);
		return new Bestbuy_login_page(driver);
		
	}
	@FindBy(xpath = "//input[@id='gh-search-input']")
	WebElement searchmaterial;
	public Bestbuy_Home_page search(String name) {
		sendkeys(searchmaterial, name);
		return this;
	}
	@FindBy(xpath = "(//button[@type='submit'])[1]")
	WebElement clickbutton;
    public Bestbuy_addcart_Laptop_page searchbutton() {
    	click(clickbutton);
    	return new Bestbuy_addcart_Laptop_page(driver);
    }
    @FindBy(xpath = "//a[text()='Holiday Deals']")
	WebElement clickholiday;
	public Bestbuy_Holidays_page holidaydealsclick() {
	     action(clickholiday);
		return new Bestbuy_Holidays_page(driver);
	}
	@FindBy(xpath = "//a[text()='CA Supply Chain Transparency Act']")
	WebElement scrolldown;
	public Bestbuy_valdiate_bottom_page scrolldownwebpage() {
    	javascript(scrolldown);
    	return new Bestbuy_valdiate_bottom_page(driver);
    }
	public Bestbuy_Home_page links() throws IOException {
		findelements();
		return this;
	}


	
}
