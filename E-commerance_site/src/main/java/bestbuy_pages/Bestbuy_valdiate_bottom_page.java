package bestbuy_pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bestbuy_base.BestBuy_base_class;

public class Bestbuy_valdiate_bottom_page extends BestBuy_base_class{
	
	@FindBy(xpath = "//a[text()='State Privacy Rights']")
	WebElement click;
	public Bestbuy_valdiate_bottom_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);		
	}
        public Bestbuy_valdiate_bottom_page clicklastelement() {
    	click(click);
    	return this;
    }
        public Bestbuy_valdiate_bottom_page Assertofbootomlink() {
        	Assert(driver.getTitle(), "State Privacy Rights - Best Buy");
        	return this;
        }
   

}
