package bestbuy_pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bestbuy_base.BestBuy_base_class;

public class Bestbuy_login_page extends BestBuy_base_class{
	@FindBy(xpath = "//input[@id='fld-e']")
	WebElement emailid;
	@FindBy(xpath = "//input[@id='fld-p1']")
	WebElement password;
	@FindBy(xpath = "//button[contains(text(),'Sign In')]")
	WebElement clicksigin;
	public Bestbuy_login_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);		
	}
	public Bestbuy_login_page loginemailid(String name) {
		sendkeys(emailid, name);
		return this;
	}
	public Bestbuy_login_page loginpassword(String name) {
		sendkeys(password, name);
		return this;
	}
	public Bestbuy_login_page siginbutton() {
		action(clicksigin);
		return this;
	}
	


}
