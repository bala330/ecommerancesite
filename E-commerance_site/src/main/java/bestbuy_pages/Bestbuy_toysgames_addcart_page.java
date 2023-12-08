package bestbuy_pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bestbuy_base.BestBuy_base_class;

public class Bestbuy_toysgames_addcart_page extends BestBuy_base_class{
	
	public Bestbuy_toysgames_addcart_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);		
	}
	public Bestbuy_toysgames_addcart_page Assertofgames() {
		Assert(driver.getTitle(), "Games - Best Buy");
		return this;
	}
	 @FindBy(xpath = "(//div[@style='position:relative'])[4]")
	    WebElement scrolldown1;
	    public  Bestbuy_toysgames_addcart_page scrolldown_toysgames() {
	    	javascript(scrolldown1);
	    	return this;
	    }
	    @FindBy(xpath = "(//div[@style='position:relative'])[5]")
	    WebElement addcart1;
	    public Bestbuy_toysgames_addcart_page addcart_toysgames() {
	    	action(addcart1);
	    	return this;
	    }
	    @FindBy(xpath="//*[@id=\"attach-modal-drawer-overlay-backdrop\"]/div/div[1]/button")
	    WebElement conti1;
	    public Bestbuy_toysgames_addcart_page continue_toysgames() {
	    	click(conti1);
	    	return this;
	    }
	 
	    @FindBy(xpath = "//button[@aria-label='Menu']")
	    WebElement menu1;
	    public Bestbuy_toysgames_addcart_page menubrand() {
	    	click(menu1);
	    	return this;
	    }
	    @FindBy(xpath = "(//button[@class='c-button-unstyled top-four v-fw-medium'])[3]")
	    WebElement clickbrands;
	    public Bestbuy_toysgames_addcart_page brands() {
	    	action(clickbrands);
	    	return this;
	    }
		 @FindBy(xpath = "//a[text()='PlayStation']")
		    WebElement clickplaystation;
		    public Bestbuy_Brand_addcart playstations() {
		    	action(clickplaystation);
		    	return new Bestbuy_Brand_addcart(driver);
		    }


}
