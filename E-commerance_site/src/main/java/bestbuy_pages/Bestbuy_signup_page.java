package bestbuy_pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bestbuy_base.BestBuy_base_class;

public class Bestbuy_signup_page extends BestBuy_base_class{
	@FindBy(xpath = "//input[@id='firstName']")
	WebElement accountfirstname;
	@FindBy(xpath = "//input[@id='lastName']")
	WebElement accountlastname;
	@FindBy(xpath = "//input[@id='email']")
	WebElement accountemail;
	@FindBy(xpath = "//input[@id='fld-p1']")
	WebElement accountpassword;
	@FindBy(xpath = "//input[@id='reenterPassword']")
	WebElement accountreenterpassword;
	@FindBy(xpath = "//input[@id='phone']")
	WebElement accountphone;
	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	WebElement checkbokclick;
	@FindBy(xpath = "//button[contains(text(),'Create an Account')]")
	WebElement createaccountclick;
	public Bestbuy_signup_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);		
	}
	public Bestbuy_signup_page firstname(String name) {
		sendkeys(accountfirstname, name);
		return this;
	}
	public Bestbuy_signup_page lastname(String name) {
		sendkeys(accountlastname, name);
		return this;
	}
	public Bestbuy_signup_page email(String name) {
		sendkeys(accountemail, name);
		return this;
	}
	public Bestbuy_signup_page password(String name) {
		sendkeys(accountpassword, name);
		return this;
	}
	public Bestbuy_signup_page confirompassword(String name) {
		sendkeys(accountreenterpassword, name);
		return this;
	}
	public Bestbuy_signup_page phonenumber(String name) {
		sendkeys(accountphone, name);
		return this;
	}
	public Bestbuy_signup_page checkbox() {
		click(checkbokclick);
		return this;
	}
	public Bestbuy_signup_page createaccountbutton() {
		click(createaccountclick);
		return this;
	}
	
	
	

}
