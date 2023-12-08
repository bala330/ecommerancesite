package bestbuy_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bestbuy_base.BestBuy_base_class;

public class Bestbuy_addcart_Laptop_page extends BestBuy_base_class{
	
	public Bestbuy_addcart_Laptop_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);		
	}
	public Bestbuy_addcart_Laptop_page Assertoflaptop() {
		Assert(driver.getTitle(), "dell laptop - Best Buy");
		return this;
	}
    @FindBy(xpath = "(//p[text()='Shipping unavailable'])[3]")
    WebElement scrolldown;
    public  Bestbuy_addcart_Laptop_page Laptop_scrolldown() {
    	javascript(scrolldown);
    	return this;
    }
    @FindBy(xpath = "(//button[text()='Add to Cart'])[4]")
    WebElement clickaddcart;
    public Bestbuy_addcart_Laptop_page Laptop_Addcart() {
    	action(clickaddcart);
    	return this;
    }
    
    
   @FindBy(xpath="//button[@data-track='Attach Modal: Continue shopping']")
    WebElement contin;
   public Bestbuy_addcart_Laptop_page continueaddcart() {
    click(contin);
    	return this;
    }
    @FindBy(xpath = "//button[@aria-label='Menu']")
    WebElement menu;
    public Bestbuy_addcart_Laptop_page menubutton() {
    	click(menu);
    	return this;
    }
    @FindBy(xpath = "//button[text()='Outdoor Living']")
    WebElement scrooldown1;
    public Bestbuy_addcart_Laptop_page scrolldown_toygames() {
    	javascript(scrooldown1);
    	return this;
    }
    @FindBy(xpath = "//button[text()='Toys, Games & Collectibles']")
    WebElement clicktoysgames;
    public Bestbuy_addcart_Laptop_page toysgame() {
    	action(clicktoysgames);
    	return this;
    }
    @FindBy(xpath = "//button[text()='Games, Puzzles & Cards']")
    WebElement clickgamespuzzles;
    public Bestbuy_addcart_Laptop_page gamespuzzles() {
    	action(clickgamespuzzles);
    	return this;
    }
    @FindBy(xpath = "//a[text()='Games']")
    WebElement clickgames;
    public Bestbuy_toysgames_addcart_page games() {
    	click(clickgames);
    	return new Bestbuy_toysgames_addcart_page(driver);
    }
   
   

}
