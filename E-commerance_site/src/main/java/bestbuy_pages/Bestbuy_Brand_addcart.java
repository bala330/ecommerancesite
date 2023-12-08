package bestbuy_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bestbuy_base.BestBuy_base_class;

public class Bestbuy_Brand_addcart extends BestBuy_base_class{
	
	public Bestbuy_Brand_addcart(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);		
	}
	public Bestbuy_Brand_addcart Assertplaystation() {
		Assert(driver.getTitle(), "Sony PlayStation 5: PS5 - Best Buy");
		return this;
	}
	    @FindBy(xpath = "(//a[text()='PS5 accessories'])[1]")
	    WebElement access;
	    public Bestbuy_Brand_palystation_addcart ps5_access() {
	    	click(access);
	    	return new Bestbuy_Brand_palystation_addcart(driver);
	    }
	    

}
