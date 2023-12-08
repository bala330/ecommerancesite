package bestbuy_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bestbuy_base.BestBuy_base_class;

public class Bestbuy_Brand_palystation_addcart extends BestBuy_base_class{
	public Bestbuy_Brand_palystation_addcart(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);		
	}
	public Bestbuy_Brand_palystation_addcart Assertofps5access() {
		Assert(driver.getTitle(), "PS5 Accessories - Best Buy");
		return this;
	}
	 @FindBy(xpath = "(//p[text()='Shipping unavailable'])[1]")
	    WebElement scrolldown2;
	    public Bestbuy_Brand_palystation_addcart scrolldown_samsung() {
	    	javascript(scrolldown2);
	    	return this;
	    }
	    @FindBy(xpath = "(//button[@data-button-state='ADD_TO_CART'])[2]")
	    WebElement addcart2;
	    public Bestbuy_Brand_palystation_addcart addcart_playstation() {
	    	action(addcart2);
	    	return this;
	    }
	    @FindBy(xpath="//a[text()='Go to Cart']")
	    WebElement clickcart;
	    public Bestbuy_Checkout_addcart_page goto_cart() {
	    	action(clickcart);
	    	return new Bestbuy_Checkout_addcart_page(driver);
	    }
}
